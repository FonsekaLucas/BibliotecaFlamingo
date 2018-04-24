package br.com.flamingo.biblioteca.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.flamingo.biblioteca.domain.Livro;
import br.com.flamingo.biblioteca.service.LivroService;

@Controller
public class RegisterLivroController {
	
	@Autowired
	private LivroService livroService;
	
	@RequestMapping(value="/registerlivro", method = RequestMethod.GET)
	public ModelAndView registerLivro(){
		ModelAndView modelAndView = new ModelAndView();
		Livro livro = new Livro();
		modelAndView.addObject("livro", livro);
		modelAndView.setViewName("registerlivro");
		return modelAndView;
	}
	
	@RequestMapping(value="/registerlivro", method = RequestMethod.POST)
	public ModelAndView addNewLivro(@Valid Livro livro, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		Livro livroExistente = livroService.findLivroByTitulo(livro.getTitulo());
		if (livroExistente != null) {
			bindingResult
					.rejectValue("titulo", "error.livro",
							"Esse livro já está cadastrado");
		}
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("registerlivro");
		} else {
			livroService.saveLivro(livro);
			modelAndView.addObject("successMessage", "O livro foi cadastrado com sucesso!");
			modelAndView.addObject("livro", new Livro());
			modelAndView.setViewName("registerlivro");
			
		}
		return modelAndView;
	}

}

package br.com.flamingo.biblioteca.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.flamingo.biblioteca.domain.Emprestimo;
import br.com.flamingo.biblioteca.dto.EmprestimoDTO;
import br.com.flamingo.biblioteca.service.EmprestimoService;

@Controller
public class EmprestimoController {
	
	@Autowired
	private EmprestimoService emprestimoService;
	
	@RequestMapping(value="/emprestimodto", method = RequestMethod.GET)
	public ModelAndView emprestimo(){
		ModelAndView modelAndView = new ModelAndView();
		EmprestimoDTO emprestimo = new EmprestimoDTO();
		modelAndView.addObject("emprestimodto", emprestimo);
		modelAndView.setViewName("emprestimodto");
		return modelAndView;
	}
	
	@RequestMapping(value="/emprestimodto", method = RequestMethod.POST)
	public ModelAndView makeEmprestimo(@Valid EmprestimoDTO emprestimodto , BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
//		Emprestimo emprestimoExistente = emprestimoService.findEmprestimoByID(emprestimodto.getIdEmprestimo());
//		if (emprestimoExistente != null) {
//			bindingResult
//					.rejectValue("idEmprestimo", "error.emprestimo",
//							"Emprestimo já foi realizado!");
//		}
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("emprestimo");
		} else {
			emprestimoService.saveEmprestimo(emprestimodto);
			modelAndView.addObject("successMessage", "Empréstimo realizado com sucesso!");
			modelAndView.addObject("emprestimodto", new EmprestimoDTO());
			modelAndView.setViewName("emprestimodto");
			
		}
		return modelAndView;
	}	
}

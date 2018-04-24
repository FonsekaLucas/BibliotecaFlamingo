package br.com.flamingo.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.flamingo.biblioteca.domain.Funcionario;
import br.com.flamingo.biblioteca.service.FuncionarioService;

@Controller
public class LoginController {
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	@RequestMapping(value={"/", "/login"}, method = RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@RequestMapping(value="/index", method = RequestMethod.POST)
	public ModelAndView home(){
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Funcionario funcionario = funcionarioService.findFuncionarioByEmail(auth.getName());
		modelAndView.addObject("userName", "Bem-vindo " + funcionario.getNomeFuncionario());
		modelAndView.addObject("adminMessage","Conteúdo disponível apenas para usuário com permissão de administrador!");
		modelAndView.setViewName("home");
		return modelAndView;
	}
	

}
package br.com.flamingo.biblioteca.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.flamingo.biblioteca.domain.Cliente;
import br.com.flamingo.biblioteca.service.ClienteService;

@Controller
@RequestMapping(value = "/registercliente")
public class RegisterClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ModelAndView registerCliente() {
        ModelAndView modelAndView = new ModelAndView();
        Cliente cliente = new Cliente();

        modelAndView.addObject("cliente", cliente);
        modelAndView.setViewName("registercliente");
        return modelAndView;
    }

    @PostMapping
    public ModelAndView createNewCliente(@Valid Cliente cliente, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        Cliente clienteExistente = clienteService.findClienteByNomeCliente(cliente.getNomeCliente());
        if (clienteExistente != null) {
            bindingResult.rejectValue("nomeCliente", "error.cliente", "Esse cliente já está cadastrado");
        }
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("registercliente");
        } else {
            clienteService.saveCliente(cliente);
            modelAndView.addObject("successMessage", "O cliente foi cadastrado com sucesso!");
            modelAndView.addObject("cliente", new Cliente());
            modelAndView.setViewName("registercliente");

        }
        return modelAndView;
    }

}

package br.com.flamingo.biblioteca.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.flamingo.biblioteca.domain.Funcionario;
import br.com.flamingo.biblioteca.repository.FuncionarioRepository;
import br.com.flamingo.biblioteca.service.FuncionarioService;

@Service("funcionarioService")
public class FuncionarioServiceImpl implements FuncionarioService{
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@Override
	public Funcionario findFuncionarioByEmail(String emailFuncionario) {
		return funcionarioRepository.findByEmailFuncionario(emailFuncionario);
	}

	@Override
	public void saveFuncionario(Funcionario funcionario) {
		funcionarioRepository.save(funcionario);
	}
		
}

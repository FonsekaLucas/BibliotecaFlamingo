package br.com.flamingo.biblioteca.service;

import br.com.flamingo.biblioteca.domain.Emprestimo;
import br.com.flamingo.biblioteca.dto.EmprestimoDTO;

public interface EmprestimoService {
	public Emprestimo findEmprestimoByID(int idEmprestimo);
	public void saveEmprestimo(EmprestimoDTO emprestimo);
}

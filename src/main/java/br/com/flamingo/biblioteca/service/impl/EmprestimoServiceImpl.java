package br.com.flamingo.biblioteca.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.flamingo.biblioteca.domain.Emprestimo;
import br.com.flamingo.biblioteca.dto.EmprestimoDTO;
import br.com.flamingo.biblioteca.repository.ClienteRepository;
import br.com.flamingo.biblioteca.repository.EmprestimoRepository;
import br.com.flamingo.biblioteca.repository.LivroRepository;
import br.com.flamingo.biblioteca.service.EmprestimoService;

@Service("emprestimoService")
public class EmprestimoServiceImpl implements EmprestimoService{
	 
    @Autowired
	private EmprestimoRepository emprestimoRepository;
    
    @Autowired
    private LivroRepository livroRepository;
    
    @Autowired
    private ClienteRepository clienteRepository;
    
	@Override
	public Emprestimo findEmprestimoByID(int idEmprestimo) {
		return this.emprestimoRepository.findByidEmprestimo(idEmprestimo);
	}

	@Override
	public void saveEmprestimo(EmprestimoDTO emprestimo) {
	    
	    Emprestimo emprestimoDomain = new Emprestimo();
	    
		emprestimoDomain.setDataEntrega(emprestimo.getDataEntrega());
		emprestimoDomain.setDataRetirada(emprestimo.getDataRetirada());
		emprestimoDomain.setLivro(livroRepository.findByTitulo(emprestimo.getTitulo()));
		emprestimoDomain.setCliente(clienteRepository.findClienteByNomeCliente(emprestimo.getNomeCliente()));
        emprestimoRepository.save(emprestimoDomain);
    }

}

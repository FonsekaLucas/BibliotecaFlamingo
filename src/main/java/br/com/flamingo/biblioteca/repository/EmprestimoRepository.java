package br.com.flamingo.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.flamingo.biblioteca.domain.Emprestimo;

@Repository("emprestimoRepository")
public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long>{
	Emprestimo findByidEmprestimo(int idEmprestimo);
}

package br.com.flamingo.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.flamingo.biblioteca.domain.Funcionario;

@Repository("funcionarioRepository")
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
	Funcionario findByEmailFuncionario(String emailFuncionario);
}

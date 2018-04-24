package br.com.flamingo.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.flamingo.biblioteca.domain.Livro;

@Repository("livroRepository")
public interface LivroRepository extends JpaRepository<Livro, Long>{
	Livro findByTitulo(String titulo);
}

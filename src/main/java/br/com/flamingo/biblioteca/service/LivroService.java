package br.com.flamingo.biblioteca.service;

import br.com.flamingo.biblioteca.domain.Livro;

public interface LivroService {
	public Livro findLivroByTitulo(String titulo);
	public void saveLivro(Livro livro);
}

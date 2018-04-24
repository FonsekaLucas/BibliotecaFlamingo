package br.com.flamingo.biblioteca.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.flamingo.biblioteca.domain.Livro;
import br.com.flamingo.biblioteca.repository.LivroRepository;
import br.com.flamingo.biblioteca.service.LivroService;

@Service("livroService")
public class LivroServiceImpl implements LivroService{
	
	@Autowired
	private LivroRepository livroRepository;
	
	@Override
	public Livro findLivroByTitulo(String titulo) {
		return this.livroRepository.findByTitulo(titulo);
	}

	@Override
	public void saveLivro(Livro livro) {
		livro.setISBN(livro.getISBN());
		livro.setTitulo(livro.getTitulo());
		livro.setAutor(livro.getAutor());
		livro.setEdicao(livro.getEdicao());
		livro.setAno(livro.getAno());
		livro.setQuantidadePaginas(livro.getQuantidadePaginas());
		livro.setGenero(livro.getGenero());
		livroRepository.save(livro);
	}

}

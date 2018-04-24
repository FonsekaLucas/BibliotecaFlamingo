package br.com.flamingo.biblioteca.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "Livro")
public class Livro implements Serializable {

    private static final long serialVersionUID = -1478335347681360603L;

    @Id
    @Column(name = "tombo_livro")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tomboCircular;

    @Column(name = "ISBN_livro")
    @NotEmpty(message = "*Por favor, forneça o ISBN do livro!")
    private String ISBN;

    @Column(name = "titulo_livro")
    @NotEmpty(message = "*Por favor, forneça o título do livro!")
    private String titulo;

    @Column(name = "autor_livro")
    @NotEmpty(message = "*Por favor, forneça o autor do livro!")
    private String autor;

    @Column(name = "edicao_livro")
    @NotEmpty(message = "*Por favor, forneça a edição do livro!")
    private String edicao;

    @Column(name = "ano_livro")
    @NotEmpty(message = "*Por favor, forneça o ano do livro!")
    private String ano;

    @Column(name = "quantidade_paginas")
    @NotEmpty(message = "*Por favor, forneça a quantidade de páginas do livro!")
    private String quantidadePaginas;

    @Column(name = "genero_livro")
    @NotEmpty(message = "*Por favor, forneça o gênero do livro!")
    private String genero;

    public Integer getTomboCircular() {
        return tomboCircular;
    }

    public void setTomboCircular(Integer tomboCircular) {
        this.tomboCircular = tomboCircular;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(String quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ISBN == null) ? 0 : ISBN.hashCode());
        result = prime * result + ((ano == null) ? 0 : ano.hashCode());
        result = prime * result + ((autor == null) ? 0 : autor.hashCode());
        result = prime * result + ((edicao == null) ? 0 : edicao.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((quantidadePaginas == null) ? 0 : quantidadePaginas.hashCode());
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((tomboCircular == null) ? 0 : tomboCircular.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (ISBN == null) {
            if (other.ISBN != null)
                return false;
        } else if (!ISBN.equals(other.ISBN))
            return false;
        if (ano == null) {
            if (other.ano != null)
                return false;
        } else if (!ano.equals(other.ano))
            return false;
        if (autor == null) {
            if (other.autor != null)
                return false;
        } else if (!autor.equals(other.autor))
            return false;
        if (edicao == null) {
            if (other.edicao != null)
                return false;
        } else if (!edicao.equals(other.edicao))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (quantidadePaginas == null) {
            if (other.quantidadePaginas != null)
                return false;
        } else if (!quantidadePaginas.equals(other.quantidadePaginas))
            return false;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (tomboCircular == null) {
            if (other.tomboCircular != null)
                return false;
        } else if (!tomboCircular.equals(other.tomboCircular))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Livro [tomboCircular=" + tomboCircular + ", ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor
                + ", edicao=" + edicao + ", ano=" + ano + ", quantidadePaginas=" + quantidadePaginas + ", genero="
                + genero + "]";
    }

}

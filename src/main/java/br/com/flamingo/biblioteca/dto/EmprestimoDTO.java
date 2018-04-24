package br.com.flamingo.biblioteca.dto;

import java.io.Serializable;
import java.sql.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class EmprestimoDTO implements Serializable {

    private static final long serialVersionUID = 6014576697407505191L;

    private Date dataRetirada;

    private Date dataEntrega;
    
    @NotEmpty(message = "*Por favor, forneça o livro a ser emprestado!")
    private String titulo;

    @NotEmpty(message = "*Por favor, forneça o cliente que realizará o empréstimo!")
    private String nomeCliente;

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dataEntrega == null) ? 0 : dataEntrega.hashCode());
        result = prime * result + ((dataRetirada == null) ? 0 : dataRetirada.hashCode());
        result = prime * result + ((nomeCliente == null) ? 0 : nomeCliente.hashCode());
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
        EmprestimoDTO other = (EmprestimoDTO) obj;
        if (dataEntrega == null) {
            if (other.dataEntrega != null)
                return false;
        } else if (!dataEntrega.equals(other.dataEntrega))
            return false;
        if (dataRetirada == null) {
            if (other.dataRetirada != null)
                return false;
        } else if (!dataRetirada.equals(other.dataRetirada))
            return false;
        if (nomeCliente == null) {
            if (other.nomeCliente != null)
                return false;
        } else if (!nomeCliente.equals(other.nomeCliente))
            return false;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "EmprestimoDTO [dataRetirada=" + dataRetirada + ", dataEntrega=" + dataEntrega + ", titulo=" + titulo
                + ", nomeCliente=" + nomeCliente + "]";
    }

    
}

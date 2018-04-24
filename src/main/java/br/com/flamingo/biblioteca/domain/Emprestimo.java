package br.com.flamingo.biblioteca.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "Emprestimo")
public class Emprestimo implements Serializable {

    private static final long serialVersionUID = -7738397276670855586L;

    @Id
    @Column(name = "id_emprestimo")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idEmprestimo;

    @Column(name = "data_retirada_livro")
    @NotEmpty(message = "*Por favor, forneça a data de retirada do livro!")
    private Date dataRetirada;

    @Column(name = "data_entrega_livro")
    @NotEmpty(message = "*Por favor, forneça a data de entrega do livro")
    private Date dataEntrega;

    @OneToOne(cascade = CascadeType.ALL, targetEntity = Livro.class)
    @JoinColumn(name = "tombo_livro", referencedColumnName = "tombo_livro")
    @NotEmpty(message = "*Por favor, forneça o livro a ser reservado")
    private Livro livro;

    @OneToOne(cascade = CascadeType.ALL, targetEntity = Cliente.class)
    @JoinColumn(name = "cpf_cliente", referencedColumnName = "cpf_cliente")
    @NotEmpty(message = "*Por favor, forneça o cliente que irá reservar o livro")
    private Cliente cliente;

    public Integer getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(Integer idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

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

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
        result = prime * result + ((dataEntrega == null) ? 0 : dataEntrega.hashCode());
        result = prime * result + ((dataRetirada == null) ? 0 : dataRetirada.hashCode());
        result = prime * result + ((idEmprestimo == null) ? 0 : idEmprestimo.hashCode());
        result = prime * result + ((livro == null) ? 0 : livro.hashCode());
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
        Emprestimo other = (Emprestimo) obj;
        if (cliente == null) {
            if (other.cliente != null)
                return false;
        } else if (!cliente.equals(other.cliente))
            return false;
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
        if (idEmprestimo == null) {
            if (other.idEmprestimo != null)
                return false;
        } else if (!idEmprestimo.equals(other.idEmprestimo))
            return false;
        if (livro == null) {
            if (other.livro != null)
                return false;
        } else if (!livro.equals(other.livro))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Emprestimo [idEmprestimo=" + idEmprestimo + ", dataRetirada=" + dataRetirada + ", dataEntrega="
                + dataEntrega + ", livro=" + livro + ", cliente=" + cliente + "]";
    }

}
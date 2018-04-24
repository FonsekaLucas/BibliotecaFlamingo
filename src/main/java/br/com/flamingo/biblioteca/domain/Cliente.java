package br.com.flamingo.biblioteca.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = -7770303252705241639L;

    @Id
    @Column(name = "id_cliente")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCliente;

    @CPF
    @Column(name = "cpf_cliente")
    @NotEmpty(message = "Por favor, forneça o CPF do cliente")
    private String cpfCliente;

    @Column(name = "nome_cliente")
    @NotEmpty(message = "*Por favor, forneça o nome do cliente!")
    private String nomeCliente;

    @Column(name = "email_cliente")
    @NotEmpty(message = "*Por favor, forneça o e-mail do cliente!")
    private String emailCliente;

    @Column(name = "curso_cliente")
    @NotEmpty(message = "*Por favor forneça o curso do cliente")
    private String cursoCliente;

    @Column(name = "telefone_cliente")
    @NotEmpty(message = "*Por favor forneça o telefone do cliente")
    private String telefoneCliente;

    @Column(name = "tipo_cliente")
    @NotEmpty(message = "*Por favor selecione o tipo do cliente")
    private String tipoCliente;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getCursoCliente() {
        return cursoCliente;
    }

    public void setCursoCliente(String cursoCliente) {
        this.cursoCliente = cursoCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cpfCliente == null) ? 0 : cpfCliente.hashCode());
        result = prime * result + ((cursoCliente == null) ? 0 : cursoCliente.hashCode());
        result = prime * result + ((emailCliente == null) ? 0 : emailCliente.hashCode());
        result = prime * result + ((idCliente == null) ? 0 : idCliente.hashCode());
        result = prime * result + ((nomeCliente == null) ? 0 : nomeCliente.hashCode());
        result = prime * result + ((telefoneCliente == null) ? 0 : telefoneCliente.hashCode());
        result = prime * result + ((tipoCliente == null) ? 0 : tipoCliente.hashCode());
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
        Cliente other = (Cliente) obj;
        if (cpfCliente == null) {
            if (other.cpfCliente != null)
                return false;
        } else if (!cpfCliente.equals(other.cpfCliente))
            return false;
        if (cursoCliente == null) {
            if (other.cursoCliente != null)
                return false;
        } else if (!cursoCliente.equals(other.cursoCliente))
            return false;
        if (emailCliente == null) {
            if (other.emailCliente != null)
                return false;
        } else if (!emailCliente.equals(other.emailCliente))
            return false;
        if (idCliente == null) {
            if (other.idCliente != null)
                return false;
        } else if (!idCliente.equals(other.idCliente))
            return false;
        if (nomeCliente == null) {
            if (other.nomeCliente != null)
                return false;
        } else if (!nomeCliente.equals(other.nomeCliente))
            return false;
        if (telefoneCliente == null) {
            if (other.telefoneCliente != null)
                return false;
        } else if (!telefoneCliente.equals(other.telefoneCliente))
            return false;
        if (tipoCliente == null) {
            if (other.tipoCliente != null)
                return false;
        } else if (!tipoCliente.equals(other.tipoCliente))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Cliente [idCliente=" + idCliente + ", cpfCliente=" + cpfCliente + ", nomeCliente=" + nomeCliente
                + ", emailCliente=" + emailCliente + ", cursoCliente=" + cursoCliente + ", telefoneCliente="
                + telefoneCliente + ", tipoCliente=" + tipoCliente + "]";
    }

}

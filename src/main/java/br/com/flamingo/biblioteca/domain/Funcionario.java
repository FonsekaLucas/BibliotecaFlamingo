package br.com.flamingo.biblioteca.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;

import br.com.flamingo.biblioteca.domain.enumeration.TipoFuncionario;

@Entity
@Table(name = "Funcionario")
public class Funcionario implements Serializable {

	private static final long serialVersionUID = 319180793355782452L;

	@Id
	@Column(name = "id_funcionario")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idFuncionario;
	
	@CPF
	@Column(name = "cpf_funcionario")
	@NotEmpty(message = "*Por favor, forneça o CPF do funcionário!")
	private String cpfFuncionario;

	@Column(name = "nome_funcionario")
	@NotEmpty(message = "*Por favor, forneça o nome do funcionário!")
	private String nomeFuncionario;

	@Column(name = "ativo")
	private Boolean ativo;

	@Column(name = "email_funcionario")
	@NotEmpty(message = "*Por favor, forneça o email do funcionário!")
	private String emailFuncionario;

	@Column(name = "senha_funcionario")
	@NotEmpty(message = "*Por favor, forneça a senha do funcionário!")
	private String senhaFuncionario;

	@Column(name = "tipo_funcionario", columnDefinition = "smallint")
	@NotEmpty(message = "*Por favor, selecione o tipo do funcionário!")
	@Enumerated(EnumType.ORDINAL)
	private TipoFuncionario tipoFuncionario;

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getEmailFuncionario() {
        return emailFuncionario;
    }

    public void setEmailFuncionario(String emailFuncionario) {
        this.emailFuncionario = emailFuncionario;
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

    public TipoFuncionario getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(TipoFuncionario tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ativo == null) ? 0 : ativo.hashCode());
        result = prime * result + ((cpfFuncionario == null) ? 0 : cpfFuncionario.hashCode());
        result = prime * result + ((emailFuncionario == null) ? 0 : emailFuncionario.hashCode());
        result = prime * result + ((idFuncionario == null) ? 0 : idFuncionario.hashCode());
        result = prime * result + ((nomeFuncionario == null) ? 0 : nomeFuncionario.hashCode());
        result = prime * result + ((senhaFuncionario == null) ? 0 : senhaFuncionario.hashCode());
        result = prime * result + ((tipoFuncionario == null) ? 0 : tipoFuncionario.hashCode());
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
        Funcionario other = (Funcionario) obj;
        if (ativo == null) {
            if (other.ativo != null)
                return false;
        } else if (!ativo.equals(other.ativo))
            return false;
        if (cpfFuncionario == null) {
            if (other.cpfFuncionario != null)
                return false;
        } else if (!cpfFuncionario.equals(other.cpfFuncionario))
            return false;
        if (emailFuncionario == null) {
            if (other.emailFuncionario != null)
                return false;
        } else if (!emailFuncionario.equals(other.emailFuncionario))
            return false;
        if (idFuncionario == null) {
            if (other.idFuncionario != null)
                return false;
        } else if (!idFuncionario.equals(other.idFuncionario))
            return false;
        if (nomeFuncionario == null) {
            if (other.nomeFuncionario != null)
                return false;
        } else if (!nomeFuncionario.equals(other.nomeFuncionario))
            return false;
        if (senhaFuncionario == null) {
            if (other.senhaFuncionario != null)
                return false;
        } else if (!senhaFuncionario.equals(other.senhaFuncionario))
            return false;
        if (tipoFuncionario != other.tipoFuncionario)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Funcionario [idFuncionario=" + idFuncionario + ", cpfFuncionario=" + cpfFuncionario
                + ", nomeFuncionario=" + nomeFuncionario + ", ativo=" + ativo + ", emailFuncionario=" + emailFuncionario
                + ", senhaFuncionario=" + senhaFuncionario + ", tipoFuncionario=" + tipoFuncionario + "]";
    }

	
}
package br.com.flamingo.biblioteca.domain.enumeration;

public enum TipoCliente {

	ALUNO("Aluno"), PROFESSOR("Professor"), COLABORADOR("Colaborador");

	public final String tipoCliente;

	TipoCliente(final String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	@Override
	public String toString() {
		return tipoCliente;
	}
}

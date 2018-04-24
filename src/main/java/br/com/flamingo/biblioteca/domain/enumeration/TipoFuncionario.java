package br.com.flamingo.biblioteca.domain.enumeration;

public enum TipoFuncionario {

	ADMINISTRADOR("ADMIN"), FUNCIONARIO("Funcionário");

	private final String tipoFuncionario;

	TipoFuncionario(String tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}

	@Override
	public String toString() {
		return tipoFuncionario;
	}
}

package br.com.flamingo.biblioteca.service;

import br.com.flamingo.biblioteca.domain.Cliente;

public interface ClienteService {
	public Cliente findClienteByNomeCliente(String nomeCliente);
	public void saveCliente(Cliente cliente);
}

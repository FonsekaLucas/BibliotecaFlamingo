package br.com.flamingo.biblioteca.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.flamingo.biblioteca.domain.Cliente;
import br.com.flamingo.biblioteca.repository.ClienteRepository;
import br.com.flamingo.biblioteca.service.ClienteService;

@Service("clienteService")
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public Cliente findClienteByNomeCliente(String nomeCliente) {
		return this.clienteRepository.findClienteByNomeCliente(nomeCliente);
	}

	@Override
	public void saveCliente(Cliente cliente) {
		cliente.setCpfCliente(cliente.getCpfCliente());
		cliente.setNomeCliente(cliente.getNomeCliente());
		cliente.setEmailCliente(cliente.getEmailCliente());
		cliente.setCursoCliente(cliente.getCursoCliente());
		cliente.setTelefoneCliente(cliente.getTelefoneCliente());
		cliente.setTipoCliente(cliente.getTipoCliente());

		clienteRepository.save(cliente);
	}

}

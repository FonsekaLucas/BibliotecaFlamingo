package br.com.flamingo.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.flamingo.biblioteca.domain.Cliente;

@Repository("clienteRepository")
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	Cliente findClienteByNomeCliente(String nomeCliente);
}

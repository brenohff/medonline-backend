package br.com.medonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medonline.modal.Endereco;
import br.com.medonline.repository.EnderecoRp;
import br.com.medonline.service.exception.NotFound;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRp repository;

	public List<Endereco> buscaEnderecos() {
		return repository.findAll();
	}

	public void salvarEndereco(Endereco Endereco) {
		repository.save(Endereco);
	}

	public Endereco buscaEnderecoPorID(Long idEndereco) {
		Endereco m = repository.buscaEnderecoPorID(idEndereco);

		if (m != null) {
			return m;
		} else {
			throw new NotFound("Endereço não encontrado.");
		}
	}
}

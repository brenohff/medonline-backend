package br.com.medonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medonline.modal.Endereco;
import br.com.medonline.repository.EnderecoRp;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRp repository;
	
	public List<Endereco> buscaEnderecos(){
		return repository.findAll();
	}
}

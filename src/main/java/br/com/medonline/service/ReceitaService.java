package br.com.medonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medonline.modal.Receita;
import br.com.medonline.repository.ReceitaRp;

@Service
public class ReceitaService {

	@Autowired
	private ReceitaRp repository;
	
	public List<Receita> buscaReceitas(){
		return repository.findAll();
	}
	
}

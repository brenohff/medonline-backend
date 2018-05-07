package br.com.medonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medonline.modal.Exame;
import br.com.medonline.repository.ExameRp;

@Service
public class ExameService {

	@Autowired
	private ExameRp repository;
	
	public List<Exame> buscaExames(){
		return repository.findAll();
	}
	
}

package br.com.medonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medonline.modal.Diagnostico;
import br.com.medonline.repository.DiagnosticoRp;

@Service
public class DiagnosticoService {
	
	@Autowired
	private DiagnosticoRp repository;
	
	public List<Diagnostico> buscaDiagnosticos(){
		return repository.findAll();
	}

}

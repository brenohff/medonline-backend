package br.com.medonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medonline.modal.Medico;
import br.com.medonline.repository.MedicoRp;

@Service
public class MedicoService {

	@Autowired
	MedicoRp repository;

	public List<Medico> buscaMedicos(){
		return repository.findAll();
	}
}

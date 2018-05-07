package br.com.medonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medonline.modal.Paciente;
import br.com.medonline.repository.PacienteRp;

@Service
public class PacienteService {

	@Autowired
	PacienteRp repository;

	public List<Paciente> buscarPacientes() {
		return repository.findAll();
	}

}

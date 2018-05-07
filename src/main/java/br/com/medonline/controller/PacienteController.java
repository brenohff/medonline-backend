package br.com.medonline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.medonline.modal.Paciente;
import br.com.medonline.service.PacienteService;

@RequestMapping("/paciente")
public class PacienteController {

	@Autowired
	PacienteService service;
	
	@RequestMapping("buscaTodos")
	public List<Paciente> buscaTodos(){
		return service.buscarPacientes();
	}

}

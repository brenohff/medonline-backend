package br.com.medonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.medonline.service.PacienteService;

@RequestMapping("/paciente")
public class PacienteController {

	@Autowired
	PacienteService service;

}

package br.com.medonline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.medonline.modal.Medico;
import br.com.medonline.service.MedicoService;

@RequestMapping("/medico")
public class MedicoController {

	@Autowired
	MedicoService service;
	
	@RequestMapping("/buscaTodos")
	public List<Medico> buscaTodos(){
		return service.buscaMedicos();
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public void salvar(@RequestBody Medico medico){
		service.salvarMedico(medico);
	}

}

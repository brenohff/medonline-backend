package br.com.medonline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.medonline.modal.Paciente;
import br.com.medonline.service.PacienteService;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

	@Autowired
	PacienteService service;

	@RequestMapping("/buscaTodos")
	public List<Paciente> buscaTodos() {
		return service.buscarPacientes();
	}

	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public void salvar(@RequestBody Paciente paciente) {
		service.salvarPaciente(paciente);
	}

	@RequestMapping(value = "/atualizar", method = RequestMethod.PUT)
	public void atualizar(@RequestBody Paciente paciente) {
		service.atualizarPaciente(paciente);
	}

	@RequestMapping(value = "/buscaPacientePeloID")
	public Paciente getByID(@RequestParam(value = "idPaciente") Long idPaciente) {
		return service.buscaPacientePorID(idPaciente);
	}

	@RequestMapping(value = "/buscaPacientePeloEmail")
	public Paciente getByEmail(@RequestParam(value = "email") String email) {
		return service.buscaPacientePorEmail(email);
	}

}

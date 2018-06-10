package br.com.medonline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.medonline.modal.Especialidade;
import br.com.medonline.service.EspecialidadeService;

@RestController
@RequestMapping("/especialidade")
@CrossOrigin
public class EspecialidadeController {

	@Autowired
	EspecialidadeService service;

	@RequestMapping("/buscaTodos")
	public List<Especialidade> buscaTodos() {
		return service.buscaEspecialidades();
	}

	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public void salvar(@RequestBody Especialidade especialidade) {
		service.salvarEspecialidade(especialidade);
	}

	@RequestMapping(value = "/buscaEspecialidadePorID")
	public Especialidade buscaEspecialidadePorID(@RequestParam(value = "idEspecialidade") Long idEspecialidade) {
		return service.buscaEspecialidadePorID(idEspecialidade);
	}
	
}

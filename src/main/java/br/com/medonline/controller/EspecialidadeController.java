package br.com.medonline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.medonline.modal.Especialidade;
import br.com.medonline.modal.Medico;
import br.com.medonline.service.EspecialidadeService;

@RestController
@RequestMapping("/especialidade")
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

	@RequestMapping(value = "/buscaMedicoPorEspecialidade")
	public List<Medico> buscaMedicoPorEspecialidade(@RequestParam(value = "idEspecialidade") Long idEspecialidade) {
		return service.buscaMedicoPorEspecialidade(idEspecialidade);
	}

}

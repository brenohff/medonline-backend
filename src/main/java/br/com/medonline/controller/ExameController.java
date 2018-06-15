package br.com.medonline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.medonline.modal.Exame;
import br.com.medonline.service.ExameService;

@RestController
@RequestMapping("/exame")
@CrossOrigin
public class ExameController {

	@Autowired
	ExameService service;

	@RequestMapping("/buscaTodos")
	public List<Exame> buscaTodos() {
		return service.buscaExames();
	}

	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public void salvar(@RequestBody Exame Exame) {
		service.salvarExame(Exame);
	}

	@RequestMapping(value = "/buscaExamePeloID")
	public Exame getByFaceID(@RequestParam(value = "idExame") Long idExame) {
		return service.buscaExamePorID(idExame);
	}

	@RequestMapping(value = "/buscaExamePelaConsulta")
	public List<Exame> buscaExamePelaConsulta(@RequestParam(value = "idConsulta") Long idConsulta) {
		return service.buscaExamePelaConsulta(idConsulta);
	}

}

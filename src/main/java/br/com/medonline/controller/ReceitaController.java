package br.com.medonline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.medonline.modal.Receita;
import br.com.medonline.service.ReceitaService;

@RestController
@RequestMapping("/receita")
public class ReceitaController {

	@Autowired
	ReceitaService service;

	@RequestMapping("/buscaTodos")
	public List<Receita> buscaTodos() {
		return service.buscaReceitas();
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public void salvar(@RequestBody Receita Receita){
		service.salvarReceita(Receita);
	}
	
	@RequestMapping(value = "/buscaReceitaPeloID")
	public Receita getByFaceID(@RequestParam(value="idReceita") Long idReceita) {
		return service.buscaReceitaPorID(idReceita);
	}

}

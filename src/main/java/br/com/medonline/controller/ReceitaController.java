package br.com.medonline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.medonline.modal.Receita;
import br.com.medonline.service.ReceitaService;

@RequestMapping("/receita")
public class ReceitaController {

	@Autowired
	ReceitaService service;

	@RequestMapping("buscaTodos")
	public List<Receita> buscaTodos() {
		return service.buscaReceitas();
	}

}

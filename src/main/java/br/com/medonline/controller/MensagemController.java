package br.com.medonline.controller;

import br.com.medonline.modal.Mensagem;
import br.com.medonline.service.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mensagem")
public class MensagemController {

	@Autowired
	MensagemService service;

	@RequestMapping("/buscaTodos")
	public List<Mensagem> buscaTodos() {
		return service.buscaTodas();
	}

	@RequestMapping("/buscaMensagensPorConsulta")
	public List<Mensagem> buscaMensagensPorConsulta(@RequestParam(value = "idConsulta") Long idConsulta) {
		return service.buscaMensagensPorConsulta(idConsulta);
	}

	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public List<Mensagem> salvarMensagem(@RequestBody Mensagem mensagem) {
		return service.salvarMensagem(mensagem);
	}
}

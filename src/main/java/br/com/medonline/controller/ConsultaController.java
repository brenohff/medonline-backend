package br.com.medonline.controller;

import java.util.List;

import br.com.medonline.modal.Mensagem;
import br.com.medonline.service.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.medonline.modal.Consulta;
import br.com.medonline.service.ConsultaService;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {
	
	@Autowired
	ConsultaService service;

	@Autowired
	MensagemService mensagemService;
	
	@RequestMapping("/buscaTodos")
	public List<Consulta> buscaTodos(){
		return service.buscaConsultas();
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public void salvar(@RequestBody Consulta Consulta){
		service.salvarConsulta(Consulta);
	}
	
	@RequestMapping(value = "/buscaConsultaPeloID")
	public Consulta getByFaceID(@RequestParam(value="idConsulta") Long idConsulta) {
		return service.buscaConsultaPorID(idConsulta);
	}
	
	@MessageMapping("/consulta/{consultaId}/enviaMensagem")
	@SendTo("/topic/consulta/{consultaId}")
	public Mensagem enviaMensagem (@DestinationVariable String consultaId, @Payload Mensagem mensagem) {
		mensagemService.salvarMensagem(mensagem);
		return mensagem;
	}

}

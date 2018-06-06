package br.com.medonline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
//	@MessageMapping("/consulta/{eventId}/enviaMensagem")
//	@SendTo("/topic/consulta/{eventId}")
//	public LTChat sendMessage(@DestinationVariable String eventId, @Payload LTChat chatMessage) {
//		chatMessage.setEventId(eventId);
//		chatService.saveChat(chatMessage);
//		return chatMessage;
//	}

}

package br.com.medonline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.medonline.modal.Diagnostico;
import br.com.medonline.service.DiagnosticoService;

@RestController
@RequestMapping("/diagnostico")
@CrossOrigin
public class DiagnosticoController {
	
	@Autowired
	DiagnosticoService service;
	
	@RequestMapping("/buscaTodos")
	public List<Diagnostico> buscaTodos(){
		return service.buscaDiagnosticos();
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public void salvar(@RequestBody Diagnostico Diagnostico){
		service.salvarDiagnostico(Diagnostico);
	}
	
	@RequestMapping(value = "/buscaDiagnosticoPeloID")
	public Diagnostico getByFaceID(@RequestParam(value="idDiagnostico") Long idDiagnostico) {
		return service.buscaDiagnosticoPorID(idDiagnostico);
	}

}

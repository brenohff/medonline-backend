package br.com.medonline;

import java.util.HashMap;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MedOnline {
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public HashMap<String, String> medOnline(){
		HashMap<String, String> hash = new HashMap<>();
		hash.put("Projeto", "MedOnline");
		hash.put("Matéria", "Estágio Supervisionado");
		hash.put("Versão", "0.0.1-SNAPSHOT");
		
		return hash;
	}

}

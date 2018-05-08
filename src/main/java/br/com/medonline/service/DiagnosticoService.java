package br.com.medonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medonline.modal.Diagnostico;
import br.com.medonline.repository.DiagnosticoRp;
import br.com.medonline.service.exception.NotFound;

@Service
public class DiagnosticoService {
	
	@Autowired
	private DiagnosticoRp repository;
	
	public List<Diagnostico> buscaDiagnosticos(){
		return repository.findAll();
	}
	
	public void salvarDiagnostico(Diagnostico Diagnostico) {
		repository.save(Diagnostico);
	}
	
	public Diagnostico buscaDiagnosticoPorID(Long idDiagnostico) {
		Diagnostico m = repository.buscaDiagnosticoPorID(idDiagnostico);
		
		if(m != null) {
			return m;
		}else {
			throw new NotFound("Diagnóstico não encontrado.");
		}
	}

}

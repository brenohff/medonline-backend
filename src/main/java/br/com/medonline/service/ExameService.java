package br.com.medonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medonline.modal.Exame;
import br.com.medonline.repository.ExameRp;
import br.com.medonline.service.exception.NotFound;

@Service
public class ExameService {

	@Autowired
	private ExameRp repository;
	
	public List<Exame> buscaExames(){
		return repository.findAll();
	}
	
	public void salvarExame(Exame Exame) {
		repository.save(Exame);
	}
	
	public Exame buscaExamePorID(Long idExame) {
		Exame m = repository.buscaExamePorID(idExame);
		
		if(m != null) {
			return m;
		}else {
			throw new NotFound("Exame não encontrado.");
		}
	}
	
}

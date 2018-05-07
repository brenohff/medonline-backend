package br.com.medonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medonline.modal.Medico;
import br.com.medonline.repository.MedicoRp;
import br.com.medonline.service.exception.NotFound;

@Service
public class MedicoService {

	@Autowired
	MedicoRp repository;

	public List<Medico> buscaMedicos(){
		return repository.findAll();
	}
	
	public void salvarMedico(Medico medico) {
		repository.save(medico);
	}
	
	public Medico buscaMedicoPorID(Long idMedico) {
		Medico m = repository.buscaMedicoPorID(idMedico);
		
		if(m != null) {
			return m;
		}else {
			throw new NotFound("Médico não encontrado.");
		}
	}
}

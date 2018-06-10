package br.com.medonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medonline.modal.Especialidade;
import br.com.medonline.repository.EspecialidadeRp;
import br.com.medonline.service.exception.CouldNotSave;
import br.com.medonline.service.exception.NotFound;

@Service
public class EspecialidadeService {

	@Autowired
	EspecialidadeRp repository;

	public List<Especialidade> buscaEspecialidades() {
		return repository.findAll();
	}

	public void salvarEspecialidade(Especialidade especialidade) {
		try {
			repository.save(especialidade);
		} catch (Exception e) {
			throw new CouldNotSave("Não foi possível salvar a especialidade.");
		}
	}
	
	public Especialidade buscaEspecialidadePorID(Long idEspecialidade) {
		try {
			return repository.findById(idEspecialidade).get();
		} catch (Exception e) {
			throw new NotFound("Especialidade não encontrada.");
		}
	}

}

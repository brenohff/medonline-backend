package br.com.medonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medonline.modal.Especialidade;
import br.com.medonline.modal.Medico;
import br.com.medonline.repository.EspecialidadeRp;
import br.com.medonline.service.exception.CouldNotSave;

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
	

	public List<Medico> buscaMedicoPorEspecialidade(Long idEspecialidade) {
		return repository.buscaMedicoPorEspecialidade(idEspecialidade);
	}

}

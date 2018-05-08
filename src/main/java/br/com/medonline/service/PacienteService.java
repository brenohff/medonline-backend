package br.com.medonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medonline.modal.Paciente;
import br.com.medonline.repository.PacienteRp;
import br.com.medonline.service.exception.NotFound;

@Service
public class PacienteService {

	@Autowired
	PacienteRp repository;

	public List<Paciente> buscarPacientes() {
		return repository.findAll();
	}

	public void salvarPaciente(Paciente Paciente) {
		repository.save(Paciente);
	}

	public Paciente buscaPacientePorID(Long idPaciente) {
		Paciente m = repository.buscaPacientePorID(idPaciente);

		if (m != null) {
			return m;
		} else {
			throw new NotFound("Paciente não encontrado.");
		}
	}

}

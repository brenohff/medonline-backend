package br.com.medonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medonline.modal.Paciente;
import br.com.medonline.repository.EnderecoRp;
import br.com.medonline.repository.PacienteRp;
import br.com.medonline.service.exception.CouldNotSave;
import br.com.medonline.service.exception.NotFound;

@Service
public class PacienteService {

	@Autowired
	PacienteRp repository;

	@Autowired
	EnderecoRp endRepository;

	public List<Paciente> buscarPacientes() {
		return repository.findAll();
	}

	public void salvarPaciente(Paciente paciente) {
		if (paciente.getEndereco() != null) {
			try {
				endRepository.save(paciente.getEndereco());
			} catch (Exception e) {
				throw new CouldNotSave("Não foi possível salvar objeto");
			}
			repository.save(paciente);
		} else {
			repository.save(paciente);
		}
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

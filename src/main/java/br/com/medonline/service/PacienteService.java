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
		try {
			endRepository.save(paciente.getEndereco());
		} catch (Exception e) {
			throw new CouldNotSave("Não foi possível salvar objeto, verifique endereço.");
		}
		repository.save(paciente);
	}

	public Paciente buscaPacientePorID(Long idPaciente) {
		try {
			return repository.findById(idPaciente).get();
		} catch (Exception e) {
			throw new NotFound("Paciente não encontrado.");
		}
	}
	
	public Paciente buscaPacientePorEmail(String email) {
		try {
			return repository.buscaPacientePorEmail(email);
		} catch (Exception e) {
			throw new NotFound("Paciente não encontrado.");
		}
	}

}

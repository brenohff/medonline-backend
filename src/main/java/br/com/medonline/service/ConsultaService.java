package br.com.medonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medonline.modal.Consulta;
import br.com.medonline.repository.ConsultaRp;
import br.com.medonline.service.exception.NotFound;

@Service
public class ConsultaService {

	@Autowired
	private ConsultaRp repository;

	public List<Consulta> buscaConsultas() {
		return repository.findAll();
	}

	public Consulta salvarConsulta(Consulta consulta) {
		repository.save(consulta);
		return consulta;
	}

	public List<Consulta> buscaConsultaPorMedico(Long idMedico) {
		return repository.buscaConsultaPorMedico(idMedico);
	}

	public List<Consulta> buscaConsultaPorPaciente(Long idPaciente) {
		return repository.buscaConsultaPorPaciente(idPaciente);
	}

	public Consulta buscaConsultaPorID(Long idConsulta) {
		Consulta m = repository.buscaConsultaPorID(idConsulta);

		if (m != null) {
			return m;
		} else {
			throw new NotFound("Consulta não encontrada.");
		}
	}

}

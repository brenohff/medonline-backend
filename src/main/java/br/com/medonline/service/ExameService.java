package br.com.medonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medonline.modal.Exame;
import br.com.medonline.repository.ConsultaRp;
import br.com.medonline.repository.ExameRp;
import br.com.medonline.service.exception.CouldNotSave;
import br.com.medonline.service.exception.NotFound;

@Service
public class ExameService {

	@Autowired
	private ExameRp repository;

	@Autowired
	private ConsultaRp consultaRepository;

	public List<Exame> buscaExames() {
		return repository.findAll();
	}

	public void salvarExame(Exame exame) {
		try {
			consultaRepository.findById(exame.getConsulta().getIdConsulta()).get();
		} catch (Exception e) {
			throw new CouldNotSave("Erro ao cadastrar exame, verifique os dados e se a consulta existe antes de tentar novamente.");
		}
		repository.save(exame);
	}

	public Exame buscaExamePorID(Long idExame) {
		try {
			return repository.findById(idExame).get();
		} catch (Exception e) {
			throw new NotFound("Exame não encontrado.");
		}
	}

}

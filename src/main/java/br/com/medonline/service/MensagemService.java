package br.com.medonline.service;

import br.com.medonline.modal.Mensagem;
import br.com.medonline.repository.MensagemRp;
import br.com.medonline.service.exception.CouldNotSave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensagemService {

	@Autowired
	MensagemRp repository;

	public List<Mensagem> salvarMensagem(Mensagem mensagem) {
		try {
			repository.save(mensagem);
		} catch (Exception e) {
			throw new CouldNotSave("Não foi possível salvar mensagem");
		}
		return repository.buscaMensagensPorConsulta(mensagem.getConsulta().getIdConsulta());
	}

	public List<Mensagem> buscaTodas() {
		return repository.findAll();
	}

	public List<Mensagem> buscaMensagensPorConsulta(Long idConsulta) {
		return repository.buscaMensagensPorConsulta(idConsulta);
	}
}

package br.com.medonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medonline.modal.Receita;
import br.com.medonline.repository.ReceitaRp;
import br.com.medonline.service.exception.NotFound;

@Service
public class ReceitaService {

	@Autowired
	private ReceitaRp repository;

	public List<Receita> buscaReceitas() {
		return repository.findAll();
	}

	public void salvarReceita(Receita receita) {
		try {
			repository.save(receita);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public Receita buscaReceitaPorID(Long idReceita) {
		Receita receita = repository.buscaReceitaPorID(idReceita);

		if (receita != null) {
			return receita;
		} else {
			throw new NotFound("Receita não encontrada");
		}
	}

}

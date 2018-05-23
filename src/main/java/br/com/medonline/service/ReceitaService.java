package br.com.medonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medonline.modal.Receita;
import br.com.medonline.repository.ReceitaRp;
import br.com.medonline.service.exception.CouldNotSave;
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
			throw new CouldNotSave("Não foi possível inserir receita.");
		}
	}

	public Receita buscaReceitaPorID(Long idReceita) {
		try {
			return repository.findById(idReceita).get();
		}catch(Exception e) {
			throw new NotFound("Receita não encontrada");
		}
	}

}
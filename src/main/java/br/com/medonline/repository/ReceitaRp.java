package br.com.medonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.medonline.modal.Receita;

@Repository
public interface ReceitaRp extends JpaRepository<Receita, Long>{

}

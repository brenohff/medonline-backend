package br.com.medonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.medonline.modal.Exame;

@Repository
public interface ExameRp extends JpaRepository<Exame, Long>{

}

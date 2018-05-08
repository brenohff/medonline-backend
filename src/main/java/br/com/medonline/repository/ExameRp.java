package br.com.medonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.medonline.modal.Exame;

@Repository
public interface ExameRp extends JpaRepository<Exame, Long>{

	@Query("SELECT m FROM Exame m WHERE m.idExame = :idExame")
	public Exame buscaExamePorID(@Param("idExame") Long idExame);
	
}

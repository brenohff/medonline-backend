package br.com.medonline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.medonline.modal.Exame;

@Repository
public interface ExameRp extends JpaRepository<Exame, Long>{
	
	@Query("SELECT e FROM Exame e WHERE e.consulta.idConsulta = :idConsulta")
	public List<Exame> buscaExamesPelaConsulta(@Param("idConsulta") Long idConsulta);
	
}

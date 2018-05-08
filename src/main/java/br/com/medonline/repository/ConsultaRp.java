package br.com.medonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.medonline.modal.Consulta;
import br.com.medonline.modal.ConsultaPK;

@Repository
public interface ConsultaRp extends JpaRepository<Consulta, ConsultaPK>{
	
	@Query("SELECT m FROM Consulta m WHERE m.idConsulta = :idConsulta")
	public Consulta buscaConsultaPorID(@Param("idConsulta") Long idConsulta);

}

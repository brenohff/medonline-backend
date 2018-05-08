package br.com.medonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.medonline.modal.Diagnostico;

@Repository
public interface DiagnosticoRp extends JpaRepository<Diagnostico, Long>{
	
	@Query("SELECT m FROM Diagnostico m WHERE m.idDiagnostico = :idDiagnostico")
	public Diagnostico buscaDiagnosticoPorID(@Param("idDiagnostico") Long idDiagnostico);

}

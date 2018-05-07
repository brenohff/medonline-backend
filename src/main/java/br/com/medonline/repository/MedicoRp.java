package br.com.medonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.medonline.modal.Medico;

@Repository
public interface MedicoRp extends JpaRepository<Medico, Long>{
	
	@Query("SELECT m FROM Medico m WHERE m.idMedico = :idMedico")
	public Medico buscaMedicoPorID(@Param("idMedico") Long idMedico);

}

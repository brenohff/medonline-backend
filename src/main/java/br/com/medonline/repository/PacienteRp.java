package br.com.medonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.medonline.modal.Paciente;

public interface PacienteRp extends JpaRepository<Paciente, Long>{
	
	@Query("SELECT m FROM Paciente m WHERE m.idPaciente = :idPaciente")
	public Paciente buscaPacientePorID(@Param("idPaciente") Long idPaciente);

}

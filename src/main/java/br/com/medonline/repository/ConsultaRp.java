package br.com.medonline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.medonline.modal.Consulta;

@Repository
public interface ConsultaRp extends JpaRepository<Consulta, Long>{
	
	@Query("SELECT m FROM Consulta m WHERE m.idConsulta = :idConsulta")
	public Consulta buscaConsultaPorID(@Param("idConsulta") Long idConsulta);
	
	@Query("SELECT m FROM Consulta m WHERE m.paciente.idPaciente = :idPaciente")
	public List<Consulta> buscaConsultaPorPaciente(@Param("idPaciente") Long idPaciente);
	
	@Query("SELECT m FROM Consulta m WHERE m.medico.idMedico = :idMedico")
	public List<Consulta> buscaConsultaPorMedico(@Param("idMedico") Long idMedico);

}

package br.com.medonline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.medonline.modal.Especialidade;
import br.com.medonline.modal.Medico;

public interface EspecialidadeRp extends JpaRepository<Especialidade, Long> {

	@Query("SELECT e FROM Especialidade e WHERE e.idEspecialidade = :idEspecialidade")
	public List<Medico> buscaMedicoPorEspecialidade(@Param("idEspecialidade") Long idEspecialidade);

}

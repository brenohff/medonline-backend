package br.com.medonline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.medonline.modal.Especialidade;

public interface EspecialidadeRp extends JpaRepository<Especialidade, Long> {

	@Query("SELECT e.idEspecialidade, e.especialidade, e.descricao FROM Especialidade e")
	public List<Especialidade> buscaEspecialidadesSemMedicos();

}

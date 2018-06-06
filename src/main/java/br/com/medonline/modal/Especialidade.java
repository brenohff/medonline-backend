package br.com.medonline.modal;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "ESPECIALIDADE")
@JsonInclude(value = Include.NON_NULL)
public class Especialidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEspecialidade;
	private String especialidade;

	@OneToMany(mappedBy = "especialidade")
	private Set<Especialidade> medico;

	public Long getIdEspecialidade() {
		return idEspecialidade;
	}

	public void setIdEspecialidade(Long idEspecialidade) {
		this.idEspecialidade = idEspecialidade;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Set<Especialidade> getMedico() {
		return medico;
	}

	public void setMedico(Set<Especialidade> medico) {
		this.medico = medico;
	}

}

package br.com.medonline.modal;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "medico_especialidade", joinColumns = {
			@JoinColumn(name = "idEspecialidade") }, inverseJoinColumns = { @JoinColumn(name = "idMedico") })
	private Set<Medico> medicos = new HashSet<>();

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

	public Set<Medico> getMedicos() {
		return medicos;
	}

	public void setMedicos(Set<Medico> medicos) {
		this.medicos = medicos;
	}

}

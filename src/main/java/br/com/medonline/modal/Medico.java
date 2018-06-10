package br.com.medonline.modal;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "MEDICO")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Medico extends Usuario implements Serializable {

	private static final long serialVersionUID = -5888636092094648442L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMedico;

	private String crm;

	@ManyToOne()
	@JoinColumn(name = "idEspecialidade", nullable = false)
	private Especialidade especialidade;

	@OneToMany(mappedBy = "medico")
	private Set<Consulta> consulta;

	@OneToOne(mappedBy = "medico")
	private Avaliacao avaliacao;

	// GETTERS AND SETTERS

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	@JsonIgnore
	public Set<Consulta> getConsulta() {
		return consulta;
	}

	public void setConsulta(Set<Consulta> consulta) {
		this.consulta = consulta;
	}

	public Long getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Long idMedico) {
		this.idMedico = idMedico;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
}

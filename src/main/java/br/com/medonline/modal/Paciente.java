package br.com.medonline.modal;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "PACIENTE")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Paciente extends Usuario implements Serializable{

	private static final long serialVersionUID = -5521092415402813636L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPaciente;
	
	@OneToMany(mappedBy = "paciente")
	private Set<Consulta> consulta;

	private String observacao;

	//GETTERS AND SETTERS

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@JsonIgnore
	public Set<Consulta> getConsulta() {
		return consulta;
	}

	public void setConsulta(Set<Consulta> consulta) {
		this.consulta = consulta;
	}

	public Long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}
	
	
}

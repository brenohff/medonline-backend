package br.com.medonline.modal;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "CONSULTA")
@IdClass(value = ConsultaPK.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Consulta implements Serializable{

	private static final long serialVersionUID = -6861776569424067262L;

	@Id
	private Long idConsulta;
	@Id
	private Date dtConsulta;
	
	@ManyToOne()
	@JoinColumn(name = "idMedico", nullable = false)
	private Medico medico;
	
	@ManyToOne()
	@JoinColumn(name = "idPaciente", nullable = false)
	private Paciente paciente;
	
	@OneToMany(mappedBy = "consulta")
	private Set<Exame> exame;
	
	@OneToMany(mappedBy = "consulta")
	private Set<Diagnostico> diagnostico;
	
	private String assunto;

	
	//GETTERS AND SETTERS
	public Long getId() {
		return idConsulta;
	}

	public void setId(Long idConsulta) {
		this.idConsulta = idConsulta;
	}

	public Date getDt_consulta() {
		return dtConsulta;
	}

	public void setDt_consulta(Date dtConsulta) {
		this.dtConsulta = dtConsulta;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Set<Exame> getExame() {
		return exame;
	}

	public void setExame(Set<Exame> exame) {
		this.exame = exame;
	}

	public Long getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(Long idConsulta) {
		this.idConsulta = idConsulta;
	}

	public Date getDtConsulta() {
		return dtConsulta;
	}

	public void setDtConsulta(Date dtConsulta) {
		this.dtConsulta = dtConsulta;
	}

	public Set<Diagnostico> getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(Set<Diagnostico> diagnostico) {
		this.diagnostico = diagnostico;
	}
	
}

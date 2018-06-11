package br.com.medonline.modal;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "CONSULTA")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Consulta implements Serializable {

	private static final long serialVersionUID = -6861776569424067262L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idConsulta;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
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

	@OneToMany
	private List<Mensagem> mensagens;

	private String assunto;

	// GETTERS AND SETTERS
	
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

	@JsonIgnore
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

	public Set<Diagnostico> getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(Set<Diagnostico> diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

}

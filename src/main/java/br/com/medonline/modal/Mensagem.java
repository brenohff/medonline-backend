package br.com.medonline.modal;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "MENSAGEM")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Mensagem implements Serializable {
	private static final long serialVersionUID = -3927792816439708699L;
	
	@Id
	@GeneratedValue
	private Long idMensagem;
	private String texto;
	private Date dtMensagem;
	private boolean fromPaciente;

	@ManyToOne
    @JoinColumn(name = "idConsulta", nullable = false)
	private Consulta consulta;


	//region GETTERS AND SETTERS

	public Long getIdMensagem() {
		return idMensagem;
	}

	public void setIdMensagem(Long idMensagem) {
		this.idMensagem = idMensagem;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getDtMensagem() {
		return dtMensagem;
	}

	public void setDtMensagem(Date dtMensagem) {
		this.dtMensagem = dtMensagem;
	}

	public boolean isFromPaciente() {
		return fromPaciente;
	}

	public void setFromPaciente(boolean fromPaciente) {
		this.fromPaciente = fromPaciente;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	//endregion
}

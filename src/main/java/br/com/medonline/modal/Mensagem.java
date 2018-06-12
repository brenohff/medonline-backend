package br.com.medonline.modal;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
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
	private Date data;
	private boolean fromPaciente;

	@ManyToOne
    @JoinColumn(name = "idConsulta", nullable = false)
	private Consulta consulta;

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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
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
}

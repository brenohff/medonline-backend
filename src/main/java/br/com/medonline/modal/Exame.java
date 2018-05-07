package br.com.medonline.modal;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "EXAME")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Exame implements Serializable{

	private static final long serialVersionUID = -4597136780748713679L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idExame;
	
	private String tipo;
	private Date dtExame;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
	  @JoinColumn(name = "idConsulta", insertable = false, updatable = false),
	  @JoinColumn(name = "dtConsulta", insertable = false, updatable = false)
	})
	private Consulta consulta;

	
	
	//GETTERS AND SETTERS
	public Long getIdExame() {
		return idExame;
	}

	public void setIdExame(Long idExame) {
		this.idExame = idExame;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getDtExame() {
		return dtExame;
	}

	public void setDtExame(Date dtExame) {
		this.dtExame = dtExame;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}	
}

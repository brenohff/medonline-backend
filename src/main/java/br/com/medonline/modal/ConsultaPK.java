package br.com.medonline.modal;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class ConsultaPK implements Serializable{

	private static final long serialVersionUID = -1034132075117017771L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idConsulta;	
	private Date dtConsulta;
	
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
	
	
}

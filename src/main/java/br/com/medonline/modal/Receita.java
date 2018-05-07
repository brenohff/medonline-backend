package br.com.medonline.modal;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "RECEITA")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Receita implements Serializable {
	
	private static final long serialVersionUID = -872597292408168024L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReceita;
	
	private String descricao;
	private Date dtReceita;
	
	@ManyToOne()
	@JoinColumn(name = "idDiagnostico", nullable = false)
	private Diagnostico diagnostico;
	
	
	//GETTERS AND SETTERS
	public Long getIdReceita() {
		return idReceita;
	}
	public void setIdReceita(Long idReceita) {
		this.idReceita = idReceita;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDtReceita() {
		return dtReceita;
	}
	public void setDtReceita(Date dtReceita) {
		this.dtReceita = dtReceita;
	}
	public Diagnostico getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(Diagnostico diagnostico) {
		this.diagnostico = diagnostico;
	}
	
}

package br.com.medonline.modal;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "RECEITA")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Receita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReceita;
	
	private String descricao;
	private Date dtReceita;
	
	
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
}

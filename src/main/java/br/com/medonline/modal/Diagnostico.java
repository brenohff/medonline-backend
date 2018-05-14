package br.com.medonline.modal;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "DIAGNOSTICO")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Diagnostico implements Serializable {

	private static final long serialVersionUID = 6143178888116852498L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDiagnostico;

	@OneToMany(mappedBy = "diagnostico")
	private Set<Receita> receita;

	private String resultado;
	private String descricao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idConsulta", insertable = false, updatable = false)
	private Consulta consulta;

	// GETTERS AND SETTERS
	public Long getIdDiagnostico() {
		return idDiagnostico;
	}

	public void setIdDiagnostico(Long idDiagnostico) {
		this.idDiagnostico = idDiagnostico;
	}

	public Set<Receita> getReceita() {
		return receita;
	}

	public void setReceita(Set<Receita> receita) {
		this.receita = receita;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

}

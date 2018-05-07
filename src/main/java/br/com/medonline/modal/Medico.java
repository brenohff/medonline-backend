package br.com.medonline.modal;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

import br.com.medonline.TipoSexo;

@Entity
@Table(name = "MEDICO")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Medico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMedico;
	
	private String nome;
	private String crm;
	private String especialidade;
	
	@ManyToOne()
	@JoinColumn(name = "idEndereco", nullable = false)
	private Endereco endereco;
	
	@OneToMany(mappedBy = "medico")
	private Set<Consulta> consulta;
	
	private TipoSexo sexo;


	//GETTERS AND SETTERS
	public Long getId() {
		return idMedico;
	}

	public void setId(Long idMedico) {
		this.idMedico = idMedico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public TipoSexo getSexo() {
		return sexo;
	}

	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}

	public Set<Consulta> getConsulta() {
		return consulta;
	}

	public void setConsulta(Set<Consulta> consulta) {
		this.consulta = consulta;
	}
	
}

package br.com.medonline.modal;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "ENDERECO")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEndereco;
	
	private String cep;
	private String complemento;
	private String logradouro;
	
	@OneToMany(mappedBy = "endereco")
	private Set<Medico> medico;
	
	@OneToMany(mappedBy = "endereco")
	private Set<Paciente> paciente;

	
	//GETTERS AND SETTERS
	public Long getId() {
		return idEndereco;
	}

	public void setId(Long idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	@JsonIgnore
	public Set<Medico> getMedico() {
		return medico;
	}

	public void setMedico(Set<Medico> medico) {
		this.medico = medico;
	}

	@JsonIgnore
	public Set<Paciente> getPaciente() {
		return paciente;
	}

	public void setPaciente(Set<Paciente> paciente) {
		this.paciente = paciente;
	}
	
}

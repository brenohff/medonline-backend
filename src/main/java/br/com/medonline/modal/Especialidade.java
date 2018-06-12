package br.com.medonline.modal;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "ESPECIALIDADE")
@JsonInclude(value = Include.NON_NULL)
public class Especialidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEspecialidade;
    private String especialidade;
    private String descricao;

    @OneToMany(mappedBy = "especialidade")
    private Set<Medico> medico;


    //region GETTERS AND SETTERS
    public Long getIdEspecialidade() {
        return idEspecialidade;
    }

    public void setIdEspecialidade(Long idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @JsonIgnore
    public Set<Medico> getMedico() {
        return medico;
    }

    public void setMedico(Set<Medico> medico) {
        this.medico = medico;
    }

    //endregion
}

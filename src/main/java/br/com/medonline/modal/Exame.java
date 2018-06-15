package br.com.medonline.modal;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "EXAME")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Exame implements Serializable {

    private static final long serialVersionUID = -4597136780748713679L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExame;
    private String tipo;
    private String descricao;
    private Date dtExame;

    @ManyToOne
    @JoinColumn(name = "idConsulta")
    private Consulta consulta;

    @Transient
    private Long idConsulta;

    //region GETTERS AND SETTERS
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

    @JsonIgnore
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Long idConsulta) {
        this.idConsulta = idConsulta;
    }

    //endregion

}

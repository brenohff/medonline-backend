package br.com.medonline.modal;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "DIAGNOSTICO")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Diagnostico implements Serializable {

    private static final long serialVersionUID = 6143178888116852498L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDiagnostico;
    private String resultado;
    private String descricao;

    @OneToMany(mappedBy = "diagnostico")
    private Set<Receita> receita;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idConsulta")
    private Consulta consulta;

    @Transient
    private Long idConsulta;


    //region GETTERS AND SETTERS
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

    @JsonIgnore
    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Long getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Long idConsulta) {
        this.idConsulta = idConsulta;
    }

    //endregion

}

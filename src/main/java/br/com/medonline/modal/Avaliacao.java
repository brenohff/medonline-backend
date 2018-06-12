package br.com.medonline.modal;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "AVALIACAO")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Avaliacao implements Serializable {

    @Id
    @GeneratedValue
    private Long idAvaliacao;
    private Integer upVotes;
    private Integer downVotes;

    @OneToOne
    private Medico medico;


    //region GETTERS AND SETTERS

    public Long getIdAvaliacao() {
        return idAvaliacao;
    }

    public void setIdAvaliacao(Long idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }

    public Integer getUpVotes() {
        return upVotes;
    }

    public void setUpVotes(Integer upVotes) {
        this.upVotes = upVotes;
    }

    public Integer getDownVotes() {
        return downVotes;
    }

    public void setDownVotes(Integer downVotes) {
        this.downVotes = downVotes;
    }

    //endregion
}

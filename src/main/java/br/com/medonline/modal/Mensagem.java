package br.com.medonline.modal;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "MENSAGEM")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Mensagem implements Serializable {

    @Id
    @GeneratedValue
    private Long idMensagem;

    private String texto;

    private LocalDateTime data;

    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario autor;

    @ManyToOne(fetch = FetchType.LAZY)
    private Consulta consulta;

    public Long getIdMensagem() {
        return idMensagem;
    }

    public void setIdMensagem(Long idMensagem) {
        this.idMensagem = idMensagem;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }
}

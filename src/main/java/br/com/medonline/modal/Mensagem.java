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
    private boolean fromPaciente;
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

    public boolean isFromPaciente() {
        return fromPaciente;
    }

    public void setFromPaciente(boolean fromPaciente) {
        this.fromPaciente = fromPaciente;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
}

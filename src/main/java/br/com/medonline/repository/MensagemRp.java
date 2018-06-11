package br.com.medonline.repository;

import br.com.medonline.modal.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MensagemRp extends JpaRepository<Mensagem, Long> {

    @Query("SELECT m FROM Mensagem m WHERE m.consulta.idConsulta = :idConsulta")
    public List<Mensagem> buscaMensagensPorConsulta(@Param("idConsulta") Long idConsulta);

}

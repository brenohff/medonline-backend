package br.com.medonline.repository;

import br.com.medonline.modal.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensagemRp extends JpaRepository<Mensagem, Long> {

}

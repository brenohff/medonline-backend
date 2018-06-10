package br.com.medonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.medonline.modal.Medico;

@Repository
public interface MedicoRp extends JpaRepository<Medico, Long> {

    Medico findByEmailAndSenha(String email, String senha);

}

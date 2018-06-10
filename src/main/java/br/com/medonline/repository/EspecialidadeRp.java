package br.com.medonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.medonline.modal.Especialidade;

public interface EspecialidadeRp extends JpaRepository<Especialidade, Long> {

}

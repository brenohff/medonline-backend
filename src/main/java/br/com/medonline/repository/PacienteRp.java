package br.com.medonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.medonline.modal.Paciente;

public interface PacienteRp extends JpaRepository<Paciente, Long>{

}

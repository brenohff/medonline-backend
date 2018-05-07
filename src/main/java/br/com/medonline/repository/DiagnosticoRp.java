package br.com.medonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.medonline.modal.Diagnostico;

@Repository
public interface DiagnosticoRp extends JpaRepository<Diagnostico, Long>{

}

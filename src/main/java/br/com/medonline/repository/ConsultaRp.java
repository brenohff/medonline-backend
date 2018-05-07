package br.com.medonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.medonline.modal.Consulta;
import br.com.medonline.modal.ConsultaPK;

@Repository
public interface ConsultaRp extends JpaRepository<Consulta, ConsultaPK>{

}

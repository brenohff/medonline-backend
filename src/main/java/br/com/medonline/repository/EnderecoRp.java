package br.com.medonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.medonline.modal.Endereco;

@Repository
public interface EnderecoRp extends JpaRepository<Endereco, Long>{

}

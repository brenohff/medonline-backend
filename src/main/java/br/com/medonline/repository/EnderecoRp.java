package br.com.medonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.medonline.modal.Endereco;

@Repository
public interface EnderecoRp extends JpaRepository<Endereco, Long>{
	
	@Query("SELECT m FROM Endereco m WHERE m.idEndereco = :idEndereco")
	public Endereco buscaEnderecoPorID(@Param("idEndereco") Long idEndereco);

}

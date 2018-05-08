package br.com.medonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.medonline.modal.Receita;

@Repository
public interface ReceitaRp extends JpaRepository<Receita, Long>{
	
	@Query("SELECT r FROM Receita r WHERE r.idReceita = :idReceita")
	public Receita buscaReceitaPorID(@Param("idReceita") Long idReceita);

}

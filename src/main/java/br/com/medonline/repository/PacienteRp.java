package br.com.medonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.medonline.modal.Paciente;

public interface PacienteRp extends JpaRepository<Paciente, Long>{
	
	@Query("SELECT p FROM Paciente p WHERE p.email = :email")
	public Paciente buscaPacientePorEmail(@Param("email") String email);

	Paciente findByEmailAndSenha(String email, String senha);

}

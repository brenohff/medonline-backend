package br.com.medonline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.medonline.modal.Medico;

@Repository
public interface MedicoRp extends JpaRepository<Medico, Long> {

    Medico findByEmailAndSenha(String email, String senha);

    @Query("SELECT m FROM Medico m WHERE m.especialidade.idEspecialidade = :idEspecialidade")
    public List<Medico> buscaMedicoPelaEspecialidade(@Param("idEspecialidade") Long idEspecialidade);


    @Query("SELECT m FROM Medico m WHERE m.email = :email")
    Medico findByEmail(@Param("email") String email);
}

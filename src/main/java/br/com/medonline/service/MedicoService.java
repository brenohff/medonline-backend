package br.com.medonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medonline.modal.Medico;
import br.com.medonline.repository.EnderecoRp;
import br.com.medonline.repository.MedicoRp;
import br.com.medonline.service.exception.CouldNotSave;
import br.com.medonline.service.exception.NotFound;

@Service
public class MedicoService {

    @Autowired
    MedicoRp repository;

    @Autowired
    EnderecoRp endRepository;

    public List<Medico> buscaMedicos() {
        return repository.findAll();
    }

    public void salvarMedico(Medico medico) {
        try {
            endRepository.save(medico.getEndereco());
        } catch (Exception e) {
            throw new CouldNotSave("Não foi possível salvar objeto, verifique endereço.");
        }
        repository.save(medico);
    }

    public Medico buscaMedicoPorID(Long idMedico) {
        try {
            return repository.findById(idMedico).get();
        } catch (Exception e) {
            throw new NotFound("Médico não encontrado.");
        }
    }

    public Medico buscarPorEmailESenha(String email, String senha) {
        return repository.findByEmailAndSenha(email, senha);
    }

    public Medico buscaMedicoPeloEmail(String email) {
        return repository.findByEmail(email);
    }

    public List<Medico> buscaMedicoPelaEspecialidade(Long idEspecialidade) {
        return repository.buscaMedicoPelaEspecialidade(idEspecialidade);
    }

}

package br.com.medonline;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.medonline.modal.Endereco;
import br.com.medonline.modal.Paciente;
import br.com.medonline.modal.TipoSexo;
import br.com.medonline.service.PacienteService;

@SpringBootApplication
public class MedOnlineApplication implements CommandLineRunner {

	@Autowired
	private PacienteService service;

	public static void main(String[] args) {
		SpringApplication.run(MedOnlineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Paciente p = new Paciente();
		p.setEmail("brenohff@gmail.com");
		p.setNome("Breno Henrique Ferreira Franco");
		p.setSexo(TipoSexo.MASC);
		p.setDtNascimento(new Date());

		Endereco e = new Endereco();
		e.setCep("72320-301");
		e.setLogradouro("QI 416 conjunto 1 bl. A apto. 1204");
		e.setComplemento("Residencial das Palmeiras");
		
		p.setEndereco(e);
		p.setObservacao("Paciente com problemas no joelho.");
		
		
		service.salvarPaciente(p);

	}
}

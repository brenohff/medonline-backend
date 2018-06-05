package br.com.medonline;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MedOnlineApplication implements CommandLineRunner {

//	@Autowired
//	private PacienteService service;

	public static void main(String[] args) {
		SpringApplication.run(MedOnlineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Paciente p = new Paciente();
//		p.setEmail("brenohff@gmail.com");
//		p.setNome("Breno Henrique Ferreira Franco");
//		p.setSexo(TipoSexo.MASC);
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		p.setDtNascimento((Date) dateFormat.parse("22/05/1996"));
//
//		Endereco e = new Endereco();
//		e.setCep("72320-301");
//		e.setLogradouro("QI 416 conjunto 1 bl. A apto. 1204");
//		e.setComplemento("Residencial das Palmeiras");
//		
//		p.setEndereco(e);
//		p.setObservacao("Paciente com problemas no joelho.");
//		
//		
//		service.salvarPaciente(p);

	}
}

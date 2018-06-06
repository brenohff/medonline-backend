package br.com.medonline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.medonline.modal.Endereco;
import br.com.medonline.modal.Medico;
import br.com.medonline.modal.TipoSexo;
import br.com.medonline.service.EspecialidadeService;
import br.com.medonline.service.MedicoService;

@SpringBootApplication
public class MedOnlineApplication implements CommandLineRunner {

	@Autowired
	private MedicoService medService;
	@Autowired
	private EspecialidadeService espService;

	public static void main(String[] args) {
		SpringApplication.run(MedOnlineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Medico m = new Medico();
		m.setNome("Gregory House");
		m.setCrm("22051996");
		m.setSexo(TipoSexo.MASC);
		m.setEspecialidade(espService.buscaEspecialidadePorID(492l));
		
		Endereco e = new Endereco();
		e.setCep("70123-456");
		e.setLogradouro("SCS Bloco 6 Ed. Sofia");
		e.setComplemento("2 andar");
		
		m.setEndereco(e);
		medService.salvarMedico(m);
		
	}
}

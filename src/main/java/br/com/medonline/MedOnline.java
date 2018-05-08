package br.com.medonline;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MedOnline {
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Materia medOnline(){
		List<Aluno> alunos = new ArrayList<>();
		alunos.add(new Aluno("21506159", "Breno Henrique"));
		alunos.add(new Aluno("21508281", "Mônica Figueiredo"));
		alunos.add(new Aluno("21500856", "Gabriel Formiga"));
		alunos.add(new Aluno("21501848", "Matheus Damásio"));
		alunos.add(new Aluno("21501004", "Guilherme Morum"));
		alunos.add(new Aluno("21448633", "Samuel Ribeiro"));
		
		Materia materia = new Materia();
		materia.setProjeto("MedOnline");
		materia.setMateria("Estágio Supervisionado");
		materia.setVersao("0.0.1-SNAPSHOT");
		materia.setAlunos(alunos);
		
		return materia;
	}
	
	public class Aluno {	
		private String ra;
		private String nome;
		
		public Aluno(String ra, String nome) {
			super();
			this.ra = ra;
			this.nome = nome;
		}

		public String getRa() {
			return ra;
		}

		public void setRa(String ra) {
			this.ra = ra;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
	}
	
	public class Materia{
		private String projeto;
		private String materia;
		private String versao;
		private List<Aluno> alunos;
		
		public String getProjeto() {
			return projeto;
		}
		public void setProjeto(String projeto) {
			this.projeto = projeto;
		}
		public String getMateria() {
			return materia;
		}
		public void setMateria(String materia) {
			this.materia = materia;
		}
		public String getVersao() {
			return versao;
		}
		public void setVersao(String versao) {
			this.versao = versao;
		}
		public List<Aluno> getAlunos() {
			return alunos;
		}
		public void setAlunos(List<Aluno> alunos) {
			this.alunos = alunos;
		}
	}

}

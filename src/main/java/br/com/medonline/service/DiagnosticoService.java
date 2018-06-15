package br.com.medonline.service;

import java.util.List;

import br.com.medonline.modal.Consulta;
import br.com.medonline.modal.Receita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medonline.modal.Diagnostico;
import br.com.medonline.repository.DiagnosticoRp;
import br.com.medonline.service.exception.NotFound;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DiagnosticoService {
	
	@Autowired
	private DiagnosticoRp repository;

	@Autowired
	private ConsultaService consultaService;

	@Autowired
	private ReceitaService receitaService;
	
	public List<Diagnostico> buscaDiagnosticos(){
		return repository.findAll();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void salvarDiagnostico(Diagnostico diagnostico) {
		Consulta consulta = consultaService.buscaConsultaPorID(diagnostico.getIdConsulta());
		diagnostico = repository.save(diagnostico);
		diagnostico.setConsulta(consulta);
		for(Receita receita : diagnostico.getReceita()){
			receita.setDiagnostico(diagnostico);
			receitaService.salvarReceita(receita);
		}
		if(diagnostico.getConsulta() != null){
			consulta.setFinalizada(true);
			consultaService.salvarConsulta(consulta);
		}
	}
	
	public Diagnostico buscaDiagnosticoPorID(Long idDiagnostico) {
		Diagnostico m = repository.buscaDiagnosticoPorID(idDiagnostico);
		
		if(m != null) {
			return m;
		}else {
			throw new NotFound("Diagnóstico não encontrado.");
		}
	}

}

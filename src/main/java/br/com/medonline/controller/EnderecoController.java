package br.com.medonline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.medonline.modal.Endereco;
import br.com.medonline.service.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
	
	@Autowired
	EnderecoService service;
	
	@RequestMapping("/buscaTodos")
	public List<Endereco> buscaTodos(){
		return service.buscaEnderecos();
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public void salvar(@RequestBody Endereco Endereco){
		service.salvarEndereco(Endereco);
	}
	
	@RequestMapping(value = "/buscaEnderecoPeloID")
	public Endereco getByFaceID(@RequestParam(value="idEndereco") Long idEndereco) {
		return service.buscaEnderecoPorID(idEndereco);
	}

}

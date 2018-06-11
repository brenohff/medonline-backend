package br.com.medonline.controller;

import br.com.medonline.modal.Mensagem;
import br.com.medonline.service.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mensagem")
public class MensagemController {

    @Autowired
    MensagemService service;

    @RequestMapping("/buscaTodos")
    public List<Mensagem> buscaTodos() {
        return service.buscaTodas();
    }

    @RequestMapping("/buscaMensagensPorConsulta")
    public List<Mensagem> buscaMensagensPorConsulta(@RequestParam(value = "idConsulta") Long idConsulta) {
        return service.buscaMensagensPorConsulta(idConsulta);
    }
}

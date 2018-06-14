package br.com.medonline.Controller;

import br.com.medonline.controller.MensagemController;
import br.com.medonline.modal.Mensagem;
import br.com.medonline.repository.MensagemRp;
import br.com.medonline.service.MensagemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;

@RunWith(PowerMockRunner.class)
public class MensagemControllerTest {

    @InjectMocks
    private MensagemController mensagemController;

    @Mock
    private MensagemService mensagemService;

    @Test
    public void salvar(){
        mensagemController.salvarMensagem(new Mensagem());
    }

    @Test
    public void buscarMensagegm(){
        List<Mensagem> mensagems = mensagemController.buscaTodos();
        assertNotNull(mensagems);
    }

    @Test
    public void buscarPorId(){
        List<Mensagem> mensagems = mensagemController.buscaMensagensPorConsulta(1L);
        assertNotNull(mensagems);
    }}

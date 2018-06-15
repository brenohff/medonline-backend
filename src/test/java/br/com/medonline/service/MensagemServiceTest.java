package br.com.medonline.service;

import br.com.medonline.modal.Mensagem;
import br.com.medonline.repository.MensagemRp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
public class MensagemServiceTest {

    @InjectMocks
    private MensagemService mensagemService;

    @Mock
    private MensagemRp mensagemRp;

    @Test
    public void buscarTodos(){
        List<Mensagem> mensagems = mensagemService.buscaTodas();
        assertNotNull(mensagems);
    }

    @Test
    public void buscarPorID(){
        List<Mensagem> mensagems = mensagemService.buscaMensagensPorConsulta(1L);
        assertNotNull(mensagems);
    }
}

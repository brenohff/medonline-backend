package br.com.medonline.Controller;

import br.com.medonline.controller.ConsultaController;
import br.com.medonline.modal.Consulta;
import br.com.medonline.modal.Mensagem;
import br.com.medonline.service.ConsultaService;
import br.com.medonline.service.MensagemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;

@RunWith(PowerMockRunner.class)
public class ConsultaControllerTest {

    @InjectMocks
    private ConsultaController consultaController;

    @Mock
    private ConsultaService consultaService;

    @Mock
    private MensagemService mensagemService;

    @Test
    public void buscarTodos(){
        List<Consulta> consultaList = consultaController.buscaTodos();
        assertNotNull(consultaList);
    }

    @Test
    public void salvar(){
        Consulta consulta = new Consulta();
        consultaController.salvar(consulta);
    }

    @Test
    public void getByFaceID(){
        Consulta consulta = consultaController.getByFaceID(1L);
        assertNull(consulta);
    }

    @Test
    public void enviaMensagem(){
        Mensagem mensagem = consultaController.enviaMensagem("teste", new Mensagem());
        assertNotNull(mensagem);
    }
}

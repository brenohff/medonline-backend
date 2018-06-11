package br.com.medonline.Controller;

import br.com.medonline.controller.ExameController;
import br.com.medonline.modal.Exame;
import br.com.medonline.service.ExameService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;

@RunWith(PowerMockRunner.class)
public class ExameControllerTest {

    @InjectMocks
    private ExameController exameController;

    @Mock
    private ExameService exameService;

    @Test
    public void buscarTodos(){
        List<Exame> exameList = exameController.buscaTodos();
        assertNotNull(exameList);
    }

    @Test
    public void salvar(){
        exameController.salvar(new Exame());
    }

    @Test
    public void getByFaceId(){
        Exame exame = exameController.getByFaceID(1L);
        assertNull(exame);
    }

    @Test
    public void buscaExamePelaConsulta(){
        List<Exame> exameList = exameController.buscaExamePelaConsulta(1L);
        assertNotNull(exameList);
    }

}

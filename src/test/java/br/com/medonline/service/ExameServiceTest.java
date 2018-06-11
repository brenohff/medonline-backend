package br.com.medonline.service;

import br.com.medonline.modal.Exame;
import br.com.medonline.repository.ExameRp;
import br.com.medonline.service.exception.CouldNotSave;
import br.com.medonline.service.exception.NotFound;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;

@RunWith(PowerMockRunner.class)
public class ExameServiceTest {

    @InjectMocks
    private ExameService exameService;

    @Mock
    private ExameRp exameRp;

    @Test
    public void buscarTdoso(){
        List<Exame> exameList = exameService.buscaExames();
        assertNotNull(exameList);
    }

    @Test(expected = NotFound.class)
    public void buscarPorId(){
        Exame exame = exameService.buscaExamePorID(1L);
    }

    @Test(expected = CouldNotSave.class)
    public void salvar(){
        Exame exame = new Exame();
        exameService.salvarExame(exame);
    }

    @Test
    public void buscaExamePelaConsulta(){
        List<Exame> exameList = exameService.buscaExamePelaConsulta(1L);
        assertNotNull(exameList);
    }
}

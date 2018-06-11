package br.com.medonline.Controller;

import br.com.medonline.controller.EspecialidadeController;
import br.com.medonline.modal.Especialidade;
import br.com.medonline.service.EspecialidadeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;

@RunWith(PowerMockRunner.class)
public class EspecialidadeControllerTest {

    @InjectMocks
    private EspecialidadeController controller;

    @Mock
    private EspecialidadeService especialidadeService;

    @Test
    public void buscarTodos(){
        List<Especialidade> especialidadeList = controller.buscaTodos();
        assertNotNull(especialidadeList);
    }

    @Test
    public void salvar(){
        controller.salvar(new Especialidade());
    }

    @Test
    public void buscarPorID(){
        Especialidade especialidade = controller.buscaEspecialidadePorID(1L);
        assertNull(especialidade);
    }
}

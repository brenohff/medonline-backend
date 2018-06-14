package br.com.medonline.Controller;

import br.com.medonline.controller.ReceitaController;
import br.com.medonline.modal.Receita;
import br.com.medonline.service.ReceitaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;

@RunWith(PowerMockRunner.class)
public class ReceitaControllerTest {

    @InjectMocks
    private ReceitaController receitaController;

    @Mock
    private ReceitaService receitaService;

    @Test
    public void salvar(){
        receitaController.salvar(new Receita());
    }

    @Test
    public void buscarTodos(){
        List<Receita> receitaList = receitaController.buscaTodos();
        assertNotNull(receitaList);
    }

    @Test
    public void buscarReceita(){
        Receita receita = receitaController.getByFaceID(1L);
        assertNull(receita);
    }
}

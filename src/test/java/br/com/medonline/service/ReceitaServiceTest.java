package br.com.medonline.service;

import br.com.medonline.modal.Receita;
import br.com.medonline.repository.ReceitaRp;
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
public class ReceitaServiceTest {

    @InjectMocks
    private ReceitaService receitaService;

    @Mock
    private ReceitaRp receitaRp;

    @Test(expected = NotFound.class)
    public void buscarReceitaPorId(){
        Receita receita = receitaService.buscaReceitaPorID(1L);
        assertNull(receita);
    }

    @Test
    public void salvarReceita(){
        Receita receita = new Receita();
        receitaService.salvarReceita(receita);
    }

    @Test
    public void buscarTodas(){
        List<Receita> receitas = receitaService.buscaReceitas();
        assertNotNull(receitas);
    }
}

package br.com.medonline.service;

import br.com.medonline.modal.Endereco;
import br.com.medonline.modal.Especialidade;
import br.com.medonline.repository.EspecialidadeRp;
import br.com.medonline.service.exception.NotFound;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;

@RunWith(PowerMockRunner.class)
public class EspecialidadeServiceTest {

    @InjectMocks
    private EspecialidadeService especialidadeService;

    @Mock
    private EspecialidadeRp especialidadeRp;

    @Test
    public void buscarTodas(){
        List<Especialidade> especialidadeList = especialidadeService.buscaEspecialidades();
        assertNotNull(especialidadeList);
    }

    @Test
    public void salvar(){
        Especialidade especialidade = new Especialidade();
        especialidadeService.salvarEspecialidade(especialidade);
    }

    @Test(expected = NotFound.class)
    public void buscarPorId(){
        Especialidade especialidade = especialidadeService.buscaEspecialidadePorID(1L);
    }
}

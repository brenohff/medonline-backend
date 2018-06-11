package br.com.medonline.service;

import br.com.medonline.modal.Medico;
import br.com.medonline.repository.MedicoRp;
import br.com.medonline.service.exception.CouldNotSave;
import br.com.medonline.service.exception.NotFound;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(PowerMockRunner.class)
public class MedicoServiceTest {

    @InjectMocks
    private MedicoService medicoService;

    @Mock
    private MedicoRp medicoRp;

    @Test
    public void buscarTodos(){
        List<Medico> medicoList = medicoService.buscaMedicos();
        assertNotNull(medicoList);
    }

    @Test(expected = CouldNotSave.class)
    public void salvar(){
        Medico medico = new Medico();
        medicoService.salvarMedico(medico);
    }

    @Test(expected = NotFound.class)
    public void buscarPorId(){
        Medico medico = medicoService.buscaMedicoPorID(1L);
    }

    @Test
    public void buscarPorEmailESenha(){
        Medico medico = medicoService.buscarPorEmailESenha("test","teste");
        assertNull(medico);
    }

    @Test
    public void buscarPorEspecialidade(){
        List<Medico> medicoList = medicoService.buscaMedicoPelaEspecialidade(1L);
        assertNotNull(medicoList);
    }
}

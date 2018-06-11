package br.com.medonline.Controller;

import br.com.medonline.controller.MedicoController;
import br.com.medonline.modal.Medico;
import br.com.medonline.service.MedicoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(PowerMockRunner.class)
public class MedicoControllerTest {

    @InjectMocks
    private MedicoController medicoController;

    @Mock
    private MedicoService medicoService;

    @Test
    public void salvar(){
        medicoController.salvar(new Medico());
    }

    @Test
    public void buscaTodos(){
        List<Medico> medicoList = medicoController.buscaTodos();
        assertNotNull(medicoList);
    }

    @Test
    public void buscaMedicoPelaEspecialidade(){
        List<Medico> medicoList = medicoController.buscaMedicoPelaEspecialidade(1L);
        assertNotNull(medicoList);
    }

    @Test
    public void getByEmail(){
        Medico medico = medicoController.getByEmail("teste");
        assertNull(medico);
    }

    @Test
    public void getByFaceID(){
        Medico medico = medicoController.getByFaceID(1L);
        assertNull(medico);
    }
}

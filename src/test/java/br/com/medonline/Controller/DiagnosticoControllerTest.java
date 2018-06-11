package br.com.medonline.Controller;

import br.com.medonline.controller.DiagnosticoController;
import br.com.medonline.modal.Diagnostico;
import br.com.medonline.service.DiagnosticoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;

@RunWith(PowerMockRunner.class)
public class DiagnosticoControllerTest {

    @InjectMocks
    private DiagnosticoController diagnosticoController;

    @Mock
    private DiagnosticoService diagnosticoService;

    @Test
    public void buscaTodos(){
        List<Diagnostico> consultaList = diagnosticoController.buscaTodos();
        assertNotNull(consultaList);
    }

    @Test
    public void salvar(){
        diagnosticoController.salvar(new Diagnostico());
    }

    @Test
    public void getByFaceID(){
        Diagnostico diagnostico = diagnosticoController.getByFaceID(1L);
        assertNull(diagnostico);
    }
}

package br.com.medonline.service;

import br.com.medonline.modal.Diagnostico;
import br.com.medonline.repository.DiagnosticoRp;
import br.com.medonline.service.exception.NotFound;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;

@RunWith(PowerMockRunner.class)
public class DiagnosticoServiceTest {

    @InjectMocks
    private DiagnosticoService diagnosticoService;

    @Mock
    private DiagnosticoRp diagnosticoRp;

    @Test
    public void buscaTodas(){
        List<Diagnostico> diagnosticoList = diagnosticoService.buscaDiagnosticos();
        assertNotNull(diagnosticoList);
    }

    @Test(expected = NotFound.class)
    public void buscarPorId(){
        Diagnostico diagnostico = diagnosticoService.buscaDiagnosticoPorID(1L);
    }
}

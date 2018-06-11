package br.com.medonline.service;

import br.com.medonline.modal.Consulta;
import br.com.medonline.repository.ConsultaRp;
import br.com.medonline.service.exception.NotFound;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;

@RunWith(PowerMockRunner.class)
public class ConsultaServiceTest {

    @InjectMocks
    private ConsultaService consultaService;

    @Mock
    private ConsultaRp consultaRp;

    @Test
    public void buscarTodas(){
        List<Consulta> consultaList = consultaService.buscaConsultas();
        assertNotNull(consultaList);
    }

    @Test
    public void salvarConsulta(){
        Consulta consulta = new Consulta();
        consultaService.salvarConsulta(consulta);
    }

    @Test(expected = NotFound.class)
    public void buscarConsultaPorId(){
        Consulta consulta = consultaService.buscaConsultaPorID(1L);
    }
}

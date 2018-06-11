package br.com.medonline.service;

import br.com.medonline.modal.Paciente;
import br.com.medonline.repository.EnderecoRp;
import br.com.medonline.repository.PacienteRp;
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
public class PacienteServiceTest {

    @InjectMocks
    private PacienteService pacienteService;

    @Mock
    private EnderecoRp enderecoRp;

    @Mock
    private PacienteRp pacienteRp;

    @Mock
    private Paciente pacienteTest;

    @Test
    public void salvarPaciente(){
        Paciente paciente = new Paciente();
        pacienteService.salvarPaciente(paciente);
    }

    @Test
    public void buscarPacientes(){
        List<Paciente> pacientes = pacienteService.buscarPacientes();
        assertNotNull(pacientes);
    }

    @Test(expected = NotFound.class)
    public void buscaPacientePorID(){
        Paciente paciente = pacienteService.buscaPacientePorID(1L);
        assertNull(paciente);
    }

    @Test
    public void buscaPacientePorEmail(){
        Paciente paciente = pacienteService.buscaPacientePorEmail("test");
        assertNull(paciente);
    }

    @Test
    public void atualizarPaciente(){
        pacienteService.atualizarPaciente(pacienteTest);
    }

    @Test
    public void buscaPacientePorEmaileSenha(){
        Paciente paciente = pacienteService.buscaPorEmailESenha("test","teste");
        assertNull(paciente);
    }
}

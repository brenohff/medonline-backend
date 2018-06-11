package br.com.medonline.Controller;

import br.com.medonline.controller.PacienteController;
import br.com.medonline.modal.Paciente;
import br.com.medonline.modal.Usuario;
import br.com.medonline.service.MedicoService;
import br.com.medonline.service.PacienteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;

import static junit.framework.TestCase.assertNull;

@RunWith(PowerMockRunner.class)
public class PacienteControllerTest {

    @InjectMocks
    private PacienteController pacienteController;

    @Mock
    private PacienteService pacienteService;

    @Mock
    private MedicoService medicoService;

    @Test
    public void salvar(){
        pacienteController.salvar(new Paciente());
    }

    @Test
    public void atualizar(){
        pacienteController.atualizar(new Paciente());
    }

    @Test
    public void getById(){
        Paciente paciente = pacienteController.getByID(1L);
        assertNull(paciente);
    }

    @Test
    public void getByEmail(){
        Paciente paciente = pacienteController.getByEmail("teste");
        assertNull(paciente);
    }

    @Test
    public void login(){
        Usuario usuario = pacienteController.login("teste","teste");
        assertNull(usuario);
    }

}

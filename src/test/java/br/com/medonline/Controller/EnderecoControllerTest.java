package br.com.medonline.Controller;

import br.com.medonline.controller.EnderecoController;
import br.com.medonline.modal.Endereco;
import br.com.medonline.service.EnderecoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;

@RunWith(PowerMockRunner.class)
public class EnderecoControllerTest {

    @InjectMocks
    private EnderecoController enderecoController;

    @Mock
    private EnderecoService enderecoService;

    @Test
    public void buscaTodos(){
        List<Endereco> enderecoList = enderecoController.buscaTodos();
        assertNotNull(enderecoList);
    }

    @Test
    public void salvar(){
        enderecoController.salvar(new Endereco());
    }

    @Test
    public void getByFaceID() {
        Endereco endereco = enderecoController.getByFaceID(1L);
        assertNull(endereco);
    }

}

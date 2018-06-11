package br.com.medonline.service;

import br.com.medonline.modal.Endereco;
import br.com.medonline.repository.EnderecoRp;
import br.com.medonline.service.exception.NotFound;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;

@RunWith(PowerMockRunner.class)
public class EnderecoServiceTest {

    @InjectMocks
    private EnderecoService enderecoService;

    @Mock
    private EnderecoRp enderecoRp;

    @Test
    public void buscarTodas(){
        List<Endereco> enderecoList = enderecoService.buscaEnderecos();
        assertNotNull(enderecoList);
    }

    @Test
    public void salvar(){
        Endereco endereco = new Endereco();
        enderecoService.salvarEndereco(endereco);
    }

    @Test(expected = NotFound.class)
    public void buscarPorID(){
        Endereco endereco = enderecoService.buscaEnderecoPorID(1L);
    }
}

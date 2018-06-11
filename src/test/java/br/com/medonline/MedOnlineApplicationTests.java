package br.com.medonline;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.when;
import static org.powermock.api.easymock.PowerMock.mockStatic;

@RunWith(SpringRunner.class)
@SpringBootTest
@PrepareForTest({SpringApplication.class})
public class MedOnlineApplicationTests {

    @InjectMocks
    private MedOnlineApplication medOnlineApplication;

    @Mock
    private ConfigurableApplicationContext configurableApplicationContext;

    @Test
    public void main(){
        mockStatic(SpringApplication.class);
        when(SpringApplication.run(eq(MedOnlineApplication.class), any(String[].class))).thenReturn(configurableApplicationContext);
        medOnlineApplication.main(new String[]{"Running Tests"});
    }

}

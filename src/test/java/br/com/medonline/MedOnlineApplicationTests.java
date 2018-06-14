package br.com.medonline;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static org.powermock.api.easymock.PowerMock.mockStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest({SpringApplication.class})
public class MedOnlineApplicationTests {

    @InjectMocks
    private MedOnlineApplication medOnlineApplication;

    @Mock
    private ConfigurableApplicationContext configurableApplicationContext;

    @Test()
    public void main(){
        mockStatic(SpringApplication.class);
//        when(SpringApplication.run(eq(MedOnlineApplication.class), any(String[].class))).thenReturn(configurableApplicationContext);
        medOnlineApplication.main(new String[]{"Running Tests"});
    }

}

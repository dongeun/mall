package mall.common;


import mall.CustommerCenterApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustommerCenterApplication.class })
public class CucumberSpingConfiguration {
    
}

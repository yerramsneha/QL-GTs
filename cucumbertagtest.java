package cucumberTest;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions; 
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features = "classpath:features/myfeature.feature", tags = "@Mytag", plugin = {"pretty", "html:target/cucumber"})

public class cucumbertagtest {

}

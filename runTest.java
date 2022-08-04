package annotation;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
//@CucumberOptions(format = {"pretty", "html:target/cucumber"}) 
@CucumberOptions(features = "classpath:features/cucmberTag.feature",
   tags = "@Mytag",
   plugin = {"pretty", "html:target/cucumber"})
public class runTest { }


	



package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="C:\\Users\\GuruSravaniLaxmiSree\\eclipse-workspace1\\FinalProject\\features\\times.feature",
glue= {"project_TheEconomicsTimes"},//package name
plugin= {"pretty","html:test-output",
"json:json_output/cucumber.json", 
"junit:junit_xml/cucumber.xml"},
monochrome=true,
dryRun=false,
strict=true
)


public class Runnerclass {

}

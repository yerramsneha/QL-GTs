 
	package testRunner;
    import org.junit.runner.RunWith;
    import cucumber.api.CucumberOptions;
    import cucumber.api.junit.Cucumber;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = {"C:\\Users\\SatyaBhavaniGedela\\eclipse-workspace\\HalfebayApplication\\feature\\Halfebay.feature"},
            glue = {"stepdefnition"},//Package Name should use
            plugin = {"pretty","html:test-output",
                     "json:json_output/cucumber.json",
                     "json:json_xml/cucumber.xml"},
            monochrome=true,
            dryRun=false,
            strict=true
    )

            
    public class RunnerClass {


    }


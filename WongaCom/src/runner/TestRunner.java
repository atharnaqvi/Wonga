package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/feature",
		glue= {"stepdefinition"},
		monochrome = true,
		//strict = true,
		dryRun = false
		
		)
public class TestRunner {

}

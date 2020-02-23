package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin= {"pretty", "html:target/htmlreports"},
		features="src/test/java/Features/GMO.feature",
		glue= {"StepDefinitions"},
		//tags= {"@GMOHome,@Catalog"},
		dryRun= false		
		)
public class TestRunner {}

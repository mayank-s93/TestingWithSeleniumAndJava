package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin= {"pretty", "html:target/htmlreports"},
		features="src/test/java/Features/GMO_PO.feature",
		glue= {"Hooks"},
		tags= {"@GMOHome,@Catalog,@CloseBroser"},
		dryRun= false
	
		
		)
public class TestRunner {}

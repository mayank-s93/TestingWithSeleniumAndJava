package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)---used for junit
@CucumberOptions(
		
		plugin= {"pretty", "html:target/cucumber-html-report"},
		features="src/test/java/Features/GMO_dt.feature",
		glue= {"Hooks"}
				
		)
public class TestRunner2 extends AbstractTestNGCucumberTests {

}

package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(tags="@smoke and @regression and  not @perf",
		    features = {"src/test/resources/Featurewithtags"},
		    glue = {"StepDefinitions"},  // Update this to your actual step package
		    plugin = {"pretty", "html:target/htmlreport.html"}
		)




	public class CucumberTestRunnerfortags extends AbstractTestNGCucumberTests {
		
		
	}

	
	
	

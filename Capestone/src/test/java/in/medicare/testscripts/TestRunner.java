package in.medicare.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(features = "Features" 
			, glue = "in.medicare.testscripts"
			,tags = "@Tag_102"
			//,dryRun = true
			)
	

public class TestRunner extends AbstractTestNGCucumberTests {
	
	
	

}

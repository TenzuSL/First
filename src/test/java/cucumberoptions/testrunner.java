package cucumberoptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/feature/Practise.feature",
		glue ="Stepdefinitions" ,tags ="@Newtest",monochrome = true,strict = true,
		plugin= {"pretty","html:target/cucumber","json:target/rep1.json","junit:target/rep2.xml"})

public class testrunner {
	

}

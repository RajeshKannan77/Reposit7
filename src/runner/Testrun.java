package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class Testrun {

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/Feature/Facebook_login.feature", glue = { "Feature" }, tags = { "tag" }, plugin = {
			"pretty", "html:target/cucumber-html-report" })

	public class Testrunner {

	}

}

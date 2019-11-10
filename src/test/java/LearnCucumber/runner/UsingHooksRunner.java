package LearnCucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/LearnCucumber/featureFiles/UsingHooks.feature"},
		glue = {"LearnCucumber/steps", "LearnCucumber/hooks"},
		monochrome = true,
		dryRun = false
		)

public class UsingHooksRunner {

}

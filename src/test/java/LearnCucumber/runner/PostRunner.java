package LearnCucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/java/LearnCucumber/featureFiles"},
		glue= {"LearnCucumber.steps"}
		)

public class PostRunner {

}

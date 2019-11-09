package LearnCucumber.steps;

import LearnCucumber.transform.TransformData;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SIngleParameterSteps {
    @Given("^User is on the Comment section$")
    public void user_is_on_the_comment_section() throws Throwable {
        System.out.println("I'm on the comment section");
    }

    @When("^User enters comment as \"([^\"]*)\"$")
    public void user_enters_comment_as_something(@Transform(TransformData.class)String strArg1) throws Throwable {
        System.out.println("User enters comment as " +strArg1);
    }

    @And("^User clicks on the submit button$")
    public void user_clicks_on_the_submit_button() throws Throwable {
        System.out.println("Clicked on the submit button");
    }
    
    @Then("^Comment should get posted$")
    public void comment_should_get_posted() throws Throwable {
        System.out.println("Comment is posted on the wall");
    }
}

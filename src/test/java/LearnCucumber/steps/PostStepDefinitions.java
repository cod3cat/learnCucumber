package LearnCucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PostStepDefinitions {

    @Given("^User is logged in$")
    public void user_is_logged_in() {
        System.out.println("User is logged in");
    }

    @When("^I type the \"([^\"]*)\" in the text box$")
    public void i_type_the_something_in_the_text_box(String strArg1) throws Throwable {
        System.out.println("Entered text: " +strArg1);
    }

    @Then("^the message should get posted$")
    public void the_message_should_get_posted() {
        System.out.println("Text posted on wall");
    }

    @And("^viewing wall$")
    public void viewing_wall() {
        System.out.println("viewing wall");
    }

    @And("^I click on post button$")
    public void i_click_on_post_button() {
        System.out.println("Post button clicked");
    }
}

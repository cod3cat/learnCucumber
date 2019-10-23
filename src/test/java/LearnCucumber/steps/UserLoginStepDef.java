package LearnCucumber.steps;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserLoginStepDef {
	@Given("^User is on the login page$")
	public void user_is_on_the_login_page() {
		System.out.println("User is on login page");
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password(DataTable table) {
		List<List<String>> data = table.raw();
		for(List<String> str : data) {
			for(String str1 : str) {
				System.out.println("Data is: " +str1);
			}
		}
	}

	@When("^Clicks on login button$")
	public void clicks_on_login_button() {
		System.out.println("Clicked on login button");
	}

	@Then("^User should land on homepage$")
	public void user_should_land_on_homepage() {
		System.out.println("User is on home page");
 	}

}

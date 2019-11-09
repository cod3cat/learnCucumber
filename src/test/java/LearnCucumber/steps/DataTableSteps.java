package LearnCucumber.steps;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class DataTableSteps {
	
	@When("^User enters name and password$")
	public void user_enters_name_and_password(DataTable table) {
	    List<List<String>> data = table.raw();
	    
	    for(List<String> str1 : data) {
	    	for(String str2 : str1) {
	    		System.out.println("Data is: " +str2);
	    	}
	    }
	}
}

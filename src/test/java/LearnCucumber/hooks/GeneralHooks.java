package LearnCucumber.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GeneralHooks {

	@Before
	public void setUp(Scenario scenario){
		System.out.println("---------------I'm in Before hook-----------------");
		System.out.println("Name: " +scenario.getName());
		System.out.println("Status: " +scenario.getStatus());
	}
	
	@After
	public void tearDown(Scenario scenario) {
		System.out.println("---------------I'm in After hook-----------------");
		System.out.println("Name: " +scenario.getName());
		System.out.println("Status: " +scenario.getStatus());
	}
}

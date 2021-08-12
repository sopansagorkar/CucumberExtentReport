package com.test.cucumber.stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOverview {
	static Integer temp1, temp2, output;

	@Given("^two numbers (\\d+) and (\\d+) are given")
	public void two_numbers_and_are_given(Integer num1, Integer num2) {
		temp1 = num1;
		temp2 = num2;
	}

	@Given("and both are positive")
	public void and_both_are_positive() {
		// Assert.assertEquals(temp1>0, true);
		// Assert.assertEquals(temp2>0, true);
	}

	@When("I perfom \"([^\\\"]*)\" operation")
	public void i_perfom_operation(String operation) {
		switch (operation) {
		case "add":
			output = temp1 + temp2;
			break;

		}
	}

	@Then("I will get positive response")
	public void i_will_get_positive_response() {
		System.out.println("Response is = " + output);
	}
}

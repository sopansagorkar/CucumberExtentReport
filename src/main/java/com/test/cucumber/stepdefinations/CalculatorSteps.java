package com.test.cucumber.stepdefinations;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorSteps {
	static Integer temp1, temp2, output;

	@Given("^two numbers (-?\\d+) and (-?\\d+) are given$")
	public void two_numbers_and_are_given(int arg1, int arg2) throws Exception {
		temp1 = arg1;
		temp2 = arg2;
	}

	@Given("^and both are \"([^\"]*)\"$")
	public void and_both_are(String arg1) {
		switch (arg1) {
		case "positive":
			Assert.assertEquals(temp1 > 0, true);
			Assert.assertEquals(temp2 > 0, true);
			break;
		case "nagative":
			Assert.assertEquals(temp1 < 0, true);
			Assert.assertEquals(temp2 < 0, true);
			break;

		}
	}

	@When("I perfom \"([^\\\"]*)\" operation")
	public void i_perfom_operation(String operation) {
		switch (operation) {
		case "add":
			output = temp1 + temp2;
			break;
		case "substract":
			if (temp1 > temp2)
				output = temp1 - temp2;
			else
				output = temp2 - temp1;
			break;

		}
	}

	@Then("^I will get \"([^\"]*)\" response$")
	public void i_will_get_response(String arg1) throws Exception {
		System.out.println(arg1 + "Response is " + output);
	}

}

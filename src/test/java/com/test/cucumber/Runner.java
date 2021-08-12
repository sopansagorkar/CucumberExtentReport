package com.test.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "com.test.cucumber.stepdefinations", tags = {
		"@Addition" }, plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/cucumber-report/report.html", "json:target/cucumber-report.json"})

public class Runner {


}

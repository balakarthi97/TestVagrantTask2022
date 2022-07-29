package com.testvagrant.stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			
			features = "src//test//resources//Features//TaskSteps.feature",
			glue = "com.testvagrant.stepdefinition",
			monochrome = true,
			dryRun = false,
			plugin = {"html:target"}

			)

	public class TestRunner {

	}


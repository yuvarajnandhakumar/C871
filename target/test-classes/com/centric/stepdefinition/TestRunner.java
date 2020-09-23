package com.centric.stepdefinition;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",
                 glue = "com.centric.stepdefinition",
                 plugin = {"html:target","json:target/reports.json"},
                 dryRun = false,
                 tags = {"@CentricRun"})

public class TestRunner {

	
	
	
	
}

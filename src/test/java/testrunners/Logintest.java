package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "featurefiles", glue = {"stepdefinitions","applicationhooks"}, dryRun = false)
public class Logintest extends AbstractTestNGCucumberTests {

	
}

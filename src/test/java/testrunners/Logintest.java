package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "featurefiles/login.feature", glue = "stepdefinitions", dryRun = false)
public class Logintest extends AbstractTestNGCucumberTests {

	/*
	 * @Override public void setUpClass(ITestContext context) { String
	 * name=context.getCurrentXmlTest().getName(); System.out.println(name); }
	 */
}

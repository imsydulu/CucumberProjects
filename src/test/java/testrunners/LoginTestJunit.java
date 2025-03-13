package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles",dryRun = false,glue = {"stepdefinitions","applicationhooks"})
public class LoginTestJunit {

}

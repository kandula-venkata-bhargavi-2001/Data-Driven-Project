package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@io.cucumber.testng.CucumberOptions( features = {"FeatureFiles"},monochrome = true,glue = {"stepDefinition"}
,plugin= {"pretty","html:target/report/cucumber.html"} , dryRun = false
                //,"json:target/report/cucumber.json","junit:target/report/cucumber  
		        )
public class AppUtils extends AbstractTestNGCucumberTests{

}


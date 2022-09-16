package org.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\Bhargav\\git\\CucumberTestNGAdactin\\src\\test\\resources\\FeatureFiles\\Login.feature"},

glue = {"org.StepDefinitions"}
		)
public class TestRunnerClass {

}

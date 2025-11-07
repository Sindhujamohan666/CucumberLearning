package com.thetestingacademy.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;



@RunWith(Cucumber.class)  //junit
@CucumberOptions(features = "src/test/resources/feature",glue={"com/thetestingacademy/StepDefinition"},
monochrome=true ,
        plugin={"json:target/cucumber.json"}
)
public class TestRunner {
}

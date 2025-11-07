package com.thetestingacademy.Runner.JunitRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/feature/Datadriven.feature",
            glue={"com/thetestingacademy/StepDefinitionDatadriven",
                    "com.thetestingacademy.base"},
            monochrome=true ,
            plugin={"pretty","junit:target/JUnit/reports.xml",
                    "json:target/JSONReports/reports.json",
                    "html:target/HtmlReports/reports.html"},
            tags= "@smoke or @regression"
    )
    public class TestRunnerDataDriven extends AbstractTestNGCucumberTests {
    }

//Note : In cucumber it is necessary to include glue base which contains hooks.
// Tags can be placed above feature,Scenario,Scenario outline,examples.Tags cant be placed above Background
// or steps(Given,when,then,and ,but)
//Tags @smoke is present before Scenario in feature file ,it runs only that
//Similarly ,I can have multitags @smoke or @regression //runs if any1 is present
//Similarly ,I can have multitags tags = "@smoke and @regression" //runs if only both tags is present
//tags = "@smoke and not @regression" --skip regression
//tags = "(@smoke or @regression) and not @skip"
//Tag inheritance : Tags placed above feature is inherited by Scenario,Scenario outline or example
//Tags above scenario is inherited by examples.We can also have multiple testRunner for diff combination of tags

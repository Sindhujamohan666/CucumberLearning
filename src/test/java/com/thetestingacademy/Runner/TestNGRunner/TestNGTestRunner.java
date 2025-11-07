package com.thetestingacademy.Runner;

//import io.cucumber.junit.CucumberOptions;//junit
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/feature/LoginDemo.feature",
        glue={"com/thetestingacademy/StepDefinitionTestNG",
                "com.thetestingacademy.base"},
        monochrome=true ,
        plugin={"pretty","junit:target/JUnit/reports.xml",
                "json:target/JSONReports/reports.json",
                "html:target/HtmlReports/reports.html"}
)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {
}

//Note : In cucumber it is necessary to include glue base which contains hooks.
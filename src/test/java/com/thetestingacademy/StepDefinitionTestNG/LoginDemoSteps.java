package com.thetestingacademy.StepDefTestNG;

import com.thetestingacademy.base.CommonToAllPage;
import com.thetestingacademy.driver.DriverManagerTL;
import com.thetestingacademy.pages.LoginPage;
import com.thetestingacademy.utils.PropertiesReader;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginDemoSteps extends CommonToAllPage {
    WebDriver driver;
    @Given("Browser is open")
    public void browser_is_open() {
      driver=new ChromeDriver();
      driver.manage().window().maximize();
    }
    @And("User is on login page")
    public void user_is_on_login_page() {
     driver.navigate().to("https://app.vwo.com/#/login");
    }
    @When("User enters username and password")
    public void user_enters_username_and_password() {
        LoginPage loginPage=new LoginPage(DriverManagerTL.getDriver());
        loginPage.loginToVWOLoginValidCreds(PropertiesReader.readKey("username"),PropertiesReader.readKey("password"));

    }
    @Then("User is navigated to homepage")
    public void user_is_navigated_to_homepage() {

        Assert.assertEquals(driver.findElement(By.xpath("//h6[text()='Amcret']")).getText(), PropertiesReader.readKey("expected_username"));
    }

}

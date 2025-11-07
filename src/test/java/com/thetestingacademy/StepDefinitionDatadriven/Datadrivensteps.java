package com.thetestingacademy.StepDefinitionTestNG;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadrivensteps {
    WebDriver driver;
    @Given("Browser is open for user")
    public void browser_is_open_for_user() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @And("User is on login page initially")
    public void user_is_on_login_page_initially() {
        driver.navigate().to("https://app.vwo.com/#/login");
    }
    @When("User enters (.*) and (.*)")
    public void user_enters_username_and_password(String username,String password) {
        driver.findElement(By.id("login-username")).sendKeys(username);
        driver.findElement(By.id("login-password")).sendKeys(password);

    }
    @Then("User is navigated to homepage finally")
    public void user_is_navigated_to_homepage_finally() {
        /System.out.println("Homepage reached");
    }



}

package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {
    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("In step1");
    }
    @When("user enter username and password")
    public void user_enter_username_and_password() {
        System.out.println("In step2");
    }
    @And("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("In step3");
    }
    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        System.out.println("In step4");
    }



}

package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.example.pages.P02_login;
import org.testng.Assert;
import java.time.Duration;


import static org.example.stepDefs.hooks.driver;

public class D02_loginStepDef {

    P01_register reg = new P01_register();
    P02_login login = new P02_login();

    @Given("user go to login page")
    public void go_to_loginPage() throws InterruptedException {
        driver.navigate().to(login.loginPageURL());
        Thread.sleep(3000);
    }

    @When("user login with \"valid\" \"test@example.com\" and \"P@ssw0rd\"")
    public void valid_login()
    {
        login.emailField().sendKeys(reg.registerEmail());
        login.passwordField().sendKeys(reg.registerPassword());
    }


    @When("user login with \"invalid\" \"test@example.com\" and \"P@ssw0rd\"")
    public void invalid_login()
    {
        login.emailField().sendKeys(login.invalidEmail());
        login.passwordField().sendKeys(login.invalidPassword());
    }

    @And("user press on login button")
    public void login_button()
    {
        login.loginButton().click();
    }

    @Then("user login to the system successfully")
    public void login_success()
    {
        String actualResult = login.loginSuccess().getText();
        String expectedResult = "Log out";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("Actual Result = " + actualResult);
        System.out.println("Expected Result = " + expectedResult);
    }

    @Then("user could not login to the system")
    public void login_unsuccessful()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        String actualResult = login.loginUnsuccessful().getText();
        String expectedResult = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("Actual Result = " + actualResult);
        System.out.println("Expected Result = " + expectedResult);
    }
}

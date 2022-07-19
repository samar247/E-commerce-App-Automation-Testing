package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.example.pages.P01_register;
import org.testng.Assert;

public class D01_registerStepDef {

    P01_register reg = new P01_register();

    @Given("user go to register page")
    public void go_to_register()
    {
        reg.registerButton().click();
    }

    @When("user select gender type")
    public void select_gender()
    {
        reg.genderCheckbox().click();
    }

    @And("user enter first name \"automation\" and last name \"tester\"")
    public void enter_valid_data()
    {
        reg.firstName().sendKeys("automation");
        reg.lastName().sendKeys("tester");
    }

    @And("user enter date of birth")
    public void enter_dob()
    {
        reg.dayDOB().click();
        Select dropDay = new Select(hooks.driver.findElement(By.name("DateOfBirthDay")));
        dropDay.selectByVisibleText("24");
        reg.monthDOB().click();
        Select dropMonth = new Select(hooks.driver.findElement(By.name("DateOfBirthMonth")));
        dropMonth.selectByVisibleText("July");
        reg.yearDOB().click();
        Select dropYear = new Select(hooks.driver.findElement(By.name("DateOfBirthYear")));
        dropYear.selectByVisibleText("1996");
    }

    @And("user enter email \"test@example.com\" field")
    public void enter_email()
    {
        reg.email().sendKeys(reg.registerEmail());
    }

    @And("user fills Password fields \"P@ssw0rd\" \"P@ssw0rd\"")
    public void enter_password()
    {
        reg.password().sendKeys(reg.registerPassword());
        reg.confirmPassword().sendKeys("P@ssw0rd");
    }

    @And("user clicks on register button")
    public void click_registerBtn()
    {
        reg.register().click();
    }

    @Then("success message is displayed")
    public void success_message()
    {
        String actualResult = reg.successMessage().getText();
        String expectedResult = "Your registration completed";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("Actual Result = " + actualResult);
        System.out.println("Expected Result = " + expectedResult);
    }
}

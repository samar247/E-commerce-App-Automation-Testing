package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_currencyChange;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import static org.example.stepDefs.hooks.driver;


public class D03_currenciesStepDef {
    P03_currencyChange currency = new P03_currencyChange();

    @Given("user go to home page")
    public void go_to_homepage() throws InterruptedException {
        driver.navigate().to(currency.homePageURL());
        Thread.sleep(3000);
    }

    @And("user select Euro from currency dropdown menu")
    public void select_euro()
    {
        Select selectObject = new Select(currency.selectEuro());
        selectObject.selectByVisibleText("Euro");
    }

    @Then("products prices should be displayed in Euro")
    public void prices_changed_to_euro()
    {
        String ExpectedResult = "€";
        String ActualResult = driver.findElement(By.className("prices")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }

}

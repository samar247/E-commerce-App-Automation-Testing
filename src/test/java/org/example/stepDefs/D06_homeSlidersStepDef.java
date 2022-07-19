package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_homePage;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;


public class D06_homeSlidersStepDef {

    P05_homePage home = new P05_homePage();

    String firstUrl = "urlF";
    String secondUrl = "urlS";
    SoftAssert soft = new SoftAssert();

    @When("user clicks on the first slider")
    public void userClickOnFirstSlider() {

        home.firstSlider().click();
        System.out.println("slider selected is: " + home.firstSlider().getText());
        hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        firstUrl = home.getUrl();
        System.out.println("first slider url" + home.getUrl());
    }

    @When("user clicks on the second slider")
    public void userClickOnSecondSlider() {
        System.out.println("userClickOnSecondSlider");
        home.secondSlider().click();
        home.sliderSelect().click();

        System.out.println("slider selected is: " + home.secondSlider().getText());
        hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        secondUrl = home.getUrl();
        System.out.println( "second slider url" + home.getUrl());

    }

    @Then("user browser is navigated to first slider product page")
    public void userDirectedToUrl() {
        System.out.println("url 1 "+ firstUrl);

        soft.assertEquals(firstUrl,"https://demo.nopcommerce.com/nokia-lumia-1020");
        System.out.println("url1 checked");
        soft.assertAll();
    }


    @Then("user browser is navigated to second slider product page")
    public void userDirectedToUrlForSecondSlider() {
        System.out.println("url 2 "+ secondUrl);

        soft.assertEquals(secondUrl,"https://demo.nopcommerce.com/iphone-6");
        System.out.println("url2 checked");
        soft.assertAll();

    }

}

package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;


public class D08_WishlistStepDef {

    P05_homePage home = new P05_homePage();

    @When("user adds an item to wishlist")
    public void addWishlist()
    {
        home.addToWishlist().get(2).click();
    }

    @Then("success message of wishlist is displayed")
    public void addSuccessMessage()
    {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(home.wishlistSuccessMessage().isDisplayed());

        String expectedColor = "rgba(75, 176, 122, 1)";
        String actualColor = home.wishlistSuccessMessage().getCssValue("background-color");
        softAssert.assertEquals(actualColor, expectedColor);
    }

    @And("number of wishlist is increased")
    public void numberOfWishlistIncrease()
    {
        hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String text = home.wishlistItemsCount().getText().replaceAll("[^0-9]", "");
        int numberOfItems = Integer.parseInt(text);

        Assert.assertTrue(numberOfItems > 0);
    }

}

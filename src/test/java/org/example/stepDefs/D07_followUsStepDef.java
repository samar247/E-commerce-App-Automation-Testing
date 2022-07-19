package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_homePage;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef {

    P05_homePage home = new P05_homePage();

    @When("user opens Facebook link")
    public void openFacebook()
    {
        home.facebookButton().click();
    }


    @When("user opens Twitter link")
    public void openTwitter()
    {
        home.twitterButton().click();
    }


    @When("user opens rss link")
    public void openRSS()
    {
        home.rssButton().click();
    }


    @When("user opens YouTube link")
    public void openYouTube()
    {
        home.youTubeButton().click();
    }

    @Then("^\"([^\"]*)\" is opened in new tab$")
    public void navigateToLink(String link) throws InterruptedException
    {
        Thread.sleep(4000);

        ArrayList<String> openedTaps = new ArrayList<>(hooks.driver.getWindowHandles());
        hooks.driver.switchTo().window(openedTaps.get(1));

        Thread.sleep(8000);

        Assert.assertEquals(hooks.driver.getCurrentUrl(), link);

        hooks.driver.close();
        hooks.driver.switchTo().window(openedTaps.get(0));
        Thread.sleep(500);

    }

}

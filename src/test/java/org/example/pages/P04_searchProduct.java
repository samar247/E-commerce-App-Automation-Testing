package org.example.pages;


import org.example.stepDefs.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;


public class P04_searchProduct {

    public WebElement searchProductName()
    {
        WebElement searchProductName = hooks.driver.findElement(By.id("small-searchterms"));
        return searchProductName;
    }

    public int findResults()
    {
        int findResults = hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();
        System.out.println(findResults);
        Assert.assertTrue(findResults>0);
        return findResults;
    }

}

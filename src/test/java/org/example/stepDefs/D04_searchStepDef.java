package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_searchProduct;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.ArrayList;

import static org.example.stepDefs.hooks.driver;


public class D04_searchStepDef {

P04_searchProduct search = new P04_searchProduct();

    @And("user clicks on search field")
    public void search_click()
    {
        hooks.driver.findElement(By.id("small-searchterms")).click();
    }

    @And("user enters \"Apple MacBook\" in the search text field")
    public void product_name()
    {
        search.searchProductName().sendKeys("Apple MacBook");
        hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]")).click();
    }


    @And("user enters \"AP_MBP_13\" in the search text field")
    public void product_sku()
    {
        search.searchProductName().sendKeys("AP_MBP_13");
        hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]")).click();
    }

    @Then("user could find relative results")
    public void name_results()
    {
        ArrayList<String> products = null;
        products = new ArrayList<String>();
        for (int x = 0 ; x < search.findResults() ; x++ )
        {
            System.out.println(hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(x).getText());
            products.add(hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(x).getText());
        }
        System.out.println(products);
    }

}

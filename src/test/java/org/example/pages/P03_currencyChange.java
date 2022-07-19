package org.example.pages;

import org.example.stepDefs.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_currencyChange {
    public String homePageURL()
    {
        return "https://demo.nopcommerce.com/";
    }

    public WebElement selectEuro()
    {
        WebElement selectEuro = hooks.driver.findElement(By.id("customerCurrency"));
        return selectEuro;
    }

}

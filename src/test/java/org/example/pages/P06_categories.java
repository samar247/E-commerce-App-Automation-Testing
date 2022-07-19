package org.example.pages;

import org.example.stepDefs.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P06_categories {
    public WebElement category()
    {
        WebElement categoryTitle = hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
        return categoryTitle;
    }
}

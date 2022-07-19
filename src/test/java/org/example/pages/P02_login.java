package org.example.pages;

import org.example.stepDefs.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {

    public String loginPageURL()
    {
        return "https://demo.nopcommerce.com/login?returnUrl=%2F";
    }

    public WebElement emailField()
    {
        WebElement emailField = hooks.driver.findElement(By.cssSelector("input[class=\"email\"]"));
        return emailField;
    }

    public String invalidEmail() {
        return "random24@udacity.com";
    }


    public WebElement passwordField()
    {
        WebElement passwordField = hooks.driver.findElement(By.cssSelector("input[class=\"password\"]"));
        return passwordField;
    }

    public String invalidPassword() {
        return "wrongPassword";
    }

    public WebElement loginButton()
    {
        By loginButton = By.cssSelector("button[class=\"button-1 login-button\"]");
        return hooks.driver.findElement(loginButton);
    }

    public WebElement loginSuccess()
    {
      WebElement loginSuccess = hooks.driver.findElement(By.cssSelector("a[class=\"ico-logout\"]"));
      return loginSuccess;
    }

    public WebElement loginUnsuccessful()
    {
        WebElement loginUnsuccessful = hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
        return loginUnsuccessful;
    }

}

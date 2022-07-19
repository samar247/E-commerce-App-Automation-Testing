package org.example.pages;

import org.example.stepDefs.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {

    public WebElement registerButton()
    {
        WebElement registerButton = hooks.driver.findElement(By.className("ico-register"));
        return registerButton;
    }

    public WebElement genderCheckbox()
    {
        WebElement genderCheckbox = hooks.driver.findElement(By.id("gender-female"));
        return genderCheckbox;
    }

    public WebElement firstName()
    {
        WebElement firstName = hooks.driver.findElement(By.id("FirstName"));
        return firstName;
    }

    public WebElement lastName()
    {
        WebElement lastName = hooks.driver.findElement(By.id("LastName"));
        return lastName;
    }

    public WebElement dayDOB()
    {
        WebElement dayDOB = hooks.driver.findElement(By.name("DateOfBirthDay"));
        return dayDOB;
    }

    public WebElement monthDOB()
    {
        WebElement monthDOB = hooks.driver.findElement(By.name("DateOfBirthMonth"));
        return monthDOB;
    }

    public WebElement yearDOB()
    {
        WebElement yearDOB = hooks.driver.findElement(By.name("DateOfBirthYear"));
        return yearDOB;
    }

    public WebElement email()
    {
        WebElement email = hooks.driver.findElement(By.name("Email"));
        return email;
    }

    public String registerEmail() {
        return "test@example.com";
    }

    public WebElement password()
    {
        WebElement password = hooks.driver.findElement(By.name("Password"));
        return password;
    }

    public String registerPassword() {
        return "P@ssw0rd";
    }

    public WebElement confirmPassword()
    {
        WebElement confirmPassword = hooks.driver.findElement(By.name("ConfirmPassword"));
        return confirmPassword;
    }

    public WebElement register()
    {
        WebElement register = hooks.driver.findElement(By.className("buttons"));
        return register;
    }

    public WebElement successMessage()
    {
        WebElement successMessage = hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
        return successMessage;
    }
}

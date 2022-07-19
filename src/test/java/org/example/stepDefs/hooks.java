package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class hooks {

    public static WebDriver driver = null;

    @Before
    public static void openBrowser()
    {
        //1- define bridge     [we could use System.setProperty()]      or      [WebDriverManager]
        WebDriverManager.chromedriver().setup();

        //2- create new object from chromedriver()
        driver = new ChromeDriver();

        //3- configurations
        //3.1- maximize screen
        driver.manage().window().maximize();
        //3.2- set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //4- navigate to the website
        driver.navigate().to("https://demo.nopcommerce.com/");

    }

    @After
    public void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


}

package org.example.pages;

import org.example.stepDefs.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class P05_homePage {

    public String getUrl() {

        return hooks.driver.getCurrentUrl();
    }

    // categories
    public List<WebElement> categories()
    {
        List<WebElement> categoriesList = new ArrayList<>();
        categoriesList.add(hooks.driver.findElement(By.cssSelector("a[href=\"/computers\"]")));
        categoriesList.add(hooks.driver.findElement(By.cssSelector("a[href=\"/electronics\"]")));
        categoriesList.add(hooks.driver.findElement(By.cssSelector("a[href=\"/apparel\"]")));
        categoriesList.add(hooks.driver.findElement(By.cssSelector("a[href=\"/digital-downloads\"]")));
        categoriesList.add(hooks.driver.findElement(By.cssSelector("a[href=\"/books\"]")));
        categoriesList.add(hooks.driver.findElement(By.cssSelector("a[href=\"/jewelry\"]")));
        categoriesList.add(hooks.driver.findElement(By.cssSelector("a[href=\"/gift-cards\"]")));
        return categoriesList;
    }

    public List<WebElement> computers_Subcategories()
    {
        List<WebElement> computersList = new ArrayList<>();
        computersList.add(hooks.driver.findElement(By.cssSelector("a[href=\"/desktops\"]")));
        computersList.add(hooks.driver.findElement(By.cssSelector("a[href=\"/notebooks\"]")));
        computersList.add(hooks.driver.findElement(By.cssSelector("a[href=\"/software\"]")));
        return computersList;
    }

    public List<WebElement> electronics_Subcategories()
    {
        List<WebElement> electronicsList = new ArrayList<>();
        electronicsList.add(hooks.driver.findElement(By.cssSelector("a[href=\"/camera-photo\"]")));
        electronicsList.add(hooks.driver.findElement(By.cssSelector("a[href=\"/cell-phones\"]")));
        electronicsList.add(hooks.driver.findElement(By.cssSelector("a[href=\"/others\"]")));
        return electronicsList;
    }

    public List<WebElement> apparel_Subcategories()
    {
        List<WebElement> apparelList = new ArrayList<>();
        apparelList.add(hooks.driver.findElement(By.cssSelector("a[href=\"/shoes\"]")));
        apparelList.add(hooks.driver.findElement(By.cssSelector("a[href=\"/clothing\"]")));
        apparelList.add(hooks.driver.findElement(By.cssSelector("a[href=\"/accessories\"]")));
        return apparelList;
    }



    // sliders
    public WebElement firstSlider() {
        return hooks.driver.findElement(By.xpath("//a[@ rel=\"0\"]"));

    }

    public WebElement secondSlider() {
        return hooks.driver.findElement(By.xpath("//a[@ rel=\"1\"]"));

    }

    public WebElement sliderSelect() {
        return hooks.driver.findElement(By.xpath(" //a[@style=\"display: block;\"]"));

    }


    //follow us
    public WebElement facebookButton()
    {
        WebElement facebook = hooks.driver.findElement(By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]"));
        return facebook;
    }

    public WebElement twitterButton()
    {
        WebElement twitter = hooks.driver.findElement(By.xpath("//a[@href=\"https://twitter.com/nopCommerce\"]"));
        return twitter;
    }

    public WebElement rssButton()
    {
        WebElement rss = hooks.driver.findElement(By.xpath("//a[@href=\"/news/rss/1\"]"));
        return rss;
    }

    public WebElement youTubeButton()
    {
        WebElement youTube = hooks.driver.findElement(By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]"));
        return youTube;
    }

    public List<WebElement> addToWishlist()
    {
        List<WebElement> wishlist = hooks.driver.findElements(By.className("add-to-wishlist-button"));
        return wishlist;
    }

    public WebElement wishlistSuccessMessage()
    {
        WebElement wishlistMessage = hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
        return wishlistMessage;
    }

    public WebElement wishlistItemsCount()
    {
        WebElement ItemsCount = hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-qty\"]"));
        return ItemsCount;
    }

}

package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_homePage;
import org.example.pages.P06_categories;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static org.example.stepDefs.hooks.driver;

public class D05_hoverCategoriesStepDef {

     P05_homePage home = new P05_homePage();
     P06_categories categories = new P06_categories();

     private int selectedCategory;
     private int selectedSubcategory;
     private String categoryName;

     @When("user hovers over the categories and select a category or sub-category")
     public void hoverCategories()
     {
          Actions action =new Actions(hooks.driver);

          int listSize = home.categories().size();
          int min = 0;
          int max = listSize -1;
          selectedCategory = (int)Math.floor(Math.random()*(max-min+1)+min);

          action.moveToElement(home.categories().get(selectedCategory)).perform();
          hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          if (selectedCategory==0 || selectedCategory==1 || selectedCategory==2)
          {
               switch (selectedCategory)
               {

                    case 0:
                         selectedSubcategory = (int) Math.floor(Math.random() * (2 - 0 + 1) + 0);
                         action.moveToElement(home.computers_Subcategories().get(selectedSubcategory)).perform();
                         categoryName = home.computers_Subcategories().get(selectedSubcategory).getText().toLowerCase();
                         break;

                    case 1:
                         selectedSubcategory = (int) Math.floor(Math.random() * (2 - 0 + 1) + 0);
                         action.moveToElement(home.electronics_Subcategories().get(selectedSubcategory)).perform();
                         categoryName = home.electronics_Subcategories().get(selectedSubcategory).getText().toLowerCase();
                         break;

                    case 2:
                         selectedSubcategory = (int) Math.floor(Math.random() * (2 - 0 + 1) + 0);
                         action.moveToElement(home.apparel_Subcategories().get(selectedSubcategory)).perform();
                         categoryName = home.apparel_Subcategories().get(selectedSubcategory).getText().toLowerCase();
                         break;
               }
          }

          else if (selectedCategory==3 || selectedCategory==4 || selectedCategory==5 || selectedCategory==6)
          {
               categoryName = home.categories().get(selectedCategory).getText().toLowerCase();
          }

     }

     @And("user clicks on category or sub-category")
     public void choose()
     {
          if (selectedCategory==0 || selectedCategory==1 || selectedCategory==2)
          {
               switch (selectedCategory)
               {

                    case 0:
                         home.computers_Subcategories().get(selectedSubcategory).click();
                         break;

                    case 1:
                         home.electronics_Subcategories().get(selectedSubcategory).click();
                         break;

                    case 2:
                         home.apparel_Subcategories().get(selectedSubcategory).click();
                         break;
               }
          }
          else if (selectedCategory==3 || selectedCategory==4 || selectedCategory==5 || selectedCategory==6)
          {
               home.categories().get(selectedCategory).click();
          }
     }

     @Then("user directed to the selected category page")
     public void navigateToProductPage()
     {
          Assert.assertEquals(categories.category().getText().toLowerCase(),categoryName);
     }





}

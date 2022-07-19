@smoke
Feature: F08_Wishlist | user can add a product to wishlist
  Scenario: user add an item to wishlist and a success message is displayed
    When user adds an item to wishlist
    Then success message of wishlist is displayed

  Scenario: number of wishlist in home page is increased
    When user adds an item to wishlist
    Then success message of wishlist is displayed
    And number of wishlist is increased
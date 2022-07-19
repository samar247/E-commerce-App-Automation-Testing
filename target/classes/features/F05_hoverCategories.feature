@smoke

Feature: F05_Hover | user could hover and select categories

  Scenario: user can hover and select categories in homepage
    When user hovers over the categories and select a category or sub-category
    And user clicks on category or sub-category
    Then user directed to the selected category page


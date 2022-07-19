@smoke
Feature: F04_Search | user could search for any product

  Scenario:	user could search using product name
    And user clicks on search field
    And user enters "Apple MacBook" in the search text field
    Then user could find relative results

  Scenario:	user could search for product using sku
    And user clicks on search field
    And user enters "AP_MBP_13" in the search text field
    Then user could find relative results



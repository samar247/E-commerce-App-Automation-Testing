@smoke
Feature: F06_HomeSlider | user can open the sliders pages
  Scenario: first slider "Nokia" is clickable
    When user clicks on the first slider
    Then user browser is navigated to first slider product page

  Scenario: second slider "iPhone" is clickable
    When user clicks on the second slider
    Then user browser is navigated to second slider product page
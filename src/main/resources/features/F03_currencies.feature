@smoke

Feature: F03_Currency | users could change currency

Scenario: user could switch between currencies in homepage
  Given user go to home page
  And user select Euro from currency dropdown menu
  Then products prices should be displayed in Euro
Feature: Verify In Etsy Wine is displayed
  @smoke
Scenario: Verify wine is displayed
Given I am in etsy home page
When I hover on Wedding & Party
Then I hover on Wedding jewellery
Then I click on jewllery set
Then I will see "wine"
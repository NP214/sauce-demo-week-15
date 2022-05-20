Feature: Search functionality
  As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by Hight to Low filter.

  Scenario: User navigates saucedemo page and complete the item purchase
    Given I am on saucedemo page
    When I login with credential username "standard_user"
    And enter password "secret_sauce"
    And I click on Login button
    And I filter the products by sortby "Price (high to low)"
    And I click on add to basket
    And I open shopping cart
    And I go to checkout
    And I enter first name "fn"
    And I enter last name "ln"
    And I enter zip "45678"
    And I click on continue button
    And I click on finish button
    Then  I should able to see message "THANK YOU FOR YOUR ORDER"
Scenario: User navigates saucedemo page and complete the item purchase
  Given I am on saucedemo page
  When I login with credential username "standard_user"
  And enter password "secret_sauce"
  And I click on Login button
  And I filter the products by sortby "Price (high to low)"
  And I click on cheapest price
  And I open shopping cart
  And I go to checkout
  And I enter first name "fn"
  And I enter last name "ln"
  And I enter zip "45678"
  And I click on continue button
  And I click on finish button
  Then  I should able to see message "THANK YOU FOR YOUR ORDER"















#      | Sauce Labs Fleece Jacket |
##      | Sauce Labs Onesie        |
#|Sauce Labs Bike Light     |
##      | Sauce Labs Fleece Jacket |
##  Sauce Labs Backpack
##  Sauce Labs Bolt T-Shirt
##  Test.allTheThings() T-Shirt (Red)
##  Sauce Labs Bike Light
##  Sauce Labs Onesie

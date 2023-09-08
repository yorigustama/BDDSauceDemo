@CheckOut
  Feature: Check Out
    As a user i want purchase two item and delete one item from CartPage from list product

  Scenario: User Check out item
    Given User open the website sauce demo
    When User input "standard_user" as a userName "secret_sauce" as a password
    Then User already on home page
    When User sort list filter by "za"
    And User click item "Test.allTheThings() T-Shirt (Red)" and "Sauce Labs Onesie"
    And User click button shopping cart
    Then User already on your cart page
    When User can delete item Sauce Labs Onesie
    And User click button check out
    And User input firstName "yori" lastName "fiandika" and zip "5572" check out information
    Then User already to check out page and click button finis
    And User already to Thank you page
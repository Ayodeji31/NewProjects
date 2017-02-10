Feature: Checkout Functionality

  Scenario: As a user I want to be able to checkout.
    Given Am on the homepage
    When I move cursor to curtains and blinds
    And I selected from the list of values under ready made blinds
    And I selected Black hardwood blinds
    And I selected size and quantity
    And I clicked Add to basket
    Then I should see a pop-up
    And I click coninue shopping
 

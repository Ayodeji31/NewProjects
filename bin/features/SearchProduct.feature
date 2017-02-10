Feature: Checkout Functionality

  Scenario Outline: As a user I want to be able to checkout.
    Given Am on the homepage
    And I entered "<product>" in the search field
    And I click on search Icon
    #Then te product searched for should be displayed

    Examples: 
      | product      |
      | Duvet        |
      | Bed          |
      | Bowl         |
      | body care    |
      | bosch        |
      | chairs       |
      | chanderliers |

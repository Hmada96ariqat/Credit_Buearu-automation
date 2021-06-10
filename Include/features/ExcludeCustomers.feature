Feature: Credit Bureau

  Scenario Outline: Test login with valid credintials.
    Given User navigates to login page
    When User enters the <username> and <password>
    And Click on login page

    Examples: 
      | username      | password                 |
      | administrator | /5S6MFFLcE4mlsixtc6/Tg== |

  Scenario: Exclude Customers page
    Given Click on Exclude Customers tap
    And Click on 'Add Customer'
    And Fill new value
    Then Navigate to Generate tap
    And Fill the blanks
    And Check The Test check
    Then Click On Generate 'Button'
    And Go back to generate page
    And Pick contract
    Then Click On Generate 'Button'
    And Go back to generate page
    And Pick cheques
    Then Click On Generate 'Button'
    And Click on view data
    And Go back to generate page
    Given Click on Exclude Customers tap
    Then Delete the added record
    Then Close the browser

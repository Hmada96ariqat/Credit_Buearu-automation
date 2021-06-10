Feature: Credit Bureau

  Scenario Outline: Test login with valid credintials.
    Given User navigates to login page
    When User enters the <username> and <password>
    And Click on login page

    Examples: 
      | username      | password                 |
      | administrator | /5S6MFFLcE4mlsixtc6/Tg== |

  Scenario: Generate reports
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
    Then Close the browser

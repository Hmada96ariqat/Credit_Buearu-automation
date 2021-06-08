Feature: Credit Bureau

  Scenario Outline: Test login with valid credintials.
    Given User navigates to login page
    When User enters the <username> and <password>
    And Click on login page

    #Then User will navigate to HomePage
    Examples: 
      | username      | password                 |
      | administrator | /5S6MFFLcE4mlsixtc6/Tg== |

  Scenario: navigating to EC page
    Given Click on Exclude Customers tap
    And Click on 'Add Customer'
    And Fill new value
    Then Navigate to Generate tap
    And Fill the blanks
    And Check The Cheques check box and the check Rules check box
    Then Click On Generate 'Button'
    Then Click on view data

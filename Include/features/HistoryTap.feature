Feature: Credit Bureau

  Scenario Outline: Test login with valid credintials.
    Given User navigates to login page
    When User enters the <username> and <password>
    And Click on login page
    Given Click on History Tap
    Then Close the browser

    Examples: 
      | username      | password                 |
      | administrator | /5S6MFFLcE4mlsixtc6/Tg== |

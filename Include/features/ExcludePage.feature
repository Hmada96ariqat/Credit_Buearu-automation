Feature: NewPage

  Scenario Outline: navigating to EC page
    Given Click on Exclude Customers tap
    #When Navigate to Exclude Customer page
    And Click on 'Add Customer'
    And Fill new value
    Then Navigate to Generate tap
    And Fill the blanks
    And Check The Cheques check box and the check Rules check box
    Then Click On Generate Button

    Examples: 
      | ad | ff |
      |ss  | dd | 

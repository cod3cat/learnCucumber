Feature: Parameterize the given step with single parameter

  Scenario: Post a comment using a parameter
    Given User is on the Comment section
    When User enters comment as "This is a parameter"
    And User clicks on the submit button
    Then Comment should get posted

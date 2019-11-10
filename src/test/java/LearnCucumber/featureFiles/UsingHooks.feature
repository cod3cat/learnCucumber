Feature: Parameterize the given step with single parameter

  Scenario: Post a comment using a parameter
    Given User is on the Comment sectiona
    When User enters comment as "This is a parameter"a
    And User clicks on the submit buttona
    Then Comment should get posteda

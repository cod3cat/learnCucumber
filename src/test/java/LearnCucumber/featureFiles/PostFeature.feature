Feature: Post feature of Faceboook
  This will test post functionality

  Background: Common Steps
    Given User is logged in
    And viewing wall

  Scenario: Post a text on user wall
    When I type the "text" in the text box
    And I click on post button
    Then the message should get posted

  Scenario: Post a text on user wall
    When I type the "text" in the text box
    And I click on post button
    Then the message should get posted
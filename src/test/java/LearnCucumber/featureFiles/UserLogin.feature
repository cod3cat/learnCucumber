Feature: User Login

  Scenario: User should be able to login successfully
    Given User is on the login page
    When user enters username and password
      | User1 | Password1 |
      | User2 | Password2 |
      | User3 | Password3 |
      | User4 | Password4 |
    And Clicks on login button
    Then User should land on homepage

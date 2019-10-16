Feature: Login into account
	Existing user should be able to login to account using correct creds

Scenario: Login into account with correct creds
	Given user navigates to stack overflow website
	And user clicks on the login button
	And user enters correct username and password
	When user clicks on the login button
	Then user should be taken to the successful login page
Feature: Parameterize the given step with data table 

Scenario: Post a comment using a parameter 
	Given User is on the Comment section 
	When User enters name and password 
		| User 1 | Password 1|
		| User 2 | Password 2|
		| User 3 | Password 3|
	And User clicks on the submit button 
	Then Comment should get posted 

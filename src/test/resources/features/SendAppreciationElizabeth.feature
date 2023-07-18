@B29G38-170
Feature: User should be able to send appreciation by clicking on Appreciation tab under Active Stream

	Background:
		Given the user is on the login page
		Given the user logged in as "hr"

	
	@B29G38-168
	Scenario:  Verify user should be able to send an appreciation by filling in the mandatory fields.

		When User click on "More" tab
		And User click "Appreciation" button
		Then User should be able to send an appreciation by filling in the mandatory fields.	

	
	@B29G38-169
	Scenario: Verify user should be able to cancel sending appreciation at any time before sending.

		When User click "Cancel" button
		Then User able to cancel sending appreciation
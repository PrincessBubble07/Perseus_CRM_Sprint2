@US_11
Feature: User should be able to send appreciation by clicking on Appreciation tab under Active Stream

	Background: User is already in the log in page
	Given the user is on the login page
	And the user logged in as "help desk"
	And the user click on More tab under Active stream



	
	@US11_TC1
	Scenario:  Verify user should be able to send an appreciation by filling in the mandatory fields.


		When User click Appreciation button
		Then User should be able to send an appreciation by filling in the mandatory fields.	

	
	@US11_TC2
	Scenario: Verify user should be able to cancel sending appreciation at any time before sending.
		When User click Cancel button
		Then User able to cancel sending appreciation


	@US11_TC3
	Scenario: The user should see an error message when send a message without a recipient
		When the user enters text into the text box
		And the user should see send message to All employees by default
		And the user deletes the All employees
		And the user clicks the Send button
		Then the user should see the Error Please specify at least one person.

	@US11_TC4
	Scenario: The user should see an error message when  send a message without a text in the text box
		When the user remove the recipient All employees
		And the user add a recipient
		And the user click the SEND button
		Then the user should see the Error The message title is not specified.
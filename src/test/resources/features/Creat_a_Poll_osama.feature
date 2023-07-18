@B29G38-167
Feature: As a user, I should be able to create a poll
	by clicking on Poll tab under Active Stream.

	Background:
		Given the user is on the login page
		Given the user logged in as "hr"
		Given user clicks poll tab under Active Stream

	
	@B29G38-163
	Scenario: The delivery should be to 'All employees' by default.
		Then user sees the delivery All employees by default.	

	
	@B29G38-164
	Scenario: User should be able to create a poll by adding questions and multiple answers.
		Then User creates a poll by adding message title and questions and multiple answers.
		When user clicks send button.
		Then user sees questions and multiple answers display	

	
	@B29G38-165
	Scenario: User should be able to select the Allow multiple choice checkbox.
		When User selects Allow multiple choice checkbox.
		Then user sees Allow multiple choice is selected	

	
	@B29G38-166
	Scenario: Mandatory fields: Message title, recipient, 1 question, 1 answer
		When user does not specify "the message title"
		Then user sees this Error message "The message title is not specified"
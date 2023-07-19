@US_04
Feature: User should be able to send messages


  Background: User is already in the log in page
    Given the user is on the login page
    And the user logged in as "help desk"
    And the user clicks the MESSAGE button


  @US_04_TC1
  Scenario: The message delivery should be set to 'All employees' by default
    Then the user sees the message delivery is set to All employees


  @US_04_TC2
  Scenario: The user should be able to send a message by filling in mandatory fields
    When the user enters text into the message body
    And the user deletes the recipient All employees
    And the user adds a recipient
    And the user clicks the SEND button
    Then the user should see the message they just sent at the top of the feed


  @US_04_TC3
  Scenario: The user should see an error message when attempting to send a message without a message body
    When the user deletes the recipient All employees
    And the user adds a recipient
    And the user clicks the SEND button
    Then the user should see the error message The message title is not specified.


  @US_04_TC4
  Scenario: The user should see an error message when attempting to send a message without a recipient
    When the user enters text into the message body
    And the user deletes the recipient All employees
    And the user clicks the SEND button
    Then the user should see the error message Please specify at least one person.


  @US_04_TC5
  Scenario: The user should be able to cancel sending message before adding a message body
    When the user clicks the CANCEL button
    Then the user will see the message area is collapsed and default text Send message … is displayed


  @US_04_TC6
  Scenario: The user should be able to cancel sending message after adding a message body
    When the user enters text into the message body
    And the user clicks the CANCEL button
    Then the user will see the message area is collapsed and default text Send message … is displayed

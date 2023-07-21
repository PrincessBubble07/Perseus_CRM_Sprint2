@US_04
Feature: User should be able to send messages

  Background: User is already in the log in page
    Given the user is on the login page


  @US_04_TC1
  Scenario Outline: The message delivery should be set to 'All employees' by default
    Given the user logged in as "<user>"
    And the user clicks the "Message" tab
    Then the user sees the message delivery is set to "All employees"
    Examples:
      | user      |
      | hr        |
      | help desk |
      | marketing |

  @US_04_TC2
  Scenario Outline: The user should be able to send a message by filling in mandatory fields
    Given the user logged in as "<user>"
    And the user clicks the "Message" tab
    When the user enters "Hello" into the message body
    And the user deletes the recipient "All employees"
    And the user adds "hr23@cybertekschool.com" as a recipient
    And the user clicks the "Send" button
    Then the user sees their message "Hello" at the top of the feed
    Examples:
      | user      |
      | hr        |
      | help desk |
      | marketing |

  @US_04_TC3
  Scenario Outline: The user should see error message when attempting to send a message without a message body
    Given the user logged in as "<user>"
    And the user clicks the "Message" tab
    When the user deletes the recipient "All employees"
    And the user adds "hr23@cybertekschool.com" as a recipient
    And the user clicks the "Send" button
    Then the user sees the error message "The message title is not specified"
    Examples:
      | user      |
      | hr        |
      | help desk |
      | marketing |

  @US_04_TC4
  Scenario Outline: The user should see an error message when attempting to send a message without a recipient
    Given the user logged in as "<user>"
    And the user clicks the "Message" tab
    When the user enters "Hello" into the message body
    And the user deletes the recipient "All employees"
    And the user clicks the "Send" button
    Then the user sees the error message "Please specify at least one person."
    Examples:
      | user      |
      | hr        |
      | help desk |
      | marketing |

  @US_04_TC5
  Scenario Outline: The user should be able to cancel sending message before adding a message body
    Given the user logged in as "<user>"
    And the user clicks the "Message" tab
    When the user clicks the "Cancel" button
    And  the user sees default text "Send message …" is displayed in the collapsed message body
    Examples:
      | user      |
      | hr        |
      | help desk |
      | marketing |

  @US_04_TC6
  Scenario Outline: The user should be able to cancel sending message after adding a message body
    Given the user logged in as "<user>"
    And the user clicks the "Message" tab
    When the user enters "Hello" into the message body
    And the user clicks the "Cancel" button
    And  the user sees default text "Send message …" is displayed in the collapsed message body
    Examples:
      | user      |
      | hr        |
      | help desk |
      | marketing |
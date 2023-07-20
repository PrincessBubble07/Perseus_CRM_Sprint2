@B29G38-199
Feature: Users should be able to add link in message.

##
  Background: User is already in the log in page
    Given the user is on the login page

@BG29G38-197
  Scenario Outline: Menu Options for users
    Given the user logged in as "<user>"
    When user attaches "www.google.com" link to the "Google" text
    When user clicks on the link
    Then user navigates to the correct URL
    Then link opened in a new tab

  Examples:
      | user      |
      | hr        |
      | help desk |
      | marketing |


@us_08
Feature: Users should be able to use functions on Company Structure under Employee menu.


  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Menu Options for hr user
    Given the user logged in as "<user>"
    Then the user see the Company Structure
    Then user sees “ADD DEPARTMENT” option
    Then user adds Department from the Company Structure
    Examples:
      | user      |
      | hr        |




  Scenario Outline: Menu Options for helpdesk and marketing users
    Given the user logged in as "<user>"
    Then the user see the Company Structure
    Then There is no “ADD DEPARTMENT” option
    Examples:
      | user      |
      | help desk |
      | marketing |





@us_08
Feature: Users should be able to use functions on Company Structure under Employee menu.


  Background: User is already in the log in page
    Given the user is on the login page


  @us_08_hr
  Scenario: Menu Options for hr
    Given the user logged in as "hr"
    When all users types should be able to display company structure.
    When hr user should be able to add a department from the company structure.



  @us_08_helpdesk
  Scenario: Menu Options for helpdesk
    Given the user logged in as "help desk"
    When all users types should be able to display company structure.
    Then There is no “ADD DEPARTMENT” option for Helpdesk and Marketing user.



  @us_08_marketing
  Scenario: Menu Options for marketing
    Given the user logged in as "marketing"
    When all users types should be able to display company structure.
    Then There is no “ADD DEPARTMENT” option for Helpdesk and Marketing user.
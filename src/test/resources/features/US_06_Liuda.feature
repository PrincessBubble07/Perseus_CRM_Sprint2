@us_06
Feature: Users should be able to add link in message.


  Background: User is already in the log in page
    Given the user is on the login page


  @us_06_hr
  Scenario: Menu Options for hr
  Given the user logged in as "hr"
  When User should be able to attach a link to the specified text.
  Then By clicking on the link user should be able to navigate to the correct URL.
  Then Link should open in a new tab

  @us_06_helpdesk
  Scenario: Menu Options for help desk
    Given the user logged in as "help desk"
    When User should be able to attach a link to the specified text.
    Then By clicking on the link user should be able to navigate to the correct URL.
    Then Link should open in a new tab

  @us_06_marketing
  Scenario: Menu Options for marketing
    Given the user logged in as "marketing"
    When User should be able to attach a link to the specified text.
    Then By clicking on the link user should be able to navigate to the correct URL.
    Then Link should open in a new tab
@us_06
Feature: Users should be able to add link in message.


  Background: User is already in the log in page
    Given the user is on the login page


  @us_06_hr
  Scenario: Menu Options for hr
  Given the user logged in as "hr"
  When the user should see the Message link
  Then the user should be able click on Message link
  When the user should be able to attach a link to the specified text.
  Then the user should be able to print url address into link url box
  Then the user should be able to print text for url address into link text box
  When the user should be able to see the Save button and click Save button
  Then the user should be able click on Send button
  Then By clicking on the link user should be able to navigate to the correct URL.
  Then Link should open in a new tab

  @us_06_helpdesk
  Scenario: Menu Options for help desk
    Given the user logged in as "help desk"
    When the user should see the Message link
    Then the user should be able click on Message link
    When the user should be able to attach a link to the specified text.
    Then the user should be able to print url address into link url box
    Then the user should be able to print text for url address into link text box
    When the user should be able to see the Save button and click Save button
    Then the user should be able click on Send button
    Then By clicking on the link user should be able to navigate to the correct URL.
    Then Link should open in a new tab

  @us_06_marketing
  Scenario: Menu Options for marketing
    Given the user logged in as "marketing"
    When the user should see the Message link
    Then the user should be able click on Message link
    When the user should be able to attach a link to the specified text.
    Then the user should be able to print url address into link url box
    Then the user should be able to print text for url address into link text box
    When the user should be able to see the Save button and click Save button
    Then the user should be able click on Send button
    Then By clicking on the link user should be able to navigate to the correct URL.
    Then Link should open in a new tab
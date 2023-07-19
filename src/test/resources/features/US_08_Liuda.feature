@us_08
Feature: Users should be able to use functions on Company Structure under Employee menu.


  Background: User is already in the log in page
    Given the user is on the login page


  @us_08_hr
  Scenario: Menu Options for hr
    Given the user logged in as "hr"
    When the user should be able to see Employees link
    Then the user should be able click on the Employees link
    When the user should be able to see Company Structure Title.
    Then the user should be able to see Visual Company Structure
    When the user should be able to see Add Department button
    Then the user should be able to click Add Department button
    Then the user should be able to see department window
    Then the user should be able click on departmentNameInputBox link
    And the user should be able to print the "Developer" of department
    Then the user should be able click on the ParentDepartmentList
    Then the user should be able to select "Parent Department"
    And the user should be able to see "Parent Department" is selected
    And the user should be able click on the Add button
   



  @us_08_helpdesk
  Scenario: Menu Options for helpdesk
    Given the user logged in as "help desk"
    When the user should be able to see Employees link
    Then the user should be able click on the Employees link
    When the user should be able to see Company Structure Title.
    Then the user should be able to see Visual Company Structure
    Then There is no “ADD DEPARTMENT” option for Helpdesk and Marketing user.



  @us_08_marketing
  Scenario: Menu Options for marketing
    Given the user logged in as "marketing"
    When the user should be able to see Employees link
    Then the user should be able click on the Employees link
    When the user should be able to see Company Structure Title.
    Then the user should be able to see Visual Company Structure
    Then There is no “ADD DEPARTMENT” option for Helpdesk and Marketing user.
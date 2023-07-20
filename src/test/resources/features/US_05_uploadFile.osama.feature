@test
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline:
    Given the user logged in as "<user>"
    Examples:
      | user      |
      | hr        |
      | help desk |
      | marketing |

Feature: As a user, I want to access the Drive page

  Background: User is already in the log in page
    Given the user is on the login page

  @B29G38-175
  Scenario Outline: Verify users can access the Driver page
    Given the user logged in as "<user>"
    When the user click on Drive
    Then the user should be able to see My Drive modules on the Drive page
    Then the user should be able to see All Documents modules on the Drive page
    Then the user should be able to see Company Drive modules on the Drive page
    Then the user should be able to see Sales and Marketing modules on the Drive page
    Then the user should be able to see Top Management's documents modules on the Drive page
    Then the user should be able to see Drive Cleanup modules on the Drive page
    Examples:
      | user      |
      | hr        |
      | help desk |
      | marketing |





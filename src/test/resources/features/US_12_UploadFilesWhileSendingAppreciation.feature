@B29G38-147
Feature: As a user, I should be able to upload files and pictures while sending appreciation

  Background: User is sending appreciation
    Given the user is on the login page

@B29G38-208
  Scenario Outline: Verify users can upload files and pictures while sending appreciation
    Given the user logged in as "<user>"
    And the user click on MORE tab
    And the user click on Appreciation
    Then the user should be able to upload files and pictures
      | test.pdf  |
      | test.txt  |
      | test.docx |
      | test.jpeg |
      | test.png  |
    Examples:
      | user      |
      | hr        |
      | help desk |
      | marketing |
@B29G38-209
  Scenario Outline: Verify users can insert the files and images into the text while sending appreciation
    Given the user logged in as "<user>"
    And the user click on MORE tab
    And the user click on Appreciation
    Then the user should be able to insert files and pictures into the text
      | test.pdf  |
      | test.txt  |
      | test.docx |
      | test.jpeg |
      | test.png  |
    Examples:
      | user      |
      | hr        |
      | help desk |
      | marketing |
  @B29G38-210
  Scenario Outline: Verify users can remove files and images at any time before sending
    Given the user logged in as "<user>"
    And the user click on MORE tab
    And the user click on Appreciation
    Then the user should be able to remove files and images at any time before sending
      | test.pdf  |
      | test.txt  |
      | test.docx |
      | test.jpeg |
      | test.png  |
    Examples:
      | user      |
      | hr        |
      | help desk |
      | marketing |
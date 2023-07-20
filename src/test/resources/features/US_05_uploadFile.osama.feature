@B29G38-196
Feature: As a user, I should be able to upload files and pictures as messages
Background:
  Scenario: Verify login with different user types
    Given the user logged in as "hr"

  @B29G38-193
  Scenario: User should be able to upload files and pictures. Supported file formats .pdf, .txt, .jpeg, .png, .docx
    Given user clicks message tab osama
    And user clicks upload files osama
    And user clicks upload files and images box osama
    And user specific the "<file>" osama
      | /Users/userapple/Downloads/Day 10 Practice Tasks.pdf        |
      | /Users/userapple/Downloads/Day 12 Class Notes.txt           |
      | /Users/userapple/Downloads/11111111111111111.jpg            |
      | /Users/userapple/Downloads/java-collections-cheat-sheet.png |
      | /Users/userapple/Downloads/b10 all test cases, code.docx    |
    And user clicks send button osama
    Then user sees the file display osama


  @B29G38-194
  Scenario: User should be able to insert the files and images into the text.
    Given user clicks message tab osama
    And user clicks upload files osama
    And user clicks upload files and images box osama
    And user specific the "file" osama
    And user clicks Insert in text button osama
    And user clicks send button osama
    Then user sees the file display with message text osama


  @B29G38-195
  Scenario: User should be able to remove files and images at any time before sending
    Given user clicks message tab osama
    And user clicks upload files osama
    And user clicks upload files and images box osama
    And user specific the "file" osama
    And user clicks x button osama
    Then user sees the file deleted osama


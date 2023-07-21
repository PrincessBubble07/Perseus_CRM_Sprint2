@B29G38-196
Feature: As a user, I should be able to upload files and pictures as messages


  @B29G38-193
  Scenario: User should be able to upload files and pictures. Supported file formats .pdf, .txt, .jpeg, .png, .docx
    Given user clicks message tab osama
    And user clicks upload files osama
    And user clicks upload files and images box osama
    And user specific the "<file>" osama
      | .pdf  |
      | .txt  |
      | .jpeg |
      | .png  |
      | .docx |
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
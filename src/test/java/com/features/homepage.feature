Feature: GameFAQs Click Search
  As a user I want to be able to click homepage search bar

  Scenario: Validate search bar
    Given User is on the GameFAQs home page
    When User enters the following in the corresponding fields
    Then The user sees the name is present in the field
Feature: search in google

  @smoke
  Scenario Outline: google
    Given I go to google
    When search "<string>"
    When click search button
    Then See result
    Examples:
      | string |
      | minh |
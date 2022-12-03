Feature: search in google

  @smoke
  Scenario Outline: search "<string>" google
    Given I go to google
    When search "<string>"
    When click search button
    Then See result
    And URL contains "<string>"
    Examples:
      | string |
      | minh |

  @regress
  Scenario Outline: search "<string>" google
    Given I go to google
    When search "<string>"
    When click search button
    Then See result
    And URL contains "<string>"
    Examples:
      | string |
      | youtube |

  @facebook
  Scenario Outline: search "<string>" google
    Given I go to google
    When search "<string>"
    When click search button
    Then See result
    And URL contains "<string>"
    Examples:
      | string |
      | facebook |

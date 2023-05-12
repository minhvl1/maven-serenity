Feature: search in google
  @facebook
  Scenario Outline: search "<string>" google
    Given I go to google
    When search "<string>"
    When click search button
    Then See result
    And URL contains "<string>"
    @smoke
    Examples:
      | string |
      | minh |
    @regress
    Examples:
      | string |
      | facebook |
    @sit
    Examples:
      | string |
      | youtube |


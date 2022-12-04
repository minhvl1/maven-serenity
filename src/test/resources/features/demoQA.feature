Feature: screen play demo

  @screenplay
  Scenario: DEMO QA
    Given I go to demo qa url
    When input "minh" fullname textbox
    Then See result after input textbox

  @radiobutton
  Scenario Outline: Radio button
    Given I go to demo qa radio button url
    When  Click <radio> button
    Then  See result contain <radio>
    Examples:
      | radio |
    |   "Impressive"    |
    |     "Yes"|

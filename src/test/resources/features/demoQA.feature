Feature: screen play demo

  @screenplay
  Scenario: DEMO QA
    Given I go to demo qa url
    When input "minh" fullname textbox
    Then See result after input textbox


Feature: screen play demo

  @textbox=name
  Scenario: DEMO QA
    Given Toby I go to demo qa url
    When he input "minh" fullname textbox
    Then he See result after input textbox



  @textbox=email
  Scenario: DEMO QA
    Given Toby I go to demo qa url
    When he input "Duy tan" email textbox
    Then he See result after input textbox

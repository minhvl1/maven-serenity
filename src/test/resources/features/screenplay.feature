Feature: screen play demo

  @textbox=name
  Scenario: Input into fullname textbox
    Given Toby I go to demo qa url
    When he input "minh" fullname textbox
    Then he See result after input textbox



  @textbox=email
  Scenario: Input into address textbox
    Given Toby I go to demo qa url
    When he input "Duy tan" email textbox
    Then he See result after input textbox


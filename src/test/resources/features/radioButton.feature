Feature: radio button

  @radiobutton
  Scenario Outline: check to radio button
    Given Minh I go to demo qa radio button url
    When Click to <radiobutton>
    Then He see result contains <radiobutton>
    Examples:
      | radiobutton |
      | "impressive"  |
    |       "yes"      |




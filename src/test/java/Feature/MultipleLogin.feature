Feature:Multiple Loging

  Scenario Outline: Home page default login
    Given User is on login page
    When  User enter "<Validuid>" in user field
    And   user enter "<Vluablepwd>" in password field
    And   user click on signin buttern
    Then  faild login will display

    Examples:
      |Validuid|Vluablepwd|
      | mahesh | abc      |
      | Viraj  | 143      |
      | Pandura| 456      |


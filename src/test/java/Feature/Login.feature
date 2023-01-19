Feature: Application login

  Background: Launch application
    Given User launch browser
    When  User enter URL
    Then  Home page will display
  @Regration
  Scenario: Home page default login
    Given User is on login page
    When  User enter valid username "mahesh" and password "1234"
    And   User click on loging button
    Then  Title will display
     @Mobile
  Scenario: Home page default login
    Given User is on login page
    When  User enter valid username "rahul" and password "1234"
    And   User click on loging button

   @smoktest
  Scenario: Home page default login
    Given User is on login page
    When  User enter following detail
    | sonal | 123 | mahesh | 4567 | viraj | 143 |
    And   User click on loging button

   @sanity
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

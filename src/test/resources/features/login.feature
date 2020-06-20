Feature: Login User

  Scenario: Login user
    Then Input email
    Then Input password
    Then Click "Sign in" button
    Then Content with "Climate Superstars Admin" visible
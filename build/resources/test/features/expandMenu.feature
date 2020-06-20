Feature: Expand Main Menu

  Scenario: Test Expand Menu
    Then Input email
    Then Input password
    Then Click "Sign in" button

    Then Open Community groups page
    Then Title "Manage community groups" visible
    Then Click Create Community Group button

    Then Open Communities page
    Then Title "Manage communities" visible
    Then Click Create Community button
    Then Open Tasks page




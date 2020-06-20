Feature: My Setup

  Scenario: Create Community Group
    Then Input email
    Then Input password
    Then Click "Sign in" button
    Then Open Community groups page
    Then Title "Manage community groups" visible
    Then Click Create Community Group button
    Then Fill Title field
    Then Fill Description field
    Then Fill Sort Order field
    Then Click "Save"

  Scenario: Create Community
    Then Open Communities page
    Then Click Create Community button



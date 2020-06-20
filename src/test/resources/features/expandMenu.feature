Feature: Expand Main Menu

  Scenario: Test Expand Menu
    Then Input email
    Then Input password
    Then Click "Sign in" button


    Then Open Communities page
    Then Title "Manage communities" visible
    Then Click Create Community button
    Then Fill Community title "TEST Community ARTEM"
    Then Choose Community group "Global Group"
    Then Click "Save"




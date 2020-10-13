Feature: Create Badge

  Scenario: SuperAdmin Login
    Then Input email
    Then Input password
    Then Click "Sign in" button

  Scenario: Create Badge
    Then Open Badges Page
    Then Click Create badge Button
    Then Enter "Test Auto badge" to title of badge
    Then Enter "Locked" to Locked Description field
    Then Enter "Unlocked" to Unlocked Description field
    Then Click "Save" button
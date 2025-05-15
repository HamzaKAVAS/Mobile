Feature: As a registered user, I want to be able to change my password when I forget it

  Background: User opens the app
    Given User makes driver adjustments

  Scenario: (Test Case 1) Forgot Password Link Visibility and Activity

    When User clicks the button with description "Profile"
    And User clicks the button with description "Sign In"
    Then User verifies the button with description "Forgot Password" is visible
    And Driver turns off

  Scenario: (Test Case 2) Password Reset with Valid Email

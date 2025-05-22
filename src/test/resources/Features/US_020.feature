Feature: As a registered user, I want to change my password on my dashboard page

  Scenario: Change Password link is visible on the Dashboard page and test that it is active

    Given User open the application
    And User logs into the application with "TST-001UserEmail" and "applicationPassword" password
    Then User clicks on the profile icon
    And  Confirm that the “Change Password” link is visible
    Then Clicks on the “Change Password” link
    And Confirms that you are redirected to the Change Password page
    Then Clicks the back button to exit
    And  Goes to the homepage for the exit process
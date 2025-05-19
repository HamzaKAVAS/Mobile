Feature: As a registered user, I would like to have a page on the site where I can manage my address information

  Background: Sign In
    * User makes driver adjustments
    * The user logs in by entering their credentials, including "emailZeynep" and "passwordZeynep".

  Scenario: Visibility and clickability of the Address menu in the sidebar
    * User clicks the button with description "Profile"
    * The "Address" menu should be visible and clickable in the sidebar
    * Driver turns off

  Scenario: Visibility and clickability of the Add New Address button
    * User clicks the button with description "Profile"
    * User clicks the button with description "Address"
    * The "Add New Address" button should be visible and clickable
    * Driver turns off
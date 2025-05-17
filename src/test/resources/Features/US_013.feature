Feature: As a registered user, I would like to be able to see the categories and products of the Menu menu on the home page

  Background: Sign In
    * User makes driver adjustments
    * The user logs in by entering their credentials, including "emailZeynep" and "passwordZeynep".

  Scenario: Visibility and clickability of the Men category window and its subcategories on the homepage
    * The "Men" category window should be visible
    * The Men "Men Clothing" should be visible and clickable
    * Driver turns off

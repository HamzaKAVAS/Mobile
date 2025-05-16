Feature: As a user, I want to be able to see all the categories listed under the Categories section on the site

  Background: User opens the app
    * User makes driver adjustments

  Scenario: Visibility and clickability of the Category icon in the homepage navbar
    * The "Category" icon should be visible on the homepage
    * User clicks the button with description "Category"
    * Driver turns off

  Scenario Outline: Visibility and clickability of the Men, Women and Junior category headings
    * User clicks the button with description "Category"
    * The "<heading>" category should be visible and clickable
    * Driver turns off

    Examples:
      | heading |
      | Men     |
      | Women   |
      | Juniors |
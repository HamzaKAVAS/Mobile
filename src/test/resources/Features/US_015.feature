@Hamza
Feature: [US_015] As a registered user, I would like to be able to see the categories and products of the Women menu on the home page.

  Background: User opens the app
    Given User makes driver adjustments

  Scenario: [US_015 => TC01] The women category window and its subcategories should be displayed in the body section of the home page.
    And Click on your profile icon.
    And Click on your sign in icon.
    When Click on the use email instead link.
    And Enter a valid user email in the email box.
    When Enter a valid user password in the password box.
    And Click the sign in button.
    Then Verify that the women category and subheadings are displayed in the categories section on the homepage.
    And Driver turns off

  Scenario: [US_015 => TC02] The products on the Women category page should be able to perform actions (add to cart, add to favorites list and view).
    And Click on your profile icon.
    And Click on your sign in icon.
    When Click on the use email instead link.
    And Enter a valid user email in the email box.
    When Enter a valid user password in the password box.
    And Click the sign in button.
    And Click on women in the category.
    And Click on the first product on the page that opens.
    And Choose size M.
    When Set the Quantity to 2.
    And Click Add to cart.
    Then Confirm the warning message that the product has been successfully added to the cart.
    And Add the product to your request favorites.
    Then Added to wishlist verify warning text.
    And Driver turns off

  Scenario: [US_015 => TC03] Filtering icons should be visible and active.
    And Click on your profile icon.
    And Click on your sign in icon.
    When Click on the use email instead link.
    And Enter a valid user email in the email box.
    When Enter a valid user password in the password box.
    And Click the sign in button.
    And Click on women in the category.
    Then Verify that the filtering icon is visible and active.
    And Click on the filter icon.
    Then Verify that the options on the filtering page are viewable and clickable.
    And Click on the Sort By.
    And Click on the Price Low to High.
    And Driver turns off

package stepDefinitions;

import config.ConfigReader;
import io.cucumber.java.en.*;
import org.asynchttpclient.util.Assertions;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;
import pages.US_07_11_15_Pages;
import utilities.ReusableMethods;

import static drivers.Driver.getAppiumDriver;

public class US_07_11_15_Steps {

    Actions actions = new Actions(getAppiumDriver());
    LoginPage loginPage = new LoginPage();
    US_07_11_15_Pages myStepsPage = new US_07_11_15_Pages();

    @Then("Verifies that the profile button is visible and active.")
    public void verifies_that_the_profile_button_is_visible_and_active() {
        Assert.assertTrue(loginPage.ProfileButton.isDisplayed());
        Assert.assertTrue(loginPage.ProfileButton.isEnabled());
        ReusableMethods.wait(2);
    }

    @And("Click on your profile icon.")
    public void click_on_your_profile_icon() {
        loginPage.ProfileButton.click();
        ReusableMethods.wait(2);
    }

    @Then("Verifies that the sign up button is visible and active.")
    public void verifies_that_the_sign_up_button_is_visible_and_active() {
        Assert.assertTrue(loginPage.SignUpButton.isDisplayed());
        Assert.assertTrue(loginPage.SignUpButton.isEnabled());
        ReusableMethods.wait(2);
    }

    @Given("Click on your sign up icon.")
    public void click_on_your_sign_up_icon() {
        loginPage.SignUpButton.click();
        ReusableMethods.wait(2);
    }

    @Given("Click the name box and enter any name.")
    public void click_the_name_box_and_enter_any_name() {
        myStepsPage.nameBox.click();
        myStepsPage.nameBox.sendKeys(ConfigReader.getProperty("hamzaUserName"));
        ReusableMethods.wait(2);
    }

    @When("Click on the use email instead link.")
    public void click_on_the_use_email_instead_link() {
        myStepsPage.emailInsteadButton.click();
        ReusableMethods.wait(2);
    }

    @When("Enter a valid email in the email box.")
    public void enter_a_valid_email_in_the_email_box() {
        myStepsPage.emailBox.click();
        myStepsPage.emailBox.sendKeys(ConfigReader.getProperty("hamzaEmailBox"));
        ReusableMethods.wait(2);
    }

    @When("Enter a valid password in the password box.")
    public void enter_a_valid_password_in_the_password_box() {
        myStepsPage.passwordBox.click();
        myStepsPage.passwordBox.sendKeys(ConfigReader.getProperty("hamzaPassword"));
        ReusableMethods.wait(2);
    }

    @When("Click the sign up button.")
    public void click_the_sign_up_button() {
        myStepsPage.signUpButtonLink.click();
        ReusableMethods.wait(2);
    }

    @Then("Verify that the message user created successfully is displayed.")
    public void verify_that_the_message_user_created_successfully_is_displayed() {
        Assert.assertTrue(myStepsPage.successfullyMessage.isDisplayed());
        ReusableMethods.wait(2);
    }

    @When("Enter an invalid email in the Email box.")
    public void enter_an_invalid_email_in_the_email_box() {
        myStepsPage.emailBox.click();
        myStepsPage.emailBox.sendKeys(ConfigReader.getProperty("hamzaInvalidEmailBox"));
        ReusableMethods.wait(2);
    }

    @Then("Verify that the sign up button is not active.")
    public void verify_that_the_sign_up_button_is_not_active() {
        Assert.assertFalse(myStepsPage.signUpButtonLink.isSelected());
        ReusableMethods.wait(2);
    }

    @When("Enter a invalid password in the password box.")
    public void enter_a_invalid_password_in_the_password_box() {
        myStepsPage.passwordBox.click();
        myStepsPage.passwordBox.sendKeys(ConfigReader.getProperty("hamzaInvalidPassword"));
        ReusableMethods.wait(2);
    }

    @Then("Verify the error message above due to invalid password entry.")
    public void verify_the_error_message_above_due_to_invalid_password_entry() {
        Assert.assertTrue(myStepsPage.errorMessage.isDisplayed());
        ReusableMethods.wait(2);
    }

    @Given("Click on your sign in icon.")
    public void click_on_your_sign_in_icon() {
        myStepsPage.profileSignInButton.click();
        ReusableMethods.wait(2);
    }

    @When("Click the sign in button.")
    public void click_the_sign_in_button() {
        loginPage.SignInButton2.click();
        ReusableMethods.wait(2);
    }

    @When("Click to add two products on the homepage to your wishlist.")
    public void click_to_add_two_products_on_the_homepage_to_your_wishlist() {
        myStepsPage.homepageFirstHeart.click();
        ReusableMethods.wait(2);
        myStepsPage.homepageSecondHeart.click();
        ReusableMethods.wait(2);
    }

    @Then("Added to wishlist verify warning text.")
    public void added_to_wishlist_verify_warning_text() {
        Assert.assertTrue(myStepsPage.wishlistComeWarningMessage.isDisplayed());
        ReusableMethods.wait(2);
    }

    @And("Enter a valid user email in the email box.")
    public void enterAValidUserEmailInTheEmailBox() {
        myStepsPage.nameBox.click();
        myStepsPage.nameBox.sendKeys(ConfigReader.getProperty("hamzaCustomerEmail"));
        ReusableMethods.wait(2);
    }

    @When("Enter a valid user password in the password box.")
    public void enterAValidUserPasswordInThePasswordBox() {
        myStepsPage.emailBox.click();
        myStepsPage.emailBox.sendKeys(ConfigReader.getProperty("hamzaCustomerPassword"));
    }
}

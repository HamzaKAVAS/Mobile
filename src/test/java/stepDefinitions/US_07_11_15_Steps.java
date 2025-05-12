package stepDefinitions;

import io.cucumber.java.en.*;
import org.asynchttpclient.util.Assertions;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;
import utilities.ReusableMethods;

import static drivers.Driver.getAppiumDriver;

public class US_07_11_15_Steps {

    Actions actions = new Actions(getAppiumDriver());
    LoginPage loginPage = new LoginPage();

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

}

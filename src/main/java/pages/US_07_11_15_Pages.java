package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static drivers.Driver.getAppiumDriver;

public class US_07_11_15_Pages {

    public US_07_11_15_Pages() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);
    }

    @AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
    public WebElement nameBox;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"*Use Email Instead\"]")
    public WebElement emailInsteadButton;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    public WebElement emailBox;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[3]")
    public WebElement passwordBox;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Sign Up\"])[2]")
    public WebElement signUpButtonLink;

    @AndroidFindBy(xpath = "(//android.widget.ImageView)[1]")
    public WebElement successfullyMessage;

    @AndroidFindBy(xpath = "//android.widget.ImageView")
    public WebElement errorMessage;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Sign In\"]")
    public WebElement profileSignInButton;

    @AndroidFindBy(xpath = "//*[@text='Don’t allow']")
    public WebElement maybeDontAllow;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    public WebElement homepageFirstHeart;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(9)")
    public WebElement homepageSecondHeart;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    public WebElement wishlistComeWarningMessage;

    @AndroidFindBy(xpath = "(//android.view.View)[19]")
    public WebElement relevantProduct;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Favorite\")")
    public WebElement relevantFavorite;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Women\")")
    public WebElement homepageScrollWomenCategory;

    @AndroidFindBy(xpath = "(//android.view.View)[10]")
    public WebElement womenCategoryFirstProduct;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"M\")")
    public WebElement sizeMediumButton;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.ImageView[2]")
    public WebElement quantityNumberButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Add To Cart\")")
    public WebElement addToCartButtonFirstProduct;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sort By\")")
    public WebElement filterSortBy;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Brands\")")
    public WebElement filterBrands;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"size\")")
    public WebElement filterSize;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"color\")")
    public WebElement filterColor;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Price Low To High\")")
    public WebElement filterPriceLowToHigh;
}

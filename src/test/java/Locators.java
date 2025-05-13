import org.openqa.selenium.By;

public class Locators {
    // All locators for SuccessPage
    public static final By SUCCESS_SPAN = By.cssSelector(".card > span:nth-child(1)");

    // All locators for the LoginPage
    public static final By USERNAME_FIELD = By.id("username");
    public static final By  PASSWORD_FIELD = By.id("password");
    public static final By SUBMIT_BUTTON = By.cssSelector("button.button:nth-child(1)");
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthPage {

    private WebDriver driver;

    private By username = Locators.USERNAME_FIELD;
    private By password = Locators.PASSWORD_FIELD;
    private By loginButton = Locators.SUBMIT_BUTTON;

    public AuthPage(WebDriver driver) {
        this.driver = driver;
        driver.get("https://webtests.dev/forms/login/simple/");
    }

    public void setUsername(String text) {
        driver.findElement(username).sendKeys(text);
    }

    public void setPassword(String text) {
        driver.findElement(password).sendKeys(text);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public SuccessPage performLogin(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickLoginButton();
        return new SuccessPage(BasePage.driver);
    }
}
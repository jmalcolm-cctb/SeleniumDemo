import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "username")
    private WebElement username;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(css = "button.button:nth-child(1)")
    private WebElement loginButton;

    public LoginPage() {
        init(this, "https://webtests.dev/forms/login/simple/");
    }

    public LoginPage(WebDriver driver) {
        BasePage.driver = driver;
        init(this, "https://webtests.dev/forms/login/simple/");
    }

    public void setUsername(String text) {
        setText(username, text);
    }

    public void setPassword(String text) {
        setText(password, text);
    }

    public void clickLoginButton() {
        clickElement(loginButton);
    }

    public SuccessPage performLogin(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickLoginButton();
        return new SuccessPage(BasePage.driver);
    }
}

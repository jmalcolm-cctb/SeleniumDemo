import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SuccessPage {
    // Private properties for elements found on this page
    private WebElement resultSpan;

    // Constructor to initialize driver and elements
    public SuccessPage(WebDriver driver) {
        resultSpan = driver.findElement(By.cssSelector(".card > span:nth-child(1)"));
    }

    // Methods that can be called from my test code
    public String getResultText() {
        return resultSpan.getText();
}















/*
public class SuccessPage extends BasePage {
    //@FindBy(css = Locators.SUCCESS_SPAN)
    private By resultSpan = Locators.SUCCESS_SPAN;

    public String getResultSpan() {
        return getElement(resultSpan).getText();
    }

    /*
    public SuccessPage() {
        while (!getTitle().contains("Success")) {
            navigateToPage("https://webtests.dev/forms/response/login-success/");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //init(this);
    }
     */
}

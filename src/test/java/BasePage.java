import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public static WebDriver driver;

    public static void setDriver(WebDriver d) {
        BasePage.driver = d;
    }

    public void init(Object page) {
        PageFactory.initElements(BasePage.driver, page);
    }

    public void init(Object page, String url) {
        init(page);
        navigateToPage(url);
    }

    public static void closeDriver() {
        driver.quit();
    }

    public void navigateToPage(String url) {
        driver.get(url);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    protected void setText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    protected void clickElement(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions
                .elementToBeClickable(element));
        element.click();
    }

    protected WebElement getElement(By locator) {
        return driver.findElement(locator);
    }
}

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Test {
    @org.testng.annotations.Test
    public void loginTest() {

        Logger logger = LogManager.getLogger();
        logger.error("Some error happened!");

        System.setProperty("webdriver.chrome.driver", "linuxchromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options); // Creating a new instance of the ChromeDriver

        String s = "bugs bunny";
        driver.get("https://wikipedia.org");
        var sb = driver.findElement(By.cssSelector("html.js-enabled body#www-wikipedia-org.jsl10n-visible main div.search-container form#search-form.pure-form fieldset div#search-input.search-input input#searchInput"));
        sb.sendKeys(s);
        var submit = driver.findElement(By.cssSelector(".pure-button"));
        submit.click();

        var title = driver.findElement(By.cssSelector("#firstHeading > span:nth-child(1)"));
        System.out.println(title.getText());
        logger.error(title.getText());
        Assert.assertEquals(title.getText().toLowerCase(), s);

        /*
        // Test that username/password login is working
        var loginPage = new LoginPage(driver);
        var successPage =
                loginPage.performLogin("jsmith", "password");

        // Grab success message to prove our test worked
        //System.out.println(successPage.getResultText());
        Assert.assertEquals(successPage.getResultText(), "Login was successful!");

         */
    }
}

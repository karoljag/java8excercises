package selenium.tests.headlesschrome;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;
import selenium.tests.DriverFactory;

import java.io.File;
import java.util.List;
import java.util.function.Predicate;

public class Headlesschrome {
    private static WebDriver driver;

    WebElement btn() {
        return driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[2]"));
    }


    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chromeheadless") String browser) {
        this.driver = DriverFactory.getDriver(browser);
    }

    @Test(priority = 1)
    public void googleTest() {
        this.driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getCurrentUrl(),"xxxx");
        driver.manage().getCookies();

    }

    @Test(priority = 2)
    public void btnTest() {
        btn().click();
    }

    @AfterTest
    public void quit() {
        this.driver.quit();
    }
}

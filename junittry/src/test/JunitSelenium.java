package src.test;

import org.junit.*;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import src.DriverFactory;

public class JunitSelenium {

    private static WebDriver driver;
    WebElement element;
    String browser;

    @Before
    public void setDriver() {
        browser = "chrome";
        this.driver = DriverFactory.getDriver(browser);
    }

    @Test
    public void testWebsite(){
        System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
        driver.get("https://www.5balloons.info");
        Assert.assertEquals("5 Balloons | Jack of many web trades", driver.getTitle());
        System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }

}

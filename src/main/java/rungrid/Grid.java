package rungrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid {
    WebDriver driver;
    String baseUrl, nodeUrl;

    @BeforeTest
    public void setup() throws MalformedURLException {
        baseUrl = "https://www.google.pl/";
        nodeUrl = "http://localhost:4444/wd/hub";
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        driver = new RemoteWebDriver(new URL(nodeUrl),capability);
    }

    @AfterTest
    public void quit(){
        driver.quit();
    }

    @Test
    public void test(){
        driver.get(baseUrl);
        Assert.assertEquals("Google",driver.getTitle());
    }

}

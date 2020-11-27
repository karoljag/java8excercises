package parallelselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GridSel {


    WebDriver driver4;
    WebDriver driver1;
    WebDriver driver2;
    WebDriver driver3;
    String baseUrl_google,baseUrl_github,baseUrl_blaze,baseUrl_toolsQA, nodeUrl;

//    @BeforeTest
//    public void setup() throws MalformedURLException {
//        baseUrl_google = "https://www.google.pl/";
//        baseUrl_github = "https://github.com/";
//        baseUrl_blaze = "https://www.blazemeter.com/";
//        baseUrl_toolsQA = "https://www.toolsqa.com/";
//        nodeUrl = "http://localhost:4444/wd/hub";
//        DesiredCapabilities capability = DesiredCapabilities.chrome();
//        driver = new RemoteWebDriver(new URL(nodeUrl),capability);
//    }

    @BeforeTest
    public void setup() throws MalformedURLException {
        baseUrl_google = "https://www.google.pl/";
        baseUrl_github = "https://github.com/";
        baseUrl_blaze = "https://www.blazemeter.com/";
        baseUrl_toolsQA = "https://www.toolsqa.com/";
        nodeUrl = "http://localhost:4444/wd/hub";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jagla\\Desktop\\web_drivers\\chromedriver.exe");
        DesiredCapabilities capability = DesiredCapabilities.chrome();
     //   driver = new ChromeDriver();
    //    driver = new RemoteWebDriver(new URL(nodeUrl),capability);

        //    baseUrl = "https://www.google.pl/";
//            nodeUrl = "http://localhost:4444/wd/hub";
//            DesiredCapabilities capability = DesiredCapabilities.chrome();
//            driver = new RemoteWebDriver(new URL(nodeUrl),capability);


    }

//    @AfterTest
//    public void quit(){
//        driver.quit();
//    }

    @Test
    public void test1(){
        driver1 = new ChromeDriver();
        driver1.get(baseUrl_google);
        try {
            Thread.sleep( 5000 );
        } catch (InterruptedException e) {
        }
        System.out.println( "THREAD: "+Thread.currentThread().getId());
     //   Assert.assertEquals("Google",driver1.getTitle());
        driver1.quit();
    }

    @Test
    public void test2(){
        driver2 = new ChromeDriver();
        driver2.get(baseUrl_github);
        try {
            Thread.sleep( 5000 );
        } catch (InterruptedException e) {
        }
        System.out.println( "THREAD: "+Thread.currentThread().getId());
     //   Assert.assertEquals("GitHub",driver2.getTitle());
        driver2.quit();
    }
    @Test
    public void test3(){
        driver3 = new ChromeDriver();
        driver3.get(baseUrl_blaze);
        try {
            Thread.sleep( 5000 );
        } catch (InterruptedException e) {
        }
        System.out.println( "THREAD: "+Thread.currentThread().getId());
//        Assert.assertEquals("Blazemeter",driver3.getTitle());
        driver3.quit();
    }
    @Test
    public void test4(){
        driver4 = new ChromeDriver();
        driver4.get(baseUrl_toolsQA);
        try {
            Thread.sleep( 5000 );
        } catch (InterruptedException e) {
        }
        System.out.println( "THREAD: "+Thread.currentThread().getId());
//        Assert.assertEquals("TestNG",driver4.getTitle());
        driver4.quit();
    }

}

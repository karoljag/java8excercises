package selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.util.List;
import java.util.function.Predicate;

public class DriverT {
    private static WebDriver driver;

    WebElement btn() {
        return driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[2]"));
    }


    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser) {
        this.driver = DriverFactory.getDriver(browser);
    }

    @Test(priority = 1)
    public void googleTest() {
        this.driver.get("https://www.google.com/");
   //     driver.findElements(By.tagName("a")).forEach(v -> System.out.println(v.getText()));
        List<WebElement> listOfWebelemtns = driver.findElements(By.tagName("a"));



        Predicate<WebElement> isBlank = (q) -> q.getText().trim().length() == 0;
//        System.out.println("Before:: "+listOfWebelemtns.size());
//
      //  listOfWebelemtns.removeIf(isBlank);
//        System.out.println("After:: "+listOfWebelemtns.size());
//        listOfWebelemtns.forEach((n) -> System.out.println(n.getText()));
//
        Predicate<WebElement> containS =(s)->s.getText().toLowerCase().contains("s");
        listOfWebelemtns.removeIf(isBlank.or(containS));
        System.out.println("After:: "+listOfWebelemtns.size());
        listOfWebelemtns.forEach((n) -> System.out.println(n.getText()));
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

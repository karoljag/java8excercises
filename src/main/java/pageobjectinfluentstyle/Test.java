package pageobjectinfluentstyle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import selenium.tests.DriverFactory;
import org.testng.annotations.*;

public class Test {
    private static WebDriver driver;




    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser) {
        this.driver = DriverFactory.getDriver(browser);
    }




    @org.testng.annotations.Test(priority = 1)
    public void Register() {

                RegistrationPage.using(driver)
                .launch()
                .setFirstName("fn")
                .setLastName("ln")
                .setUserName("abcd")
                .setPassword("abcd")
                .setConfirmPassword("abcd")
                .submit();
        driver.get("http://newtours.demoaut.com/mercurysignon.php");

        LoginPage.using(driver)
                .setUsername("abcd").setPassword("abcd")
                .setPassword("abcd")
                .login();


    }
    @org.testng.annotations.Test(priority = 2)
    public void LoginTest() {
        driver.get("http://newtours.demoaut.com/mercurysignon.php");
        LoginPage.using(driver)
                .setUsername("abcd").setPassword("abcd")
                .setPassword("abcd")
                .login();
    }


    @AfterTest
    public void quit() {
        this.driver.quit();
    }
}

package pageobjectinfluentstyle.dynamic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import selenium.tests.DriverFactory;

public class Test_dynamic {
    private static WebDriver driver;




    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser) {
        this.driver = DriverFactory.getDriver(browser);
    }




    @org.testng.annotations.Test(priority = 1)
    public void Register() {

                RegistrationPage_dynamicWebelement.using(driver)
                .launch()
                .setFirstName("fn")
                .setLastName("ln")
                .setUserName("abcd")
                .setPassword("abcd")
                .setConfirmPassword("abcd")
                .submitd();
        driver.get("http://newtours.demoaut.com/mercurysignon.php");


    }


    @org.testng.annotations.Test(priority = 2)
    public void LoginTest() {
        driver.get("http://newtours.demoaut.com/mercurysignon.php");
        LoginPage_dynamicWebelement.using(driver)
                .setUsername("abcd").setPassword("abcd")
                .setPassword("abcd")
                .login();
    }


    @AfterTest
    public void quit() {
        this.driver.quit();
    }
}

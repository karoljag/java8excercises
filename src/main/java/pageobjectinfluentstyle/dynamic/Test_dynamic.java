package pageobjectinfluentstyle.dynamic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import selenium.tests.DriverFactory;

public class Test_dynamic {
    private static WebDriver driver;




    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser) {
        this.driver = DriverFactory.getDriver(browser);
    }




    @Test(priority = 1,description="Invalid Register Scenario with wrong username and password.")
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


    @Test(priority = 0, description="Invalid Login Scenario with wrong username and password.")
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

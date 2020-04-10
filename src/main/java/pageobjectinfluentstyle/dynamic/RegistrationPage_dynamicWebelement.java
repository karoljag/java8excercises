package pageobjectinfluentstyle.dynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage_dynamicWebelement {
    final WebDriver driver;

    public RegistrationPage_dynamicWebelement(WebDriver wd){
        this.driver=wd;
    }


    private WebElement firstName(){return driver.findElement(By.name("firstName"));};

    private WebElement lastName(){return driver.findElement(By.name("lastName"));};

    private WebElement userName(){return driver.findElement(By.name("email"));};

    private WebElement password(){return driver.findElement(By.name("password"));};

    private WebElement confirmPassword(){return driver.findElement(By.name("confirmPassword"));};

    private WebElement submit(){return driver.findElement(By.name("register"));};


    public static RegistrationPage_dynamicWebelement using(WebDriver driver) {
        return new RegistrationPage_dynamicWebelement(driver);
    }


    public RegistrationPage_dynamicWebelement launch() {
        driver.get("http://newtours.demoaut.com/mercuryregister.php");
        return this;
    }

    public RegistrationPage_dynamicWebelement setFirstName(String firstName) {
        this.firstName().sendKeys(firstName);
        return this;
    }

    public RegistrationPage_dynamicWebelement setLastName(String lastName) {
        this.lastName().sendKeys(lastName);
        return this;
    }

    public RegistrationPage_dynamicWebelement setUserName(String userName) {
        this.userName().sendKeys(userName);
        return this;
    }

    public RegistrationPage_dynamicWebelement setPassword(String password) {
        this.password().sendKeys(password);
        return this;
    }

    public RegistrationPage_dynamicWebelement setConfirmPassword(String confirmPassword) {
        this.confirmPassword().sendKeys(confirmPassword);
        return this;
    }

    public void submitd() {
        this.submit().click();
    }
}

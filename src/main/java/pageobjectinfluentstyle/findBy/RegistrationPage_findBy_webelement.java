package pageobjectinfluentstyle.findBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage_findBy_webelement {


     final WebDriver driver;

    @FindBy(name = "firstName")
    private WebElement firstName;

    @FindBy(name = "lastName")
    private WebElement lastName;

    @FindBy(name = "email")
    private WebElement userName;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "confirmPassword")
    private WebElement confirmPassword;

    @FindBy(name = "register")
    private WebElement submit;

    private RegistrationPage_findBy_webelement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static RegistrationPage_findBy_webelement using(WebDriver driver) {
        return new RegistrationPage_findBy_webelement(driver);
    }

    public RegistrationPage_findBy_webelement launch() {
        driver.get("http://newtours.demoaut.com/mercuryregister.php");
        return this;
    }

    public RegistrationPage_findBy_webelement setFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
        return this;
    }

    public RegistrationPage_findBy_webelement setLastName(String lastName) {
        this.lastName.sendKeys(lastName);
        return this;
    }

    public RegistrationPage_findBy_webelement setUserName(String userName) {
        this.userName.sendKeys(userName);
        return this;
    }

    public RegistrationPage_findBy_webelement setPassword(String password) {
        this.password.sendKeys(password);
        return this;
    }

    public RegistrationPage_findBy_webelement setConfirmPassword(String confirmPassword) {
        this.confirmPassword.sendKeys(confirmPassword);
        return this;
    }

    public void submit() {
        this.submit.click();
    }





}

package pageobjectinfluentstyle.findBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_findBy_webelement {


    @FindBy(name = "userName")
    private WebElement userName;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "login")
    private WebElement loginBtn;

    private LoginPage_findBy_webelement(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public static LoginPage_findBy_webelement using(WebDriver driver) {
        return new LoginPage_findBy_webelement(driver);
    }



    public LoginPage_findBy_webelement setUsername(String username) {
        this.userName.sendKeys(username);
        return this;
    }

    public LoginPage_findBy_webelement setPassword(String password) {
        this.password.sendKeys(password);
        return this;
    }

    public void login() {
        this.loginBtn.click();
    }



}

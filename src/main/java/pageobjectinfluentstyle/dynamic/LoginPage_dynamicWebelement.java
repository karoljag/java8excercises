package pageobjectinfluentstyle.dynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage_dynamicWebelement {
    final WebDriver driver;
    public LoginPage_dynamicWebelement(WebDriver driver) {this.driver=driver;};

    private WebElement userName(){ return driver.findElement(By.name("userName"));};
    private WebElement password(){ return driver.findElement(By.name("password"));};
    private WebElement loginBtn(){ return driver.findElement(By.name("login"));};







    public static LoginPage_dynamicWebelement using(WebDriver driver) {
        return new LoginPage_dynamicWebelement(driver);
    }



    public LoginPage_dynamicWebelement setUsername(String username) {
        this.userName().sendKeys(username);
        return this;
    }

    public LoginPage_dynamicWebelement setPassword(String password) {
        this.password().sendKeys(password);
        return this;
    }

    public void login() {
        this.loginBtn().click();
    }

}

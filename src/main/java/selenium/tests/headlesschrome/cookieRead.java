package selenium.tests.headlesschrome;

import jdk.internal.util.xml.impl.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import selenium.tests.DriverFactory;
import sun.security.util.Password;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class cookieRead {
    private static WebDriver driver;

    public static void main(String[] args) {
        // private static WebDriver driver;
//        System.setProperty("webdriver.chrome.driver","G:///chromedriver.exe");
//        driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");


        // Input Email id and Password If you are already Register
        driver.findElement(By.name("username")).sendKeys("abc123");
        driver.findElement(By.name("password")).sendKeys("123xyz");
        driver.findElement(By.name("submit")).click();

        // create file named Cookies to store Login Information
        File file = new File("Cookies.data");
        try {
            // Delete old file if exists
            file.delete();
            file.createNewFile();
            FileWriter fileWrite = new FileWriter(file);
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);
            // loop for getting the cookie information

            // loop for getting the cookie information
            for (Cookie ck : driver.manage().getCookies()) {
                Bwrite.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";" + ck.getExpiry() + ";" + ck.isSecure()));
                Bwrite.newLine();
            }
            Bwrite.close();
            fileWrite.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chromeheadless") String browser) {
        this.driver = DriverFactory.getDriver(browser);
    }

    @AfterTest
    public void quit() {
        this.driver.quit();
    }

    @Test(priority = 1)
    public void cookieTest_guru() {
        driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
        // Input Email id and Password If you are already Register
        driver.findElement(By.name("username")).sendKeys("abc123");
        driver.findElement(By.name("password")).sendKeys("123xyz");
        driver.findElement(By.name("submit")).click();

        // create file named Cookies to store Login Information
        File file = new File("Cookies.data");
        try {
            // Delete old file if exists
            file.delete();
            file.createNewFile();
            FileWriter fileWrite = new FileWriter(file);
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);
            // loop for getting the cookie information

            // loop for getting the cookie information
            for (Cookie ck : driver.manage().getCookies()) {
                Bwrite.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";" + ck.getExpiry() + ";" + ck.isSecure()));
                Bwrite.newLine();
            }
            Bwrite.close();
            fileWrite.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    @Test(priority = 1)
    public void cookieTest_guru_beforeLogin() {
        driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");

       //  create file named Cookies to store Login Information
        File file = new File("beforeLogin.data");
        try {
            // Delete old file if exists
            file.delete();
            file.createNewFile();
            FileWriter fileWrite = new FileWriter(file);
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);
            // loop for getting the cookie information

            // loop for getting the cookie information
            System.out.println("Number of cookies: "+driver.manage().getCookies().size());
            for (Cookie ck : driver.manage().getCookies()) {
                System.out.println("Cookiename:"+ck.getName());
                Bwrite.write((ck.getName() + "," + ck.getValue() + "," + ck.getDomain() + "," + ck.getPath() + "," + ck.getExpiry() + "," + ck.isSecure()));
                Bwrite.newLine();
            }
            Bwrite.close();
            fileWrite.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    @Test(priority = 1)
    public void cookieTest_guru_AfterLogin() {
        driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
        // Input Email id and Password If you are already Register
        driver.findElement(By.name("username")).sendKeys("abc123");
        driver.findElement(By.name("password")).sendKeys("123xyz");
        driver.findElement(By.name("submit")).click();

        // create file named Cookies to store Login Information
        File file = new File("afterLogin.csv");
        try {
            // Delete old file if exists
            file.delete();
            file.createNewFile();
            FileWriter fileWrite = new FileWriter(file);
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);
            // loop for getting the cookie information


            System.out.println("Number of cookies: "+driver.manage().getCookies().size());
            // loop for getting the cookie information
            for (Cookie ck : driver.manage().getCookies()) {
                System.out.println("Cookiename:"+ck.getName());
                Bwrite.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";" + ck.getExpiry() + ";" + ck.isSecure()));
                Bwrite.newLine();
            }
            Bwrite.close();
            fileWrite.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }



//    @Test_dynamic(priority = 1)
//    public void googleTest() {
//        driver.get("https://www.google.com/");
//
//        File file = new File("CookiesGoogle.data");
//        try {
//            // Delete old file if exists
//            file.delete();
//            file.createNewFile();
//            FileWriter fileWrite = new FileWriter(file);
//            BufferedWriter Bwrite = new BufferedWriter(fileWrite);
//            // loop for getting the cookie information
//
//            // loop for getting the cookie information
//            for (Cookie ck : driver.manage().getCookies()) {
//                Bwrite.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";" + ck.getExpiry() + ";" + ck.isSecure()));
//                Bwrite.newLine();
//            }
//            Bwrite.close();
//            fileWrite.close();
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//
//    }
}

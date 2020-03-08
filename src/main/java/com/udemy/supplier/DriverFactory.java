package com.udemy.supplier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DriverFactory {

    private static final Supplier<WebDriver> chromeSuppler = () -> {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jagla\\Desktop\\web_drivers\\chromedriver.exe");
        return new ChromeDriver();
    };

    private static final Supplier<WebDriver> firefoxSupplier = () -> {
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        return new FirefoxDriver();
    };

    private static final Map<String, Supplier<WebDriver>> MAP = new HashMap<>();

    static {
        MAP.put("chrome",chromeSuppler);
        MAP.put("firefox",firefoxSupplier);
    }

    public static WebDriver getDriver(String browser){
        return MAP.get(browser).get();
    }
}

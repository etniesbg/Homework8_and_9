package com.bmi.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UtilDriver {
    private static WebDriver driver;
    private static WebDriverWait webDriverWait;

    public static void setUpDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriverWait getWebDriverWait(){
        return webDriverWait;
    }
}

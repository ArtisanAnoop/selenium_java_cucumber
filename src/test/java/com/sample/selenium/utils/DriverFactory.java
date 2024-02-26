package com.sample.selenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// import other necessary WebDriver classes

public class DriverFactory {

    public static WebDriver getDriver() {
        String browserName = System.getProperty("browser", "chrome").toLowerCase();

        switch (browserName) {
            case "firefox":
                // Set the path for the Firefox driver, e.g., System.setProperty(...)
                return new FirefoxDriver();

            case "chrome":
            default:
                // Set the path for the Chrome driver, e.g., System.setProperty(...)
                return new ChromeDriver();

            // You can add more cases for other browsers like Edge, Safari, etc.
        }
    }
}

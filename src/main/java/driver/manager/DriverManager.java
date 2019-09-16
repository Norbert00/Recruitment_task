package driver.manager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


/*
    In this class you can find all the things which can help manipulate the driver, initialization,
    closing, changing to javascript executor perform Action
 */

public class DriverManager {
    private static WebDriver driver;


    public static WebDriver getWebDriver() {
        if(driver == null) {
            System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");   // to run the test pleas select the correct path to webdriver
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void disposeDriver() {
        driver.close();
        driver.quit();
        driver = null;
    }

    public static JavascriptExecutor javaScriptExecutor() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        return jse;
    }

    public static Actions preformAction() {
        Actions action = new Actions(driver);
        return action;
    }

}

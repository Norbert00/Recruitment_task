package windowsHelper;

import driver.manager.DriverManager;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import waits.WaitForElement;

/*
Class collects all methods which help to handle with switching between window, iframe, popups
 */

public class WidnowsSwitcher {

    public static boolean StaleElementHandleByID(WebElement element) {
        boolean clicked = false;
        while (!clicked) {
            try {
                WaitForElement.waitUntilElementIsClickable(element);
                element.click();
                clicked = true;
            } catch (StaleElementReferenceException e) {
                e.toString();
            }
        }
        return true;
    }

    public static void switchToIframe(WebElement element) {
        DriverManager.getWebDriver().switchTo().frame(element);
    }

    public static void switchBackFromIframe() {
        DriverManager.getWebDriver().switchTo().defaultContent();
    }


    public static void switchToPopUp() {
        String myWindowHandle = DriverManager.getWebDriver().getWindowHandle();
        DriverManager.getWebDriver().switchTo().window(myWindowHandle);
    }



}

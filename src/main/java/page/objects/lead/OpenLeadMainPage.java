package page.objects.lead;

import driver.manager.DriverManager;
import logger.LoggerManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

    /*
        Class helps describe users steps in the browser. Each steps is printing to the console during the test.
     */


public class OpenLeadMainPage {

    @FindBy(css = "span[class='lead-status']")
    private WebElement leadStatus;

    @FindBy(css = "a[class='btn detail-edit']")
    private WebElement editButton;

    @FindBy(xpath = "//span[@class='detail-title']")
    private WebElement title;


    public OpenLeadMainPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public String checkingLeadStatus() {
        WaitForElement.waitUntilElementIsVisible(leadStatus);
        String actualLeadStatus = leadStatus.getText();
        LoggerManager.setLoggerInfo("User check lead status: ", actualLeadStatus);
        return actualLeadStatus;
    }

    public void clickOnEditButton() {
        WaitForElement.waitUntilElementIsVisible(title);
        JavascriptExecutor jse = DriverManager.javaScriptExecutor();
        jse.executeScript("document.getElementsByClassName(\"btn detail-edit\")[0].click()");
        LoggerManager.setLoggerInfo("User clicked Edit button for the Lead");
    }


}

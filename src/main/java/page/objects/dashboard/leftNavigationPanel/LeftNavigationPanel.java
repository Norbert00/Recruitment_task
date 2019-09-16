package page.objects.dashboard.leftNavigationPanel;


import driver.manager.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import logger.LoggerManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;


public class LeftNavigationPanel {
    /*
      Class collects all elements on the left navigation panel nav-main on the Main page and also all actions
    */

    @FindBy(xpath = "//ul[@id='nav-main']/li[4]/a")
    private WebElement newLeadButton;


    public LeftNavigationPanel() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnNewLeadButton() {
        // this is conscious workaround
        JavascriptExecutor jse = DriverManager.javaScriptExecutor();
        jse.executeScript("document.getElementById(\"nav-working-leads\").click();");
        LoggerManager.setLoggerInfo("User clicks on the Leads button on the left nav bar");
    }





}

package page.objects.dashboard.rightNavigationPanel;


import driver.manager.DriverManager;
import logger.LoggerManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import windowsHelper.WidnowsSwitcher;

/*
    Class collects all elements on the right navigation panel nav-right on the Main page and also all actions
 */


public class RightNavigationPanel {

    @FindBy(xpath = "//button[contains(@class,'_1Vg--GlobalAdd--GlobalAdd')]")
    private WebElement addButton;

    @FindBy(xpath = "//span[contains(text(),'Lead')]")
    private WebElement leadButton;

    public RightNavigationPanel() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }


    public void clickAddButton() {
        WidnowsSwitcher.StaleElementHandleByID(addButton);
        LoggerManager.setLoggerInfo("User clicks Add button");
    }

    public void clickLeadButton() {
        leadButton.click();
        LoggerManager.setLoggerInfo("User clicks Lead button");
    }





}

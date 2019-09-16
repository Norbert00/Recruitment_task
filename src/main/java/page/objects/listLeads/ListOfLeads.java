package page.objects.listLeads;

import driver.manager.DriverManager;
import logger.LoggerManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

/*
    Class collects all elements on the list of leads and actions
 */

public class ListOfLeads {

    @FindBy(xpath = "//div[@class='_2gD--Ellipsis--Ellipsis _2TO--ActionLink--label']/span")
    private WebElement leadOnTheList;

    public ListOfLeads() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnTheLead() {
        WaitForElement.waitUntilElementIsClickable(leadOnTheList);
        leadOnTheList.click();
        LoggerManager.setLoggerInfo("User click on the first lead form the list");
    }



}

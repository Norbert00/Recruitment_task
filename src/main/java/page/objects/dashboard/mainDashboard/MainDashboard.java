package page.objects.dashboard.mainDashboard;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class MainDashboard {

    @FindBy(xpath = "//div[contains(@class,'_1bR--DashboardPage--dashboardTitle _2Wo--fonts--regular_xxxl vz7--fonts--regular _3zJ--grid--width_4')]")
    private WebElement myDashboard;

    public MainDashboard() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void waitForMyDashboard(){
        WaitForElement.waitUntilElementIsVisible(myDashboard);
    }
}

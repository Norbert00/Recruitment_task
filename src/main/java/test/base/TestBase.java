package test.base;

import driver.manager.DriverManager;
import driver.utils.DriverUtils;
import org.testng.annotations.BeforeMethod;

import static navigationUrl.ApplicationUrl.APPLICATION_URL;

public class TestBase {

       /*
    Test base class initial BeforeMethod and AfterMethod from library TestNG.
    BeforeMethod initial basics configuration for the browser like maximize the size and navigate to correct url.
    After method closing the browser.
     */

    @BeforeMethod
    public void beforeMethod() {
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPageUrl(APPLICATION_URL);
    }

//    @AfterMethod
//    public void afterTest() {
//        DriverManager.disposeDriver();
//    }

}

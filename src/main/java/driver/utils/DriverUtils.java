package driver.utils;

import driver.manager.DriverManager;

public class DriverUtils {

    /*
        In this class you can find all things which can helps to initialize the test
     */

    public static void setInitialConfiguration() {
        DriverManager.getWebDriver()
                .manage()
                .window()
                .maximize();
    }

    public static void navigateToPageUrl(String pageURL) {
        DriverManager.getWebDriver()
                .navigate()
                .to(pageURL);
    }

}

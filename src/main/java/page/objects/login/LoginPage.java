package page.objects.login;

import driver.manager.DriverManager;
import logger.LoggerManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    /*
      Elements on the Main Page and method for them
    */

    @FindBy(id = "user_email")
    private WebElement emailInput;

    @FindBy(id = "user_password")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@class='btn btn-large btn-primary login-button']")
    private WebElement signInButton;


    public LoginPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void userTapingEmail(String email) {
        emailInput.sendKeys(email);
        LoggerManager.setLoggerInfo("Typed in to email input email {}", email);

    }

    public void  userTapingPassword(String password) {
        passwordInput.sendKeys(password);
        LoggerManager.setLoggerInfo("Typed in to password input password {}", password);

    }

    private void userClicksOnSignInButton() {
        signInButton.click();
        LoggerManager.setLoggerInfo("Click on the Sign in button");
    }

    public void typingEmailPasswordAndClickingSignIn(String email, String password) {
        userTapingEmail(email);
        userTapingPassword(password);
        userClicksOnSignInButton();
    }


}

package page.objects.lead;

import driver.manager.DriverManager;
import logger.LoggerManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;
import windowsHelper.WidnowsSwitcher;
import static helper.LoginHelper.*;


/*
    Class collects all elements on the Lead form and also all actions
 */

public class LeadForm {


    @FindBy(xpath = "//div[@data-action='lead-first-name-input']/input")
    private WebElement firstNameInput;

    @FindBy(xpath = "//div[@data-action='lead-last-name-input']/input")
    private WebElement lastNameInput;

    @FindBy(xpath = "//div[@data-action='mobile-number-input']/input")
    private WebElement mobileNumberInput;

    @FindBy(xpath = "//div[@data-action='phone-number-input']/input")
    private WebElement workNumberInput;

    @FindBy(xpath = "//span[@data-action='lead-company-name-dropdown']/div/input")
    private WebElement companyName;

    @FindBy(xpath = "//div[@data-action='email-address-input']/input")
    private WebElement emailInput;

    @FindBy(xpath = "//div[@data-action='title-input']/input")
    private WebElement titleInput;

    @FindBy(xpath = "//span[@data-action='lead-tags-multi-select']/div/div/input")
    private WebElement tagInput;

    @FindBy(xpath = "//div[@data-action='address-street-input']/input")  //call click before loop to open street, city, post code inputs
    private WebElement adressInput;

    @FindBy(xpath = "//div[@data-action='address-city-input']/input")
    private WebElement cityInput;

    @FindBy(xpath = "//div[@data-action='address-street-input']/input")
    private WebElement streetInput;

    @FindBy(xpath = "//div[@data-action='address-zip-input']/input")
    private WebElement postCodeInput;

    @FindBy(xpath = "//div[@data-action='address-state-region-input']/input")
    private WebElement stateRegionInput;

    @FindBy(xpath = "//div[@data-action='website-input']/input")
    private WebElement webSideInput;

    @FindBy(xpath = "//div[@data-action='skype-input']/input")
    private WebElement skypeInput;

    @FindBy(xpath = "//div[@data-action='facebook-input']/input")
    private WebElement facebookInput;

    @FindBy(xpath = "//div[@data-action='twitter-input']/input")
    private WebElement twitterInput;

    @FindBy(xpath = "//div[@data-action='linkedin-input']/input")
    private WebElement linkedinInput;

    @FindBy(xpath = "//div[@data-action='fax-number-input']/input")
    private WebElement faxInput;

    @FindBy(xpath = "//div[@data-action='description-multiline-input']/textarea")
    private WebElement descriptionInput;

    @FindBy(xpath = "//button[@data-action='save']")
    private WebElement saveButton;

    public LeadForm() {
        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }


    public void fillingTheForm() {
        WidnowsSwitcher.switchToPopUp();
        WaitForElement.waitUntilElementIsVisible(firstNameInput);
        firstNameInput.sendKeys(getFIRSTNAME());
        lastNameInput.sendKeys(getLASTNAME());
        mobileNumberInput.sendKeys(getMOBILENUMBER());
        workNumberInput.sendKeys(getWORKNUMBER());
        companyName.sendKeys(getCOMPANYNAME());
        emailInput.sendKeys(getEMAIL2());
        titleInput.sendKeys(getTITLE());
        tagInput.sendKeys(getTAG());
        adressInput.click();
        streetInput.sendKeys(getSTREET());
        cityInput.sendKeys(getCITY());
        postCodeInput.sendKeys(getPOSTCODE());
        stateRegionInput.sendKeys(getSTATE());
        webSideInput.sendKeys(getWEBSIDE());
        skypeInput.sendKeys(getSKYPE());
        facebookInput.sendKeys(getFACEBOOK());
        twitterInput.sendKeys(getTWITTER());
        linkedinInput.sendKeys(getLINKEDIN());
        faxInput.sendKeys(getFAX());
        descriptionInput.sendKeys(getDESCRIPTION());
        LoggerManager.setLoggerInfo("User fill the form");
        saveButton.click();
        LoggerManager.setLoggerInfo("User click  Save button");
    }

    public void editTitleInForm(String newTitle) {
        WaitForElement.waitUntilElementIsVisible(titleInput);
        titleInput.clear();
        LoggerManager.setLoggerInfo("User clear Title field");
        titleInput.sendKeys(newTitle);
        LoggerManager.setLoggerInfo("User set new Title {}", newTitle);
        saveButton.click();
    }




}

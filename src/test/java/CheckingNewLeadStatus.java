
import org.testng.annotations.Test;
import page.objects.dashboard.leftNavigationPanel.LeftNavigationPanel;
import page.objects.dashboard.mainDashboard.MainDashboard;
import page.objects.dashboard.rightNavigationPanel.RightNavigationPanel;
import page.objects.lead.LeadForm;
import page.objects.lead.OpenLeadMainPage;
import page.objects.listLeads.ListOfLeads;
import page.objects.login.LoginPage;
import test.base.TestBase;


import static helper.LoginHelper.getEmail;
import static helper.LoginHelper.getPassword;
import static org.testng.Assert.assertEquals;

public class CheckingNewLeadStatus extends TestBase {

    @Test
    public void checkingNewLeadStatusTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.typingEmailPasswordAndClickingSignIn(getEmail(), getPassword());

        MainDashboard mainDashboard = new MainDashboard();
        mainDashboard.waitForMyDashboard();

        RightNavigationPanel rightNavigationPanel = new RightNavigationPanel();
        rightNavigationPanel.clickAddButton();
        rightNavigationPanel.clickLeadButton();

        LeadForm leadForm = new LeadForm();
        leadForm.fillingTheForm();

        LeftNavigationPanel leftNavigationPanel = new LeftNavigationPanel();
        leftNavigationPanel.clickOnNewLeadButton();

        ListOfLeads listOfLeads = new ListOfLeads();
        listOfLeads.clickOnTheLead();

        OpenLeadMainPage openLeadMainPage = new OpenLeadMainPage();
        assertEquals("New", openLeadMainPage.checkingLeadStatus());

    }



}

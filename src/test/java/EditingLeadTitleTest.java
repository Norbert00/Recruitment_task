import org.testng.annotations.Test;
import page.objects.dashboard.leftNavigationPanel.LeftNavigationPanel;
import page.objects.dashboard.mainDashboard.MainDashboard;
import page.objects.lead.LeadForm;
import page.objects.lead.OpenLeadMainPage;
import page.objects.listLeads.ListOfLeads;
import page.objects.login.LoginPage;
import test.base.TestBase;

import static helper.LoginHelper.*;

public class EditingLeadTitleTest extends TestBase {


    @Test
    public void editingLeadStatusTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.typingEmailPasswordAndClickingSignIn(getEmail(), getPassword());

        MainDashboard mainDashboard = new MainDashboard();
        mainDashboard.waitForMyDashboard();

        LeftNavigationPanel leftNavigationPanel = new LeftNavigationPanel();
        leftNavigationPanel.clickOnNewLeadButton();

        ListOfLeads listOfLeads = new ListOfLeads();
        listOfLeads.clickOnTheLead();

        OpenLeadMainPage openLeadMainPage = new OpenLeadMainPage();
        openLeadMainPage.clickOnEditButton();

        LeadForm leadForm = new LeadForm();
        leadForm.editTitleInForm(getNewTitle());

    }


}

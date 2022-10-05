package sanity;

import exteensions.UIActions;
import exteensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;


@Listeners(utilities.Listeners.class)
public class GrafanaWeb extends CommonOps {


    @Test(description = "Test01 - Verify Header")
    @Description("This Test Login and verifies the main header")
    public void test01_verifyHeader(){
        WebFlows.login(getData("UserName"),getData("Password"));
        Verifications.verifyTextElement(grafanaMain.getHead_Dashboard(),"Dashboards");
    }


    @Test(description = "Test02 - Verify Default Users")
    @Description("This Test verifies the default users ")
    public void test02_verifyDefaultUsers(){
        UIActions.mouseHover(grafnaleftmenue.btn_server, grafnaServerAdmin.getLink_users());
        Verifications.numberOfElements(grafnaServerAdminMain.getRows(),1);
    }


    @Test(description = "Test03 - Verify Header")
    @Description("This Test verifies a new user has benn added ")
    public void test03_verifyNewUser  () throws InterruptedException {
        UIActions.mouseHover(grafnaleftmenue.btn_server, grafnaServerAdmin.getLink_users());
        WebFlows.createNewUser("shlomi","shlomi@gmail.com","shlomit","147963");
        Thread.sleep(2000);
        Verifications.numberOfElements(grafnaServerAdminMain.getRows(),2);
    }


    @Test(description = "Test04 - Verify User Deletion")
    @Description("This Test veriifies the deletion of a user ")
    public void test04_verifyUserDeletion() throws InterruptedException{
        UIActions.mouseHover(grafnaleftmenue.btn_server, grafnaServerAdmin.getLink_users());
        WebFlows.deleteLastUser();
        Thread.sleep(2000);
        Verifications.numberOfElements(grafnaServerAdminMain.getRows(),1);
    }


    @Test(description = "Test05 - Verify Progress Steps")
    @Description("This Test verifies the defualt progress steps are displayed ( soft-assertion) ")
    public void test05_verifyProgressSteps(){
       Verifications.visibilityOfElements(grafanaMain.getList_ProgressSteps());
    }


    @Test(description = "Test06 - Verify Avatar Icon")
    @Description("This Test verifies the Avatar Image (Sikuli-tool ")
    public void test06_verifyAvatarIcon(){
    Verifications.visualElement("GrafanaIcon");
    }


   @Test(description = "Test07 - Search Users", dataProvider = "data-provider-users" , dataProviderClass = utilities.ManageDDT.class)
    @Description("This Test Searched Users in a table using DDT")
    public void test07_searchUsers(String user, String shouldExist) throws InterruptedException {
        UIActions.mouseHover(grafnaleftmenue.btn_server, grafnaServerAdmin.getLink_users());
        Thread.sleep(2000);
        WebFlows.SearchAndVerifyUser(user,shouldExist);
    }

}

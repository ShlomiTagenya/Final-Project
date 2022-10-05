package workflows;

import exteensions.DBActions;
import exteensions.UIActions;
import exteensions.Verifications;
import io.qameta.allure.Step;
import utilities.CommonOps;

import java.util.List;

public class WebFlows extends CommonOps {
    @Step("Business Flow: Login")
    public static void login(String user, String pass){
        UIActions.updateText(grafanalogin.getTxt_username(), user);
        UIActions.updateText(grafanalogin.getTxt_password(), pass);
        UIActions.click(grafanalogin.getBtn_login());
        UIActions.click(grafanalogin.getBtn_skip());
    }

    @Step("Business Flow: Login To Grafana With DB Credentials")
    public static void loginDB(){
        String query ="SELECT name,password From Employees WHERE id='3'";
        List<String> cred =DBActions.getCredentials(query);
        UIActions.updateText(grafanalogin.getTxt_username(),cred.get(0));
        UIActions.updateText(grafanalogin.getTxt_password(), cred.get(1));
        UIActions.click(grafanalogin.getBtn_login());
        UIActions.click(grafanalogin.getBtn_skip());
    }


    @Step("Business Flow: Create New User")
    public static void createNewUser(String name,String email,String username, String pass){
        UIActions.click(grafnaServerAdminMain.getBtn_newUser());
        UIActions.updateText(grafnaAddNewUser.getTxt_name(), name);
        UIActions.updateText(grafnaAddNewUser.getTxt_email(), email);
        UIActions.updateText(grafnaAddNewUser.getTxt_username(), username);
        UIActions.updateText(grafnaAddNewUser.getTxt_password(), pass);
        UIActions.click(grafnaAddNewUser.getBtn_createUser());
    }
    @Step("Business Flow: delete Last User")
    public static  void deleteLastUser(){
        UIActions.click(grafnaServerAdminMain.getRows().get(grafnaServerAdminMain.getRows().size()-1));
        UIActions.click(grafnaEditUser.getBtn_deleteUser());
        UIActions.click(grafnaEditUser.getBtn_confirmDeleteUser());
    }

    @Step("Business Flow: Search And Verify User")
    public static  void SearchAndVerifyUser(String user, String shouldExist){
       UIActions.updateTextHuman(grafnaServerAdminMain.getTxt_search(),user );
       if (shouldExist.equalsIgnoreCase("exists"))
           Verifications.existanceOfElement(grafnaServerAdminMain.getRows());
       else if (shouldExist.equalsIgnoreCase("not-exist"))
           Verifications.nonexistanceOfElement(grafnaServerAdminMain.getRows());
       else
           throw new RuntimeException("Invalid Expected Output Option In Data Driven Testing, Should Be Exists or Not-Exist");
    }
}

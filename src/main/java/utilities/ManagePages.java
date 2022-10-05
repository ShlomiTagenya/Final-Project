package utilities;

import org.openqa.selenium.support.PageFactory;
import pageObjects.Grafana.AddNewUserPage;
import pageObjects.Grafana.EditUserPage;
import pageObjects.Grafana.ServerAdminMainPage;
import pageObjects.Grafana.ServerAdminMenuPage;

public class ManagePages extends Base{

      /*
    ################################################
    Method Name : initGrafana
    Method Description : this method init Grafana Web
    ################################################
     */

    public static void initGrafana(){
        grafanalogin = PageFactory.initElements(driver,pageObjects.Grafana.LoginPage.class);
        grafanaMain = PageFactory.initElements(driver,pageObjects.Grafana.MainPage.class);
        grafnaleftmenue = PageFactory.initElements(driver,pageObjects.Grafana.LeftMenuPage.class);
        grafnaServerAdmin = PageFactory.initElements(driver, ServerAdminMenuPage.class);
        grafnaServerAdminMain = PageFactory.initElements(driver, ServerAdminMainPage.class);
        grafnaAddNewUser = PageFactory.initElements(driver, AddNewUserPage.class);
        grafnaEditUser = PageFactory.initElements(driver, EditUserPage.class);
    }

       /*
    ################################################
    Method Name : initMortgage
    Method Description : this method init  Mortgage App
    ################################################
     */


    public static void initMortgage(){
        mortageMain = new pageObjects.mortgage.MainPage(mobileDriver);
    }

       /*
    ################################################
    Method Name : initToDo
    Method Description : this method init  DesktopApp ToDoList
    ################################################
     */

    public static void initToDo(){
       todoMain = PageFactory.initElements(driver,pageObjects.ToDoList.MainPage.class);
    }

       /*
    ################################################
    Method Name : initCalculator
    Method Description : this method init  Electron App Calculator
    ################################################
     */

    public static void initCalculator(){
        calcMain = PageFactory.initElements(driver,pageObjects.Calculator.MainPage.class);
    }
}

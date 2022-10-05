package pageObjects.Grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServerAdminMenuPage {

    @FindBy(xpath = "//a[@href='/admin/users']")
    private WebElement link_users;

    @FindBy(xpath = "//a[@href='/admin/orgs']")
    public WebElement link_orgs;

    @FindBy(xpath = "//a[@href='/admin/settings'")
    public WebElement link_settings;

    @FindBy(xpath = "//a[@href='/admin/stats']")
    public WebElement link_stats;


    @FindBy(xpath = "//a[@href='/admin/upgrading']")
    public WebElement link_upgrading;



    /*
    ################################################
    Method  Name : getLink_user
    Method Description: A method that returns the button link users
    Method return: link_users
   ################################################
   */

    public WebElement getLink_users(){
        return  link_users;
    }



}

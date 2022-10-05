package pageObjects.Grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditUserPage {



    @FindBy(xpath = "//button[@class='css-1scyk9l-button']//span[1]")
    private WebElement btn_deleteUser;

    @FindBy(xpath = "//div[@class='css-ief6ig']//button[1]//span[1]")
    private WebElement btn_confirmDeleteUser;




    /*
    ################################################
    Method  Name : getBtn_deleteUser
    Method Description: A method that returns the  button deleteUser
    Method return: eleteUser
   ################################################
   */
    public WebElement getBtn_deleteUser(){
        return btn_deleteUser;
    }

    /*
    ################################################
    Method  Name : getBtn_confirmDeleteUser
    Method Description: A method that returns the  button confirm Delete User
    Method return: btn_confirmDeleteUser
   ################################################
   */

    public WebElement getBtn_confirmDeleteUser(){
        return btn_confirmDeleteUser;
    }

}

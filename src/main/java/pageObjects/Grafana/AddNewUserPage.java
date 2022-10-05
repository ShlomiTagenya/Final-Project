package pageObjects.Grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewUserPage {

    @FindBy(css = "input[name='name']")
    private WebElement txt_name;

    @FindBy(css = "input[name='email']")
    private WebElement txt_email;

    @FindBy(css = "input[name='login']")
    private WebElement txt_username;

    @FindBy(css = "input[name='password']")
    private WebElement txt_password;

    @FindBy(css = "button[type='submit']")
    private WebElement btn_createUser;



    /*
    ################################################
    Method  Name : getTxt_name
    Method Description: A method that returns the name field
    Method return: txt_name
   ################################################
   */
    public WebElement getTxt_name(){
        return txt_name;
    }

    /*
    ################################################
    Method  Name : getTxt_email
    Method Description: A method that returns the email field
    Method return: txt_email
   ################################################
   */

    public WebElement getTxt_email(){
        return txt_email;
    }

    /*
    ################################################
    Method  Name : getTxt_username
    Method Description: A method that returns the userName field
    Method return: txt_username
   ################################################
   */

    public WebElement getTxt_username(){
        return txt_username;
    }
    /*
    ################################################
    Method  Name : getTxt_password
    Method Description: A method that returns the password field
    Method return: txt_password
   ################################################
   */

    public WebElement getTxt_password(){
        return txt_password;
    }

    /*
    ################################################
    Method  Name : getBtn_createUser
    Method Description: A method that returns the  button createUser
    Method return: btn_createUser
   ################################################
   */

    public WebElement getBtn_createUser(){
        return btn_createUser;
    }


}

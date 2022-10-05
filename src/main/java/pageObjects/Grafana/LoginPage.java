package pageObjects.Grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(css = "input[name='user']")
    private WebElement txt_username;

    @FindBy(css = "input[name='password']")
    private   WebElement txt_password;

    @FindBy(css = "button[class='css-6ntnx5-button']")
    private   WebElement btn_login;

    @FindBy(css = "a[class='css-1mej2rr-button']")
    private   WebElement btn_skip;


    /*
    ################################################
    Method  Name : getTxt_name
    Method Description: A method that returns the userName field
    Method return: txt_name
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
    Method  Name : getBtn_login
    Method Description: A method that returns the button login
    Method return: btn_login
   ################################################
   */

    public WebElement getBtn_login(){
        return btn_login;
    }

    /*
    ################################################
    Method  Name : getBtn_skip
    Method Description: A method that returns the button skip
    Method return: btn_skip
   ################################################
   */

    public WebElement getBtn_skip(){
        return btn_skip;
    }

}

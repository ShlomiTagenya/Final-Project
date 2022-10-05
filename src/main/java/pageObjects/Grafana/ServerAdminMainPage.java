package pageObjects.Grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ServerAdminMainPage {

    @FindBy(xpath = "//table[@class='filter-table form-inline filter-table--hover']//tbody//tr")
    private List<WebElement> rows;

    @FindBy(css = "a[class='css-u6ysb0-button']")
    private WebElement btn_newUser;

    @FindBy(css = "input[class='css-1bjepp-input-input']")
    private WebElement txt_search;


    /*
    ################################################
    Method  Name : getRows()
    Method Description: A method that returns the list of  rows
    Method return: list getRows()
   ################################################
   */



    public List<WebElement> getRows(){
        return getRows();
    }

     /*
    ################################################
    Method  Name : getBtn_newUser
    Method Description: A method that returns the button newUser
    Method return: btn_newUser
   ################################################
   */

    public WebElement getBtn_newUser(){
        return  btn_newUser;
    }

    /*
    ################################################
    Method  Name : getTxt_search
    Method Description: A method that returns the button search
    Method return: txt_search
   ################################################
   */

    public WebElement getTxt_search(){
        return  txt_search;
    }
}

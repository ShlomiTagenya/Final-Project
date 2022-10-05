package pageObjects.Grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage {

    @FindBy(xpath = "//div[@id='panel-3']//div[1]/span")
    private WebElement head_Dashboard;

    @FindBy(xpath = "//div[@class='panel-menu-container dropdown open']//ul[1]")
    private List<WebElement> list_ProgressSteps;

    /*
    ################################################
    Method  Name : getHead_Dashboard
    Method Description: A method that returns the button head Dashboard
    Method return: head_Dashboard
   ################################################
   */


    public WebElement getHead_Dashboard(){
        return head_Dashboard;
    }

      /*
    ################################################
    Method  Name : getList_ProgressSteps
    Method Description: A method that returns the list of Progress Steps
    Method return: list_ProgressSteps
   ################################################
   */

    public List<WebElement> getList_ProgressSteps(){
        return list_ProgressSteps;
    }
}

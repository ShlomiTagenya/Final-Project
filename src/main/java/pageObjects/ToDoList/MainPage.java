package pageObjects.ToDoList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage {

    @FindBy(css = "input[placeholder='Create a task']")
    private WebElement text_create;

    @FindBy(className = "view_2Ow90")
    private List<WebElement> list_tasks;

    @FindBy(className = "destroy_19w1q")
    private WebElement btn_x;

    /*
    ################################################
    Method  Name : getText_create
    Method Description: A method that returns the button create
    Method return: text_create
   ################################################
   */

    public WebElement getText_create(){
        return text_create;
    }

    /*
    ################################################
    Method  Name : getList_tasks
    Method Description: A method that returns the get List tasks
    Method return: list_tasks
   ################################################
   */

    public List<WebElement> getList_tasks(){
        return list_tasks;
    }

       /*
    ################################################
    Method  Name : getBtn_x
    Method Description: A method that returns the get element of  List tasks
    Method return: btn_x
   ################################################
   */

    public WebElement getBtn_x(){
        return btn_x;
    }



}

package pageObjects.Calculator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @FindBy(name = "Clear")
    private WebElement btn_clear;

    @FindBy(name = "One")
    private WebElement btn_one;

    @FindBy(name = "Eight")
    private WebElement btn_eight;

    @FindBy(name = "Plus")
    private WebElement btn_plus;

    @FindBy(name = "Equals")
    private WebElement btn_equals;

    @FindBy(xpath = "//*[@AutomationId='CalculatorResults']")
    private WebElement field_result;




    /*
     ################################################
     Method  Name : getBtn_clear
     Method Description: A method that returns the cleaning operation
     Method return: btn_clear
    ################################################
    */
    public WebElement getBtn_clear(){
        return btn_clear;
    }

     /*
     ################################################
     Method  Name : getBtn_one
     Method Description: A method that returns the one button
     Method return: btn_one
    ################################################
    */

    public WebElement getBtn_one(){
        return btn_one;
    }

    /*
     ################################################
     Method  Name : getBtn_eight
     Method Description: A method that returns the eight button
     Method return: btn_eight
    ################################################
    */

    public WebElement getBtn_eight(){
        return btn_eight;
    }

    /*
     ################################################
     Method  Name : getBtn_plus
     Method Description: A method that returns the plus button
     Method return: btn_plus
    ################################################
    */

    public WebElement getBtn_plus(){
        return btn_plus;
    }

    /*
     ################################################
     Method  Name : getBtn_equals
     Method Description: A method that calculates the result of the calculation
     Method return: btn_equals
    ################################################
    */

    public WebElement getBtn_equals(){
        return btn_equals;
    }

     /*
     ################################################
     Method  Name : getField_result
     Method Description: A method that checks the result of the calculation operation
     Method return: field_result
    ################################################
    */

    public WebElement getField_result(){
        return field_result;
    }



}

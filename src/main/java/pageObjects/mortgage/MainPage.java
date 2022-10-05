package pageObjects.mortgage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class MainPage {

    private AppiumDriver mobileDriver;

    public MainPage(AppiumDriver mobileDriver){
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, Duration.ofSeconds(3)),this);
    }


    @AndroidFindBy(id ="etAmount")
    private AndroidElement text_amount;

    @AndroidFindBy(id ="etTerm")
    private AndroidElement text_term;

    @AndroidFindBy(id ="etRate")
    private AndroidElement text_rate;

    @AndroidFindBy(id ="btnCalculate")
    private AndroidElement btn_calculate;

    @AndroidFindBy(id = "tvRepayment")
    private AndroidElement text_repayment;

    /*
    ################################################
    Method  Name : getText_amount
    Method Description: A method that returns the button  amount
    Method return: text_amount
   ################################################
   */


    public AndroidElement getText_amount(){
        return text_amount;
    }

     /*
    ################################################
    Method  Name : getText_term
    Method Description: A method that returns the button term
    Method return: text_term
   ################################################
   */

    public AndroidElement getText_term(){
        return text_term;
    }

      /*
    ################################################
    Method  Name : getText_rate
    Method Description: A method that returns the button rate
    Method return: text_rate
   ################################################
   */

    public AndroidElement getText_rate(){
        return text_rate;
    }

      /*
    ################################################
    Method  Name : getText_rate
    Method Description: A method that returns the button calculate
    Method return: btn_calculate
   ################################################
   */

    public AndroidElement getBtn_calculate(){
        return btn_calculate;
    }

       /*
    ################################################
    Method  Name : getTxt_repayment
    Method Description: A method that returns the result of the calculation
    Method return: text_repayment
   ################################################
   */

    public AndroidElement getTxt_repayment(){
        return text_repayment;
    }


}

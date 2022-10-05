package utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class Listeners extends CommonOps implements ITestListener {




    /*
    ################################################
    Method Name : onStart
    Method Description : this method listener to the start execution
    Method parameters :String
    Method return : String
    ################################################
     */

    public void onStart(ITestContext execution){
        System.out.println("-------Starting Execution------");
    }

      /*
    ################################################
    Method Name : onFinish
    Method Description : this method listener to the finish execution
    Method parameters :String
    Method return : String
    ################################################
     */

    public void onFinish(ITestContext execution){
        System.out.println("-------Ending Execution-------");
    }

    /*
  ################################################
  Method Name : onTestFailedButWithinSuccessPercentage
  Method Description : this method listener to the Test Failed But With in Success Percentage
  Method parameters :String
  Method return : String
  ################################################
   */
    public void onTestFailedButWithinSuccessPercentage(ITestResult test) {
        // implement this....
    }

     /*
  ################################################
  Method Name : onTestSkipped
  Method Description : this method listener to the Test skipped
  Method parameters :String
  Method return : String
  ################################################
   */

    public void onTestSkipped(ITestResult test){
        System.out.println("-------Skipping Test:"+ test.getName() +"----------");
    }

    /*
  ################################################
  Method Name : onTestStart
  Method Description : this method listener to the Test Start
  Method parameters :String
  Method return : String
  ################################################
   */

    public void onTestStart(ITestResult test){
        System.out.println("------- Start Test:"+ test.getName() +"----------");
    }

    /*
  ################################################
  Method Name : onTestSuccess
  Method Description : this method listener to the Test Success
  Method parameters :String
  Method return : String
  ################################################
   */

    public void onTestSuccess(ITestResult test) {
        System.out.println("-------Test:" + test.getName() + "Passed");

        if (!platform.equalsIgnoreCase("api")) {
            //Stop Recording
            try {
                MonteScreenRecorder.stopRecord();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            //Delete Recorder File
            File file = new File("./test-recordings/" + test.getName() + ".avi");
            if (file.delete())
                System.out.println("File Deleted Successfully");
            else
                System.out.println("Failed To  Deleted File");
        }
    }

    /*
  ################################################
  Method Name : onTestFailure
  Method Description : this method listener to the Test Failure And Stop Recording if & save screenshot
  Method parameters :String
  Method return : String
  ################################################
   */

    public void onTestFailure(ITestResult test) {
        System.out.println("-------Test:" + test.getName() + "Failed");

        if (!platform.equalsIgnoreCase("api")) {
            //Stop Recording
            try {
                MonteScreenRecorder.stopRecord();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            saveScreenShot();
        }
    }

    /*
  ################################################
  Method Name : saveScreenShot
  Method Description : this method saveScreenShot
  ################################################
   */

    @Attachment(value = "Page Screen-Shot", type = "image/png")
    public byte[] saveScreenShot(){
        if (!platform.equalsIgnoreCase("mobile"))
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        else
            return ((TakesScreenshot)mobileDriver).getScreenshotAs(OutputType.BYTES);

    }


}

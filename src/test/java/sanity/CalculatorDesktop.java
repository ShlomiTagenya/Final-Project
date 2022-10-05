package sanity;

import exteensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.DesktopFlows;

@Listeners(utilities.Listeners.class)
public class CalculatorDesktop extends CommonOps {

    @Test(description = "Test01 - Verify Addition Command")
    @Description("This Test verifies the Addition Command ")
    public void test01_verifyAdditionCommand(){
        DesktopFlows.calculateAddition();
        Verifications.verifyTextElement(calcMain.getField_result(), "Display is 9");
    }

}

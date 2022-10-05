package workflows;

import exteensions.MobileActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class MobileFlows extends CommonOps {

    @Step("Business Flow: Fill Form And Calculate Mortgage")
    public static void calculateMonrtgage(String amount , String term, String rate){
        MobileActions.updateText(mortageMain.getText_amount(), amount);
        MobileActions.updateText(mortageMain.getText_term(), term);
        MobileActions.updateText(mortageMain.getText_rate(),rate);
        MobileActions.tap(mortageMain.getBtn_calculate());
    }
}

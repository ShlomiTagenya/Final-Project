package sanity;

import exteensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;

@Listeners(utilities.Listeners.class)
public class GrafanaWebDB extends CommonOps {

    @Test(description = "Test01 - Login To Grafana With DB Credentials")
    @Description("This Test Login with DB Credentials and verifies the main header")
    public void test01_loginDBVerifyHeader(){
        WebFlows.loginDB();
        Verifications.verifyTextElement(grafanaMain.getHead_Dashboard(),"Dashboards");
    }
}

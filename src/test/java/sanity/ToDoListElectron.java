package sanity;

import exteensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.ElectronFlows;

@Listeners(utilities.Listeners.class)
public class ToDoListElectron extends CommonOps {

    @Test(description = "Test01 - add And Verify New Task")
    @Description("This Test adds a new task and verifies it in the list of tsks")
    public void test01_addAndVerifyNewTask(){
        ElectronFlows.addNewTask("Learn Java");
        Verifications.verifyNumber(ElectronFlows.getNumberOfTasks(),1);


    }

    @Test(description = "Test01 - add And Verify New Task")
    @Description("This Test adds a new task and verifies it in the list of tasks")
    public void test01_addAndVerifyNewTasks(){
        ElectronFlows.addNewTask("Learn Java");
        ElectronFlows.addNewTask("Learn Selenium");
        ElectronFlows.addNewTask("Learn Python");
        Verifications.verifyNumber(ElectronFlows.getNumberOfTasks(),3);
    }
}

package utilities;

import io.appium.java_client.AppiumDriver;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;
import pageObjects.Grafana.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Base {

    //General

    protected  static WebDriverWait wait;
    protected  static  Actions actions;
    protected static SoftAssert softAssert;
    protected static Screen screen;
    protected static String platform;

    //Web
    protected static WebDriver driver;

    //Mobile
    protected static AppiumDriver mobileDriver;
    protected static DesiredCapabilities dc = new DesiredCapabilities();

    //Rest API
    protected static RequestSpecification httpRequest;
    protected static Response response;
    protected static JSONObject params = new JSONObject();
    protected static JsonPath jp;


    //DataBse
    protected static Connection con;
    protected static Statement stmt;
    protected static ResultSet rs;



    //Page Objects - Web
    protected static  LoginPage grafanalogin;
    protected static  pageObjects.Grafana.MainPage grafanaMain;
    protected static  LeftMenuPage grafnaleftmenue;
    protected static ServerAdminMenuPage grafnaServerAdmin;
    protected static ServerAdminMainPage grafnaServerAdminMain;
    protected static AddNewUserPage grafnaAddNewUser;
    protected static EditUserPage grafnaEditUser;

    //Page Objects - Mobile
    protected static pageObjects.mortgage.MainPage mortageMain;

    //Page Objects - Electron
    protected static pageObjects.ToDoList.MainPage todoMain;

    //Page Objects - Desktop
    protected static pageObjects.Calculator.MainPage calcMain;



}

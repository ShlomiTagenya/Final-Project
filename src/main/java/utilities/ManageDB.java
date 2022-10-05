package utilities;

import java.sql.DriverManager;

public class ManageDB extends CommonOps {


    /*
    ################################################
    Method Name : openConnection
    Method Description : this method Connecting to mySQL DB
    Method parameters :String
    Method return : String
    ################################################
     */

    public static void openConnection(String dbURL, String user, String pass){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dbURL , user , pass);
            stmt = con.createStatement();
        } catch (Exception e) {
            System.out.println("Error Occurred while Connecting to DB, See Details:" + e);;
        }
    }


    public static void closeConnection(){
        try {
            con.close();
        } catch (Exception e) {
            System.out.println("Error Occurred while Closing  DB, See Details:" + e);;
        }
    }


}

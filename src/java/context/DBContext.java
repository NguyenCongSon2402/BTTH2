
package context;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBContext {
    
    /*USE BELOW METHOD FOR YOUR DATABASE CONNECTION FOR BOTH SINGLE AND MULTILPE SQL SERVER INSTANCE(s)*/
    /*DO NOT EDIT THE BELOW METHOD, YOU MUST USE ONLY THIS ONE FOR YOUR DATABASE CONNECTION*/
     public Connection getConnection(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/product_1";
            String user = "root";
            String pass = "2402";
            conn = DriverManager.getConnection(url,user,pass);
            //if(conn!=null) System.out.println("ket noi thanh cong");
        }
        catch(SQLException e){
            System.out.println(e);
        }
        catch(ClassNotFoundException e){
            System.out.println(e.toString());
        }
         
        return conn;
    }
}
 
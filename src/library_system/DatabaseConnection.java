/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_system;
    import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ziphompisane
 */


public class DatabaseConnection {
Connection conn = null;

    public static Connection dbConnect(){ 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/library","root","password");
            return conn;
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        return null;
     }
    }      
}

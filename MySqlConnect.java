/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secure;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Lewis
 */
public class MySqlConnect {
      Connection conn=null;
    public static Connection ConnectDB()
    {
        try{
            Class.forName("co.mysql.jdbe.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/technosoft","root","05121989");
            JOptionPane.showMessageDialog(null,"Connected to database");
            return conn;
        }catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e);
        return null;
        }
    }
}

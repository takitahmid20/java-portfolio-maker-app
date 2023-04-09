
package com.mycompany.db;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Database {
    public static Connection con = null;
    
    public static void loadconnection(){
        String url = "jdbc:mysql://localhost:3306/pmdb";
        String root = "root";
        String pass = "";
        
        
        try{
            con = DriverManager.getConnection(url, root, pass);
            if(con != null){
                JOptionPane.showMessageDialog(null, "Successfully connected database");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Database connection error: "+e);
        }
        
    }
   
}

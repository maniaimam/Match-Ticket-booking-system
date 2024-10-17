package Classes;

import java.sql.*;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DataBaseConnection {
    
    Connection con = null;

    public Connection EstablishConnection(){
        
        try{
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://D:\\OOP_Project\\OopProjectFinal\\build\\classes\\DataBase\\Data.accdb");
            
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
        return con;
        
    }
    
}


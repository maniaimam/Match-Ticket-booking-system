
package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Login {
    
    DataBaseConnection dbCon = new DataBaseConnection();
    Connection con = null;

    public Login() {
        con = dbCon.EstablishConnection();
    }
    
    
    Statement stmt = null;
    PreparedStatement pstmt = null;
    ResultSet rset = null;
    
    public boolean UserLogin(String email, String pwd){
        
        boolean allowLogin;
        String loginStr = "Select * from adminLogin where Email='"+email+"' and Password='"+pwd+"'";
       
        try{
            
            pstmt = con.prepareStatement(loginStr);
            rset = pstmt.executeQuery();
            
            if(rset.next()){ allowLogin = true; }
            else { allowLogin = false; }
            
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, ex);
            allowLogin = false;
            
        }
        
        return allowLogin;
        
    }
    
    public boolean AdminLogin(String email, String pwd){
        
        boolean allowLogin;
        String loginStr = "Select * from adminLogin where Email='"+email+"' and Password='"+pwd+"'";
        
        try{
            
            pstmt = con.prepareStatement(loginStr);
            rset = pstmt.executeQuery();
            
            if(rset.next()){ allowLogin = true; }
            else { allowLogin = false; }
            
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, ex);
            allowLogin = false;
            
        }
        
        return allowLogin;
        
    }
    
    public String fetchUsername(){
        
        String username = null;
        
        return username;
        
    }
    
}


package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class SignUp {
    
    DataBaseConnection dbCon = new DataBaseConnection();
    Connection con = null;

    public SignUp() {
        con = dbCon.EstablishConnection();
    }
    
    
    Statement stmt = null;
    PreparedStatement pstmt = null;
    ResultSet rset = null;

    public void addUser(String email, String username, String password) throws SQLException{
        
        String sql = "insert into userLogin(Email, Username, Password)values('"+email+"','"+username+"','"+password+"')";
        
        try{
            
            stmt = con.createStatement();
            int res = stmt.executeUpdate(sql);
            
            if(res > 0){ JOptionPane.showMessageDialog(null, "Signed Up");}
            else { JOptionPane.showMessageDialog(null, "An Error Occured");}
    
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
}

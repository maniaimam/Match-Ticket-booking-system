package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class EditMatches {
    
    DataBaseConnection dbCon = new DataBaseConnection();
    Connection con = null;

    public EditMatches() {
        con = dbCon.EstablishConnection();
    }
    
    Statement stmt = null;
    PreparedStatement pstmt = null;
    ResultSet rset = null;
    
    public void addMatch(String match, String city, String date, String time, String stadium, int price, String status){
        
        String sql = "insert into matches(Match, City, Date, Time, Stadium, Seats, Status)values('"+match+"','"+city+"','"+date+"','"+time+"','"+stadium+"','"+price+"','"+status+"')";
        
        try{
            
            stmt = con.createStatement();
            int res = stmt.executeUpdate(sql);
            
            if(res > 0){ JOptionPane.showMessageDialog(null, "Match Added");}
            else { JOptionPane.showMessageDialog(null, "An Error Occured");}
    
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
    public void updateMatch(){
        
        
        
    }
    
    public void deleteMatch(){
        
        
        
    }
    
}

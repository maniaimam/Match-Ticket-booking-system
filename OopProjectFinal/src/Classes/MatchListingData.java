
package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
//import net.proteanit.sql.DbUtils;

public class MatchListingData {
    
    DataBaseConnection dbCon = new DataBaseConnection();
    Connection con;

    public MatchListingData() {
        con = dbCon.EstablishConnection();
    }
    
    Statement stmt;
    PreparedStatement pstmt = null;
    ResultSet rset = null;
    
    public void loadMatchList(JTable table){
        
        try{
            
            stmt = con.createStatement();
            String sql = "Select * From matches";
            rset = stmt.executeQuery(sql);
            
            table.setModel(DbUtils.resultSetToTableModel(rset));
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
}

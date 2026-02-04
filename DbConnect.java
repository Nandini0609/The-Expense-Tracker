package db;
import java.sql.*;
import javax.swing.JOptionPane;

public class DbConnect {
    public static Connection c;
    public static Statement st;
    
    static{
        try{
            String url = "jdbc:mysql://localhost:3306/spendingdb?useSSL=false&allowPublicKeyRetrieval=true";
            String user = "root";
            String password = "Muskan@123";

            c = DriverManager.getConnection(url, user, password);
            st = c.createStatement();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}

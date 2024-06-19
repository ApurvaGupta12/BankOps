package bank.mgt.system;
import java.sql.*;
public class Connection1 {
    Connection conn;
    Statement statement;
    public Connection1()
    {
        try
        {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Agupta@12345");
            statement=conn.createStatement();
        }
        catch(Exception E)
        {
            E.printStackTrace();
        }
    }

}

package app;
import java.sql.*;
import java.util.Properties;

public abstract class DBConn {
    protected Connection conn;
    public DBConn () {
    }
    public void connect() {
    	try {
            Class.forName("com.mysql.cj.jdbc.Driver");
	    // Class.forName("com.mysql.cj.jdbc.Driver"); when you are using MySQL 8.0.     
	    // Properties for user and password.
            Properties p = new Properties();
            p.put("user", "root");
            p.put("password", "Passord123");           
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/filmer",p);
        } catch (Exception e)
    	{
            throw new RuntimeException("Unable to connect", e);
    	}
    }
    
}
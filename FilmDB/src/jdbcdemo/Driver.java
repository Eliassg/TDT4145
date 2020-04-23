package jdbcdemo;

import java.sql.*;

public class Driver{


    public static void main(String[] args){
        try {
            // 1. Get a connection to database
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/filmer","root","Passord123");

            // 2. Create a statement
            Statement myStmt = myConn.createStatement();
            // 3. Execute
            ResultSet myRs = myStmt.executeQuery("select * from film");
            // 4. Process the result set
            while (myRs.next()){
                System.out.println(myRs.getString("Tittel") + ", " + myRs.getString("Produksjonsår"));
            }
        }
        catch (Exception e) {
            //TODO: handle exception
    
        }

    }
}
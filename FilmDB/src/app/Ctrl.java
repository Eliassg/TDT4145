package app;

import java.util.List;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;



public class Ctrl extends DBConn {

    public List<String> getRolesByName(String name) throws SQLException{
        PreparedStatement myStmt = conn.prepareStatement(
            "SELECT Rolle " + 
            "FROM Person NATURAL JOIN Skuespiller " +
            "WHERE Person.Navn = ?");
        myStmt.setString(1,name);
        ResultSet myRs = myStmt.executeQuery();
        List<String> result = new ArrayList<>();
        while (myRs.next()) {
            result.add(myRs.getString("Rolle"));
            }
        return result;
    
    }

    public List<String> getTitleFromName(String name) throws SQLException {
        PreparedStatement myStmt = conn.prepareStatement(
            "SELECT Tittel " +
            "FROM Person NATURAL JOIN Skuespiller NATURAL JOIN Underholdning " +
            "WHERE Person.NAVN = ?");
            myStmt.setString(1,name);
            ResultSet myRs = myStmt.executeQuery();
            List<String> result = new ArrayList<>();
            while (myRs.next()) {
                result.add(myRs.getString("Tittel"));
            }
            return result;

    }

    public List<String> getMovieCompanyFromGenre(String genre) throws SQLException {
        PreparedStatement myStmt = conn.prepareStatement(
            "SELECT Selskap.URL, COUNT(*) AS totalCount " +
            "FROM Selskap NATURAL JOIN SelskapTilFilm NATURAL JOIN Underholdning NATURAL JOIN SjangerIFilm join Sjanger on SjangerIFilm.SjangerID = Sjanger.SjangerID " +
            "WHERE Sjanger.Navn = ? " + 
            "GROUP BY Selskap.URL " + 
            "ORDER BY totalCount DESC " +
            "LIMIT 1");
            myStmt.setString(1, genre);
            ResultSet myRs = myStmt.executeQuery();
            List<String> result = new ArrayList<>();
            while (myRs.next()) {
                result.add(myRs.getString("Selskap.URL"));

            }
            return result;
        

    }
}
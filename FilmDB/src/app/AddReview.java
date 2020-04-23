package app;
import java.sql.*;


public class AddReview extends DBConn {

    private PreparedStatement regStatement;

    public void startRegg() {
        try {
            regStatement = conn.prepareStatement(
                "INSERT INTO AnmeldelseAvFilm (Beskrivelse, Rating, Epost, FilmID) VALUES ( (?), (?), (?), (?))");

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

    public void addReview(String Beskrivelse, int Rating, String Epost, int FilmID) {
        try {
            regStatement.setString(1, Beskrivelse);
            regStatement.setInt(2, Rating);
            regStatement.setString(3, Epost);
            regStatement.setInt(4, FilmID);
            regStatement.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
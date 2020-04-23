package app;
import java.sql.*;


public class AddMovie extends DBConn {
    private PreparedStatement regStatement;

    public void startReg() {
        try {
            regStatement = conn.prepareStatement(
                "INSERT INTO Underholdning (FilmID, Plattform, Tittel, Lengde, Utgivelseaar, Lanseringsdato, Beskrivelse, VideoEllerIkke) VALUES ( (?), (?), (?), (?), (?), (?), (?), (?))");

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    public void addMovies(int FilmID, String Plattform,String Tittel, int Lengde, int Utgivelseaar, int Lanseringsdato, String Beskrivelse, String VideoEllerIkke) {
        try {
            regStatement.setInt(1, FilmID);
            regStatement.setString(2, Plattform);
            regStatement.setString(3, Tittel);
            regStatement.setInt(4, Lengde);
            regStatement.setInt(5, Utgivelseaar);
            regStatement.setInt(6,Lanseringsdato);
            regStatement.setString(7, Beskrivelse);
            regStatement.setString(8, VideoEllerIkke);
            regStatement.executeUpdate();
        } catch (Exception e ) {
            System.out.println(e.getMessage());
        }
    }

}
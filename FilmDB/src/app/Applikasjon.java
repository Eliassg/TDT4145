package app;

import java.sql.SQLException;

import java.util.Scanner;


public class Applikasjon extends DBConn {
    
    public static void main(String[] args) {
        Ctrl yobbb = new Ctrl();
        AddMovie addmovie = new AddMovie();
        AddReview addreview = new AddReview();
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Press 1 for aa finne navnet paa alle rollene en gitt skuespiller har");
        System.out.println("Press 2 for aa inne hvilke filmer som en gitt skuespiller opptrer i");
        System.out.println("Press 3 for aa finne hvilke filmselskap som lager flest filmer inne hver sjanger");
        System.out.println("Press 4 for aa sette inn en ny film");
        System.out.println("Press 5 for aa sette inn en ny anmeldelse");

        int valg = myObj.nextInt();


        if (valg == 1) {
            System.out.println("Hva er navnet til skuespilleren?");
            myObj.nextLine();
            String name = myObj.nextLine();
            yobbb.connect();
            myObj.close();
            try { 
                System.out.println(yobbb.getRolesByName(name));
            } catch (SQLException e ) {
                throw new RuntimeException();
            }

        
        } else if (valg == 2) {
            System.out.println("Hva er navnet til skuespilleren?");
            myObj.nextLine();
            String name = myObj.nextLine();
            yobbb.connect();
            myObj.close();
            try {
                System.out.println(yobbb.getTitleFromName(name));
            } catch (SQLException e) {
                throw new RuntimeException();
            }

        } else if (valg == 3) {
            System.out.println("Hva er sjangeren");
            myObj.nextLine();
            String name = myObj.nextLine();
            yobbb.connect();
            myObj.close();
            try {
                System.out.println(yobbb.getMovieCompanyFromGenre(name));
            } catch (SQLException e) {
                throw new RuntimeException();
            }
        } else if (valg == 4) {
            try {
                System.out.println("Hva er FilmID, plattform, tittel, lengde, utgivelseaar, datoen, beskrivelse, Video eller ikke?");
                 int filmID = myObj.nextInt();
                 myObj.nextLine();
                 String plattform = myObj.nextLine();
                 String tittel = myObj.nextLine();
                 int lengde = myObj.nextInt();
                 int utgivelseaar = myObj.nextInt();
                 int lanseringsdato = myObj.nextInt();
                 myObj.nextLine();
                 String beskrivelse = myObj.nextLine();
                 String vidOrNot = myObj.nextLine();
                 addmovie.connect();
                 myObj.close();
                 try {
                     addmovie.startReg();
                     addmovie.addMovies(filmID, plattform, tittel, lengde, utgivelseaar, lanseringsdato, beskrivelse, vidOrNot);
                     System.out.println("Filmen har blitt lagt til.");
                    } catch (Exception e) {
                        throw new RuntimeException();
                    }
                }

            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (valg == 5) {
            System.out.println("Hva er filmID til filmen?");
            int filmID = myObj.nextInt();
            System.out.println("Gi filmen en rating (1-10):");
            int rating = myObj.nextInt();
            myObj.nextLine();
            System.out.println("Skriv inn din anmeldelse:");
            String beskrivelse = myObj.nextLine();
            System.out.println("Hva er eposten din?");
            String epost = myObj.nextLine();
            addreview.connect();
            myObj.close();
            try {
                addreview.startRegg();
                addreview.addReview(beskrivelse, rating, epost, filmID);
                System.out.println("Filmen har blitt lagt til.");
            } catch (Exception e) {
                throw new RuntimeException();
            }
        }
    }
}
            
        


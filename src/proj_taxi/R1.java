
package proj_taxi;

import dbconnect.dbconnexion;
import java.sql.*;



public class R1 {
     public void demo(){

        Connection dbConnect = dbconnexion.getConnection();
        if (dbConnect == null) {
            System.exit(1);
        }
        System.out.println("connexion établie");
        
        String query = "select * from API_CLIENTTAXI";
        try (Statement stmt = dbConnect.createStatement();
                ResultSet rs = stmt.executeQuery(query);) {

            while (rs.next()) {
                String nom = rs.getString("NOM");
                String prenom = rs.getString("PRENOM");
                String n = "" + rs.getInt("IDCLIENT");
                System.out.println(nom + " " + prenom + " " + n);
            }
        } catch (SQLException e) {
            System.out.println("erreur SQL " + e);
        }
        
        dbconnexion.closeConnection();
    }

    public static void main(String[] args) {
        R1 pgm = new R1();
        pgm.demo();
    }
}

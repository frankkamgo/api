
package proj_taxi;

import dbconnect.dbconnexion;
import java.sql.*;
import java.sql.*;
import java.util.*;

public class Recherche {
     public void join() {

        Scanner sc = new Scanner(System.in);
        Connection dbConnect = dbconnexion.getConnection();
        if (dbConnect == null) {
            System.exit(1);
        }
        System.out.println("connexion établie");
        
         String query = "select * from api_clienttaxi where idclient=? ";
        try (PreparedStatement pstm = dbConnect.prepareStatement(query);
             ResultSet rs = pstm.executeQuery(query);) {
                
            while (rs.next()) {
                String nom = rs.getString("NOM");
                String prenom = rs.getString("PRENOM");
                String tel = "" + rs.getString("telephone");
                System.out.println(nom + " " + prenom + " " + tel);
            }
        } catch (SQLException e) {
            System.out.println("erreur SQL " + e);
        }
        
        dbconnexion.closeConnection();
    }

    public static void main(String[] args) {
        R1 pgm = new R1();
        pgm.join();
    }
     
}

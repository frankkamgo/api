
package proj_taxi;

import dbconnect.dbconnexion;
import java.sql.*;
import java.sql.*;
import java.util.*;
public class Idresultant {
      public void join() {

        Scanner sc = new Scanner(System.in);
        Connection dbConnect = dbconnexion.getConnection();
        if (dbConnect == null) {
            System.exit(1);
        }
        System.out.println("connexion établie");

        String query1 = "INSERT INTO API_CLIENTTAXI(nom,prenom,tel,IDADR)"
                + "VALUES(?,?,?,?)";
        String query2 = "select idclient from api_clienttaxi where nom=? and prenom=? and tel=?";
        try (PreparedStatement pstm1 = dbConnect.prepareStatement(query1);
                PreparedStatement pstm2 = dbConnect.prepareStatement(query2)) {

            int numcli = 0;
            System.out.println("Nouveau client ");

            System.out.print("Nom :");
            String nom = sc.nextLine();
            System.out.print("Prenom :");
            String prenom = sc.nextLine();
            System.out.print("Telephone :");
             String tel = sc.nextLine();
            System.out.print("adress :");
             int idadr=sc.nextInt();
            sc.skip("\n");// pour vider le buffer
            
            
            pstm1.setString(1, nom);
            pstm1.setString(2, prenom);
           
            pstm1.setString(3, tel);
             pstm1.setInt(4, idadr);
            int nl = pstm1.executeUpdate();// pour executer
            System.out.println(nl + "ligne insérée");
            pstm2.setString(1, nom);
            pstm2.setString(2, prenom);
            pstm2.setString(3, tel);
            try (ResultSet rs = pstm2.executeQuery()) {
                
                if (rs.next()) {
                    int nc = rs.getInt(1); // pour afficher un ellement dans le tableau a la position 1
                    System.out.println("numero de client =" + nc);

                } else {
                    System.out.println("erreur lors de l'insertion ,numero de client introuvable");
                }

            }
        } catch (SQLException e) {
            System.out.println("erreur SQL =" + e);
        }
         dbconnexion.closeConnection();
    }

    public static void main(String[] args) {
        Idresultant pgm = new  Idresultant();
        pgm.join();
    }
}

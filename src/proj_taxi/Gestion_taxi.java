
package proj_taxi;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import taxi_DAO.*;
import taxi_DAO.DAO;
//import taxi.metier.*;
import dbconnect.dbconnexion;
/**
 *
 * @Frank Kamgo Tchoula
 */
public class Gestion_taxi {
    Scanner sc = new Scanner(System.in);
    /**
    Client_taxi clActuel = null;
    DAO<Client_taxi> client_taxi_DAO = null;
*/
    public Gestion_taxi() {
    }
    
     public void gestion() {
        Connection dbConnect = dbconnexion.getConnection();
        if (dbConnect == null) {
            System.out.println("connection invalide");
            System.exit(1);
        }

        System.out.println("connexion établie");

        //client_taxi_DAO = new Client_taxi_DAO();
        //client_taxi_DAO.setConnection(dbConnect);
        Gestion_lient_taxi gclient=new Gestion_lient_taxi();
       Gestion_vehicule_taxi gvehicule=new  Gestion_vehicule_taxi();
    // public void menu(){
        int ch = 0;
        do {
            System.out.println("\t\t\t\tACCUEIL");
            System.out.println("");
            System.out.println("1.GESTION_CLIENTS \n2.GESTION_TAXI\n3.fin");
            System.out.print("choix de l'entité a gérer :");
            ch = sc.nextInt();
            sc.skip("\n");
            switch (ch) {
                case 1:
                    gclient.gesclient();
                    break;
                case 2:
                    gvehicule.gesvehitaxi();
                    break;
               
                case 3:
                    System.out.println("FIN DE PROGRAMME");
                    break;
                default:
                    System.out.println("choix incorrect");
            }

        } while (ch != 3);
        dbconnexion.closeConnection();
    
    }
        
       /* public void derncom() {
        try {
            LocalDate dt = ((location_DAO) client_taxi_DAO).dateloc(clActuel);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E d MMMM yyyy", Locale.FRENCH);
            String aff = dt.format(dtf);
            System.out.println("date de la denière location " + clActuel + " = " + aff);
        } catch (SQLException e) {
            System.out.println("erreur " + e.getMessage());
        }
    }*/
        
         public static void main(String[] args) {
        Gestion_taxi gestiontaxi = new Gestion_taxi();
        gestiontaxi.gestion();

    }

}


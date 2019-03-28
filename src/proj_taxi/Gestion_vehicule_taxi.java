
package proj_taxi;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import taxi_DAO.Vehicule_taxi_DAO;
import taxi_DAO.DAO;
import taxi.metier.Vehicule_taxi;
import dbconnect.dbconnexion;
import taxi.metier.Client_taxi;
import taxi_DAO.Client_taxi_DAO;
/**
 *
 * @Frank Kamgo Tchoula
 */
public class Gestion_vehicule_taxi {
     Scanner sc = new Scanner(System.in);
    Vehicule_taxi vtActuel = null;
    DAO<Vehicule_taxi> Vehicule_taxi_DAO = null;

    public Gestion_vehicule_taxi() {
    }
    
     public void gesvehitaxi() {
        Connection dbConnect = dbconnexion.getConnection();
        if (dbConnect == null) {
            System.out.println("connection invalide");
            System.exit(1);
        }
  System.out.println("connexion établie");

        Vehicule_taxi_DAO = new Vehicule_taxi_DAO();
        Vehicule_taxi_DAO.setConnection(dbConnect);
        
         int ch = 0;
        do {
            System.out.println("1.nouveau_taxi \n2.recherche\n3.modification\n4.supprer_taxi\n5.recherche_taxi_sur_immatriculation\n6.recherche_taxi_sur_description\n7.fin");
            System.out.print("choix :");
            ch = sc.nextInt();
            sc.skip("\n");
            switch (ch) {
                case 1:
                    nouveau_taxi();
                    break;
                case 2:
                    recherche();
                    break;
                case 3:
                    modif();
                    break;
                case 4:
                    sup();
                    break;
                case 5:
                    
                    break;
                case 6:
                   rechdescription();
                    break;
                case 7:
                    System.out.println("FIN DE PROGRAMME");
                    break;
                default:
                    System.out.println("choix incorrect");
            }

        } while (ch != 7);
        dbconnexion.closeConnection();
    }
     
      public void nouveau_taxi() {

        System.out.print("immatriculation :");
        String immatriculation = sc.nextLine();
        System.out.print("carburant :");
        int carburant = sc.nextInt();
        System.out.print("prixkm :");
        int prixkm = sc.nextInt();
           System.out.println("description");
        String description=sc.nextLine();
        vtActuel = new Vehicule_taxi(0, immatriculation, carburant,prixkm,description);
        try {
            vtActuel = Vehicule_taxi_DAO.create(vtActuel);
            System.out.println("taxi actuel : " + vtActuel);
        } catch (SQLException e) {
            System.out.println("erreur :" + e);
        }

    }
      
       public void recherche() {
        try {
            System.out.println("numéro recherché :");
            int nc = sc.nextInt();
            vtActuel = Vehicule_taxi_DAO.read(nc);
            System.out.println("client actuel : " + vtActuel);

        } catch (SQLException e) {
            System.out.println("erreur " + e.getMessage());
        }
    }
       
        public void modif() {
        try {
            System.out.println("modification de l'immatriculation");
            System.out.println("entre immatricule :");
            String immatriculation = sc.next();
            vtActuel.setImmatriculation(immatriculation);
            Vehicule_taxi_DAO.update(vtActuel);
        } catch (SQLException e) {
            System.out.println("erreur " + e.getMessage());
        }

    }
        
         public void sup() {
        try {
            Vehicule_taxi_DAO.delete(vtActuel);
        } catch (SQLException e) {
            System.out.println("erreur " + e.getMessage());
        }
    }
       public void rechdescription() {
        System.out.println("entre description : ");
        String description = sc.nextLine();
        try {
            List<Vehicule_taxi> vta = ((Vehicule_taxi_DAO) Vehicule_taxi_DAO).rechdescption(description);
            for (Vehicule_taxi vt : vta) {
                System.out.println(vt);
            }
        } catch (SQLException e) {
            System.out.println("erreur " + e.getMessage());
        }
    }
       
}


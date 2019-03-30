
package proj_taxi;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import taxi_DAO.Client_taxi_DAO;
import taxi_DAO.DAO;
import taxi.metier.Client_taxi;
import dbconnect.dbconnexion;
/**
 *
 * @Frank Kamgo Tchoula
 */
public class Gestion_lient_taxi {
     Scanner sc = new Scanner(System.in);
    Client_taxi clActuel = null;
    DAO<Client_taxi> client_taxi_DAO = null;

    public Gestion_lient_taxi() {
    }
    
     public void gesclient() {
        Connection dbConnect = dbconnexion.getConnection();
        if (dbConnect == null) {
            System.out.println("connection invalide");
            System.exit(1);
        }

        System.out.println("connexion établie");

        client_taxi_DAO = new Client_taxi_DAO();
        client_taxi_DAO.setConnection(dbConnect);

        int ch = 0;
        do {
            System.out.println("1.nouveau \n2.recherche\n3.modification\n4.suppression\n5.recherche sur nom\n6.dernière commande\n7.fin");
            System.out.print("choix :");
            ch = sc.nextInt();
            sc.skip("\n");
            switch (ch) {
                case 1:
                    nouveau();
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
                    rechnom();
                    break;
                case 6:
                   // derncom();
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
     
       public void nouveau() {

        System.out.print("nom :");
        String nom = sc.nextLine();
        System.out.print("prénom :");
        String prenom = sc.nextLine();
        System.out.print("tel :");
        String tel = sc.next();
           System.out.println("id adresse");
        int idadr=sc.nextInt();
        clActuel = new Client_taxi(0, nom, prenom,tel,idadr);
        try {
            clActuel = client_taxi_DAO.create(clActuel);
            System.out.println("client actuel : " + clActuel);
        } catch (SQLException e) {
            System.out.println("erreur :" + e);
        }

    }
       
       
    public void recherche() {
        try {
            System.out.println("numéro recherché :");
            int nc = sc.nextInt();
            clActuel = client_taxi_DAO.read(nc);
            System.out.println("client actuel : " + clActuel);

        } catch (SQLException e) {
            System.out.println("erreur " + e.getMessage());
        }
    }

     public void modif() {
        try {
            System.out.println("modification du numero de telephone du client");
            System.out.println("entre tel :");
            String tel = sc.next();
            clActuel.setTel(tel);
            client_taxi_DAO.update(clActuel);
        } catch (SQLException e) {
            System.out.println("erreur " + e.getMessage());
        }

    }
     
      public void sup() {
        try {
            client_taxi_DAO.delete(clActuel);
        } catch (SQLException e) {
            System.out.println("erreur " + e.getMessage());
        }
    }
      
        public void rechnom() {
        System.out.println("nom recherché : ");
        String nom = sc.nextLine();
        try {
            List<Client_taxi> alc = ((Client_taxi_DAO) client_taxi_DAO).rechNom(nom);
            for (Client_taxi cl : alc) {
                System.out.println(cl);
            }
        } catch (SQLException e) {
            System.out.println("erreur " + e.getMessage());
        }
    }
      /*  
        public void derncom() {
        try {
            LocalDate dt = ((location_DAO) client_taxi_DAO).dateloc(clActuel);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E d MMMM yyyy", Locale.FRENCH);
            String aff = dt.format(dtf);
            System.out.println("date de la denière location " + clActuel + " = " + aff);
        } catch (SQLException e) {
            System.out.println("erreur " + e.getMessage());
        }
    }
      */  
    

}


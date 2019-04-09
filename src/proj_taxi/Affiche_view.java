
package proj_taxi;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import taxi_DAO.View_address_DAO;
import taxi_DAO.DAO;
import taxi.metier.View_address;
import dbconnect.dbconnexion;
import taxi_DAO.Client_taxi_DAO;
/**
 *
 * @Frank Kamgo Tchoula
 */
public class Affiche_view {
      Scanner sc = new Scanner(System.in);
    View_address clActuel = null;
    DAO< View_address> View_address_DAO = null;

    public Affiche_view() {
    }
    
     public void gesvue() throws SQLException {
        Connection dbConnect = dbconnexion.getConnection();
        if (dbConnect == null) {
            System.out.println("connection invalide");
            System.exit(1);
        }
        
         System.out.println("connexion établie");

        View_address_DAO = new View_address_DAO();
        View_address_DAO.setConnection(dbConnect);
        
        affiche();
     }
     
    public void affiche() {
        try {
            int dt = ((View_address_DAO) View_address_DAO).read(clActuel);
           
            System.out.println("les infons  " + clActuel );
        } catch (SQLException e) {
            System.out.println("erreur " + e.getMessage());
        }
    }
     
}

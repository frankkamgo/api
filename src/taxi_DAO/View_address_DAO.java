
package taxi_DAO;
/**
 * classe de mappage poo-relationnel view_address
 *
 * @author frank kamgo
 * @version 1.0
 * @see view_address
 */
import java.sql.*;
import java.time.LocalDate;
import java.util.*;
import taxi.metier.Client_taxi;
import taxi.metier.View_address;
public class View_address_DAO extends DAO<View_address> {
    
   
    /**
     * récupération des données d'un client_taxi sur base de son identifiant
     *
     * @throws SQLException code inconnu
     * @param idclient identifiant du client_taxi
     * @return client_taxi trouvé
     */
    @Override
    public View_address read(int idloc) throws SQLException {

        String req = "select * from view_adresses where idloc = ?";

        try (PreparedStatement pstm = dbConnect.prepareStatement(req)) {

            pstm.setInt(1, idloc);
            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    String nom = rs.getString("NOM");
                    String prenom = rs.getString("PRENOM");
                    String tel = rs.getString("TEL");
                    int idadr = rs.getInt("idadr");
                    return new Client_taxi(idclient, nom, prenom,tel,idadr);

                } else {
                    throw new SQLException("Code inconnu");
                }

            }
        }
    
}

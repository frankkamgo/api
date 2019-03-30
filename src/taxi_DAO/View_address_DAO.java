
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
import taxi.metier.View_address;
public class View_address_DAO extends DAO<View_address> {
    
   
    /**
     * récupération des données dans la vue view_qdress sur base de son identifiant de la lication
     *
     * @throws SQLException code inconnu
     * @param idloc identifiant de la location
     * @return information de la vue 
     */
    @Override
    public View_address read(int idloc) throws SQLException {

        String req = "select * from view_adresses where idloc = ?";

        try (PreparedStatement pstm = dbConnect.prepareStatement(req)) {

            pstm.setInt(1, idloc);
            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    
                
                   
                    String dateloc = rs.getString("dateloc");
                    int kmtotal = rs.getInt("kmtota");
                    int acompte = rs.getInt("acompte");
                    int total = rs.getInt("total");
                    int idclient = rs.getInt("idclient");
                    int idtaxi = rs.getInt("idtaxi");
                    int cp = rs.getInt("cp");
                    String localite = rs.getString("localite");
                    String rue =rs.getString("rue");
                    int num = rs.getInt("num");
                    int cpretour = rs.getInt("cpretour");
                    String locretour = rs.getString("locretour");
                    String rueretour = rs.getString("rueretour");
                    
                    int numretour = rs.getInt("num");
                    return new View_address(idloc);
                
                } else {
                    throw new SQLException("Code inconnu");
                }

            }
        }
    
}
     @Override
    public View_address create(View_address obj) throws SQLException {
        return ();
    }
    
     @Override
    public View_address update(View_address obj) throws SQLException {
        
    }
    
     @Override
    public void delete(View_address obj) throws SQLException {
        
    }
     public LocalDate dern_com(View_address obj) throws SQLException{
         
     }
}

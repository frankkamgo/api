
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

    private int diloc;
    
   
    /**
     * récupération des données dans la vue view_qdress sur base de son identifiant de la lication
     *
     * @throws SQLException code inconnu
     * @param idloc identifiant de la location
     * @return information de la vue 
     */
    @Override
        

    public View_address read(int idloc) throws SQLException {

        
    
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
      public int read(View_address obj) throws SQLException{
         String req = "select* from view_adresses where idloc = ?";
         try(PreparedStatement pstm = dbConnect.prepareStatement(req)){
             pstm.setInt(1,obj.getIdloc());
             try(ResultSet rs = pstm.executeQuery()){
                 if(rs.next()){
                     int dt = rs.getInt(diloc);
                     return dt;
                 }
                 else throw new SQLException("aucune donnée");
             }
         }
    }
}

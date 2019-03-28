
package taxi_DAO;
/**
 * classe de mappage poo-relationnel location_taxi
 *
 * @author frank kamgo
 * @version 1.0
 * @see Location_taxi
 */
import java.sql.*;
import java.time.LocalDate;
import java.util.*;
import taxi.metier.Location_taxi;
public class Location_taxi_DAO extends DAO<Location_taxi>{
    
     String req1 = "insert into api_location_taxi(dateloc,kmtotal,acompte,total,idclient,idtaxi,idadrdebut,idadrfin) values(?,?,?,?,?,?,?,?)";
        String req2 = "select idclient from api_location_taxi where dateloc=? and acompte=? and total=?";
        try (PreparedStatement pstm1 = dbConnect.prepareStatement(req1);
                PreparedStatement pstm2 = dbConnect.prepareStatement(req2)) {
           
    }
    
}

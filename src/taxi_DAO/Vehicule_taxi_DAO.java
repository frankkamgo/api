
package taxi_DAO;
/**
 * classe de mappage poo-relationnel Vehicule_taxi
 *
 * @author frank kamgo
 * @version 1.0
 * @see Vehicule_taxi
 */

import java.sql.*;
import java.time.LocalDate;
import java.util.*;
import taxi.metier.Client_taxi;
import taxi.metier.Vehicule_taxi;

public class Vehicule_taxi_DAO extends DAO<Vehicule_taxi> {
     /**
     * création d'un vehicule_taxi sur base des valeurs de son objet métier
     *
     * @throws SQLException erreur de création
     * @param obj client_taxi à créer
     * @return vehicule_taxi créé
     */
     @Override
    public Vehicule_taxi create(Vehicule_taxi obj) throws SQLException {

        String req1 = "insert into api_taxi(immatriculation,carburant,prixkm,description) values(?,?,?,?)";
        String req2 = "select idtaxi from api_taxi where immatriculation=? and carburant=? and prixkm=?";
        try (PreparedStatement pstm1 = dbConnect.prepareStatement(req1);
                PreparedStatement pstm2 = dbConnect.prepareStatement(req2)) {
            pstm1.setString(1, obj.getImmatriculation());
            pstm1.setInt(2, obj.getCarburant());
            pstm1.setInt(3, obj.getPrixkm());
            pstm1.setString(4, obj.getDescription());
            int n = pstm1.executeUpdate();
            if (n == 0) {
                throw new SQLException("erreur de creation du taxi, aucune ligne créée");
                
            }
             pstm2.setString(1, obj.getImmatriculation());
            pstm2.setInt(2, obj.getCarburant());
            pstm2.setInt(3, obj.getPrixkm());
             
            try (ResultSet rs = pstm2.executeQuery()) {
                if (rs.next()) {
                    int idtaxi = rs.getInt(1);
                    obj.setIdtaxi(idtaxi);
                    return read(idtaxi);
                } else {
                    throw new SQLException("erreur de création client, record introuvable");
                }
            }
        }
        
        
    }
     /**
     * récupération des données d'un vehicule_taxi sur base de son identifiant
     *
     * @throws SQLException code inconnu
     * @param idtaxi identifiant du client_taxi
     * @return client_taxi trouvé
     */
    
       @Override
    public Vehicule_taxi read(int idtaxi) throws SQLException {

        String req = "select * from api_taxi where idtaxi = ?";

        try (PreparedStatement pstm = dbConnect.prepareStatement(req)) {

            pstm.setInt(1, idtaxi);
            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    String immatriculation = rs.getString("immatriculation");
                    int carburant = rs.getInt("carburant");
                    int prixkm = rs.getInt("prixkm");
                    String description = rs.getString("description");
                    return new Vehicule_taxi(idtaxi,immatriculation,carburant,prixkm,description);

                } else {
                    throw new SQLException("Code inconnu");
                }

            }
        }
    }
     /**
     * mise à jour des données du taxi sur base de son identifiant
     *
     * @return Client_taxi
     * @param obj Vehicule_taxi à mettre à jour
     * @throws SQLException erreur de mise à jour
     */
     @Override
    public Vehicule_taxi update(Vehicule_taxi obj) throws SQLException {
        String req = "update api_taxi set immatricule=?,carburant=?,prixkm=?,description=? where idtaxi= ?";
        try (PreparedStatement pstm = dbConnect.prepareStatement(req)) {

            pstm.setInt(5, obj.getIdtaxi());
            pstm.setString(1, obj.getImmatriculation());
            pstm.setInt(2, obj.getCarburant());
            pstm.setInt(3, obj.getPrixkm());
            pstm.setString(4,obj.getDescription());
            int n = pstm.executeUpdate();
            if (n == 0) {
                throw new SQLException("aucune ligne vehicule_taxi mise à jour");
            }
            return read(obj.getIdtaxi());
        }
    }
     /**
     * effacement du Vehicule_taxi sur base de son identifiant
     *
     * @throws SQLException erreur d'effacement
     * @param obj Vehicule_taxi à effacer
     */
     @Override
    public void delete(Vehicule_taxi obj) throws SQLException {

        String req = "delete from api_taxi where idtaxi= ?";
        try (PreparedStatement pstm = dbConnect.prepareStatement(req)) {

            pstm.setInt(1, obj.getIdtaxi());
            int n = pstm.executeUpdate();
            if (n == 0) {
                throw new SQLException("aucune ligne vehicule_taxi effacée");
            }

        }
    }
    /**
     * méthode permettant de récupérer tous les Vehicule_taxi portant un
     * certain matricule
     * @param matrech matricule recherché
     * @return liste du vehicule_taxi
     * @throws SQLException nom inconnu
     */
     public List<Vehicule_taxi> rechimm(String matrech) throws SQLException {
        List<Vehicule_taxi> plusieurs = new ArrayList<>();
        String req = "select * from api_taxi where immatriculation = ?";

        try (PreparedStatement pstm = dbConnect.prepareStatement(req)) {
            pstm.setString(1, matrech);
            try (ResultSet rs = pstm.executeQuery()) {
                boolean trouve = false;
                while (rs.next()) {
                    trouve = true;
                    int idtaxi = rs.getInt("IDtaxi");
                    String immatriculation = rs.getString("immatriculation");
                    int carburant = rs.getInt("carburant");
                    int prixkm = rs.getInt("prixkm");
                    String description = rs.getString("description");
                    plusieurs.add(new Vehicule_taxi(idtaxi,immatriculation, carburant, prixkm,description));
                }

                if (!trouve) {
                    throw new SQLException("immatricul inconnu");
                } else {
                    return plusieurs;
                }
            }
        }
     }
      public List<Vehicule_taxi> rechdescption(String descrech) throws SQLException {
        List<Vehicule_taxi> plusieurs = new ArrayList<>();
        String req = "select * from api_taxi where description like ?";

        try (PreparedStatement pstm = dbConnect.prepareStatement(req)) {
            pstm.setString(1, "%"+descrech+"%");
            try (ResultSet rs = pstm.executeQuery()) {
                boolean trouve = false;
                while (rs.next()) {
                    trouve = true;
                    int idtaxi = rs.getInt("IDtaxi");
                    String immatriculation = rs.getString("immatriculation");
                    int carburant = rs.getInt("carburant");
                    int prixkm = rs.getInt("prixkm");
                    String description = rs.getString("description");
                    plusieurs.add(new Vehicule_taxi(idtaxi,immatriculation, carburant, prixkm,description));
                }

                if (!trouve) {
                    throw new SQLException(" description inexistante");
                } else {
                    return plusieurs;
                }
            }
        }
     }
     
}


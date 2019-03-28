
package taxi_DAO;

/**
 * classe de mappage poo-relationnel client_taxi
 *
 * @author frank kamgo
 * @version 1.0
 * @see Client_taxi
 */
import java.sql.*;
import java.time.LocalDate;
import java.util.*;
import taxi.metier.Client_taxi;

public class Client_taxi_DAO extends DAO<Client_taxi> {

    /**
     * création d'un client_taxi sur base des valeurs de son objet métier
     *
     * @throws SQLException erreur de création
     * @param obj client_taxi à créer
     * @return client_taxi créé
     */
    @Override
    public Client_taxi create(Client_taxi obj) throws SQLException {

        String req1 = "insert into api_clienttaxi(nom,prenom,tel,idadr) values(?,?,?,?)";
        String req2 = "select idclient from api_clienttaxi where nom=? and prenom=? and tel=?";
        try (PreparedStatement pstm1 = dbConnect.prepareStatement(req1);
                PreparedStatement pstm2 = dbConnect.prepareStatement(req2)) {
            pstm1.setString(1, obj.getNom());
            pstm1.setString(2, obj.getPrenom());
            pstm1.setString(3, obj.getTel());
            pstm1.setInt(4, obj.getIdadr());
            int n = pstm1.executeUpdate();
            if (n == 0) {
                throw new SQLException("erreur de creation client, aucune ligne créée");
            }
            pstm2.setString(1, obj.getNom());
            pstm2.setString(2, obj.getPrenom());
            pstm2.setString(3, obj.getTel());
             pstm2.setInt(4, obj.getIdadr());
            try (ResultSet rs = pstm2.executeQuery()) {
                if (rs.next()) {
                    int idclient = rs.getInt(1);
                    obj.setIdclient(idclient);
                    return read(idclient);
                } else {
                    throw new SQLException("erreur de création client, record introuvable");
                }
            }
        }
    }

    /**
     * récupération des données d'un client_taxi sur base de son identifiant
     *
     * @throws SQLException code inconnu
     * @param idclient identifiant du client_taxi
     * @return client_taxi trouvé
     */
    @Override
    public Client_taxi read(int idclient) throws SQLException {

        String req = "select * from api_clienttaxi where idclient = ?";

        try (PreparedStatement pstm = dbConnect.prepareStatement(req)) {

            pstm.setInt(1, idclient);
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

    /**
     * mise à jour des données du client sur base de son identifiant
     *
     * @return Client_taxi
     * @param obj client_taxi à mettre à jour
     * @throws SQLException erreur de mise à jour
     */
    @Override
    public Client_taxi update(Client_taxi obj) throws SQLException {
        String req = "update api_clienttaxi set nom=?,prenom=?,tel=?,idadr=? where idclient= ?";
        try (PreparedStatement pstm = dbConnect.prepareStatement(req)) {

            pstm.setInt(5, obj.getIdclient());
            pstm.setString(1, obj.getNom());
            pstm.setString(2, obj.getPrenom());
            pstm.setString(3, obj.getTel());
            pstm.setInt(4,obj.getIdadr());
            int n = pstm.executeUpdate();
            if (n == 0) {
                throw new SQLException("aucune ligne client_taxi mise à jour");
            }
            return read(obj.getIdclient());
        }
    }

    /**
     * effacement du client_taxi sur base de son identifiant
     *
     * @throws SQLException erreur d'effacement
     * @param obj client_taxi à effacer
     */
    @Override
    public void delete(Client_taxi obj) throws SQLException {

        String req = "delete from api_clienttaxi where idclient= ?";
        try (PreparedStatement pstm = dbConnect.prepareStatement(req)) {

            pstm.setInt(1, obj.getIdclient());
            int n = pstm.executeUpdate();
            if (n == 0) {
                throw new SQLException("aucune ligne client_taxi effacée");
            }

        }
    }

    /**
     * méthode permettant de récupérer tous les clients_taxi portant un
     * certain nom
     * @param nomrech nom recherché
     * @return liste de clients_taxi
     * @throws SQLException nom inconnu
     */
    public List<Client_taxi> rechNom(String nomrech) throws SQLException {
        List<Client_taxi> plusieurs = new ArrayList<>();
        String req = "select * from api_clienttaxi where nom = ?";

        try (PreparedStatement pstm = dbConnect.prepareStatement(req)) {
            pstm.setString(1, nomrech);
            try (ResultSet rs = pstm.executeQuery()) {
                boolean trouve = false;
                while (rs.next()) {
                    trouve = true;
                    int idclient = rs.getInt("IDCLIENT");
                    String nom = rs.getString("NOM");
                    String prenom = rs.getString("PRENOM");
                    String tel = rs.getString("TEL");
                    int idadr = rs.getInt("idadr");
                    plusieurs.add(new Client_taxi(idclient, nom, prenom, tel,idadr));
                }

                if (!trouve) {
                    throw new SQLException("nom inconnu");
                } else {
                    return plusieurs;
                }
            }
        }
        
        
    }
    
    
    /**
     * méthode permettant de récupérer la date de la dernière commande d'un client
     * @param obj client recherché
     * @return  date de la dernière commande
     * @throws SQLException client sans commande
     */
    public LocalDate dern_com(Client_taxi obj) throws SQLException{
         String req = "select dateloc from api_clienttaxi c ,api_locationtaxi l where l.idclient=c.idclient and  idclient = ?";
         try(PreparedStatement pstm = dbConnect.prepareStatement(req)){
             pstm.setInt(1,obj.getIdclient());
             try(ResultSet rs = pstm.executeQuery()){
                 if(rs.next()){
                     LocalDate dt = rs.getDate(1).toLocalDate();
                     return dt;
                 }
                 else throw new SQLException("aucune location enregistrée pour ce client_taxi");
             }
         }
          }
     }
         
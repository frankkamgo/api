
package taxi.metier;
/**
 * classe taxi.métier de gestion d'un client_taxi
 * @author Frank Kamgo Tchoula
 * @version 1.0
 * 
 */

public class Client_taxi {
     /**
   * identifiant unique du client_taxi
   */
     private int idclient;
     /**
   * nom du client_taxi
   */
    private String nom;
    /**
   * prénom du client_taxi
   */
    private String prenom;
    /**
   * téléphone du client_taxi
   */
    private String tel;
    /**
   * identifiant unique de la classe Adressetaxi
   */
    private int idadr;
/**
 * constructeur par défaut
 */
    public Client_taxi() {
    }
    /**
 * constructeur paramétré
 * @param idclient identifiant unique du client, affecté par la base de données
 * @param nom nom du client
 * @param prenom prénom du client
 * @param tel téléphone du client
 * @param idadr identifiant unique de la classe adressetaxi,affecté par la base de donné
 */

    public Client_taxi(int idclient, String nom, String prenom, String tel, int idadr) {
        this.idclient = idclient;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.idadr = idadr;
    }
     /**
    * getter idclient
    * @return identifiant du client_taxi
    */

    public int getIdclient() {
        return idclient;
    }
 /**
     * setter idclient
     * @param idclient identifiant du client_taxi
     */
    public void setIdclient(int idclient) {
        this.idclient = idclient;
    }
/**
     * getter nom
     * @return nom du client_taxi
     */
    public String getNom() {
        return nom;
    }
 /**
     * setter nom du client_taxi
     * @param nom nom du client_taxi
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
/**
     * getter prénom du client_taxi
     * @return prénom du client_taxi
     */
    public String getPrenom() {
        return prenom;
    }
 /**
     * setter prénom du client
     * @param prenom prénom du client
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
/**
     * getter téléphone
     * @return téléphone du client_taxi
     */
    public String getTel() {
        return tel;
    }
 /**
     * setter téléphone
     * @param tel téléphone du client_taxi
     */
    public void setTel(String tel) {
        this.tel = tel;
    }
/**
     * getter adresse
     * @return idadr de la classe adresse
     */
    public int getIdadr() {
        return idadr;
    }
 /**
     * setter adresse
     * @param idadr de la classe adresse
     */
    public void setIdadr(int idadr) {
        this.idadr = idadr;
    }
 /**
 * méthode toString
 * @return informations complètes
 */
    @Override
    public String toString() {
        return "Client_taxi{" + "idclient=" + idclient + ", nom=" + nom + ", prenom=" + prenom + ", tel=" + tel + ", idadr=" + idadr + '}';
    }
 
}

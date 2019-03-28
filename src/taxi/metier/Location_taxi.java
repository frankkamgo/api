
package taxi.metier;

import java.util.Date;
/**
 * classe taxi.métier de gestion de location_taxi
 * @author Frank Kamgo Tchoula
 * @version 1.0
 * 
 */

public class Location_taxi {
      /**
   * identifiant unique de l'ocation_taxi
   */
    private int idloc;
     /**
   * date de location_taxi
   */
    private java.util.Date dateloc;
     /**
   * kilometre parcouru location_taxi
   */
     private int kmtotal;
      /**
   *accompte de location
   */
      private int acompte;
       /**
   * total a payer location_taxi
   */
      private int total;
        /**
   * identifiant unique du client_taxi
   */
      private int idclient;
        /**
   * identifiant unique du taxi
   */
      private int idtaxi;
        /**
   * identifiant unique de l'adresse_taxi de depart
   */
      private int idadrdebuit;
        /**
   * identifiant unique de l'adresse_taxi de fin
   */
      private int idadrfin;
/**
 * constructeur par défaut
 */
    public Location_taxi() {
    }
  /**
 * constructeur paramétré
 * @param idloc identifiant unique d'une location_taxi, affecté par la base de données
 * @param dateloc date de location
 * @param kmtotal kilometre total parcouru
 * @param acompte a verser pour location
 * * @param total montant  a payer 
 * @param idclient identifiant unique de la classe clienttaxi,affecté par la base de donné
 * * @param idtaxi identifiant unique de la classe taxi,affecté par la base de donné
 * * @param idadrdebut identifiant d'adresse de  depart   de la classe adressetaxi,affecté par la base de donné
 * * @param idadrfin identifiant d'adresse de fin de la classe adresse,affecté par la base de donné
 */
    public Location_taxi(int idloc, Date dateloc, int kmtotal, int acompte, int total, int idclient, int idtaxi, int idadrdebuit, int idadrfin) {
        this.idloc = idloc;
        this.dateloc = dateloc;
        this.kmtotal = kmtotal;
        this.acompte = acompte;
        this.total = total;
        this.idclient = idclient;
        this.idtaxi = idtaxi;
        this.idadrdebuit = idadrdebuit;
        this.idadrfin = idadrfin;
    }
/**
    * getter idloc
    * @return identifiant de location
    */
    public int getIdloc() {
        return idloc;
    }
/**
     * setter idloc
     * @param idloc identifiant de l'adresse 
     */
    public void setIdloc(int idloc) {
        this.idloc = idloc;
    }
/**
    * getter dateloc
    * @return la date  de location_taxi
    */
    public Date getDateloc() {
        return dateloc;
    }
/**
     * setter dateloc
     * @param dateloc de location taxi
     */
    public void setDateloc(Date dateloc) {
        this.dateloc = dateloc;
    }
/**
    * getter kmtotal
    * @return les kilometres parcouru de la location
    */
    public int getKmtotal() {
        return kmtotal;
    }
/**
     * setter kmtotal
     * @param kmtotal a parcourir
     */
    public void setKmtotal(int kmtotal) {
        this.kmtotal = kmtotal;
    }
/**
    * getter acompte
    * @return acompte a verser pour la location
    */
    public int getAcompte() {
        return acompte;
    }
/**
     * setter acompte
     * @param acompte a verser pour location
     */
    public void setAcompte(int acompte) {
        this.acompte = acompte;
    }
/**
    * getter total
    * @return le total a payer pour louer de location
    */
    public int getTotal() {
        return total;
    }
/**
     * setter total
     * @param total a payer location
     */
    public void setTotal(int total) {
        this.total = total;
    }
/**
    * getter idclient
    * @return identifiant du client
    */
    public int getIdclient() {
        return idclient;
    }
/**
     * setter idadrfin
     * @param idclient du client
     */
    public void setIdclient(int idclient) {
        this.idclient = idclient;
    }
/**
    * getter idtaxi
    * @return identifiant du taxi
    */
    public int getIdtaxi() {
        return idtaxi;
    }
/**
     * setter idtaxi
     * @param idtaxi du taxi a louer
     */
    public void setIdtaxi(int idtaxi) {
        this.idtaxi = idtaxi;
    }
/**
    * getter idadrdebuit
    * @return identifiant de l'adresse de depart
    */
    public int getIdadrdebuit() {
        return idadrdebuit;
    }
/**
     * setter idadrdebut
     * @param idadrdebuit de l'adresse de depart
     */
    public void setIdadrdebuit(int idadrdebuit) {
        this.idadrdebuit = idadrdebuit;
    }
/**
    * getter idadrfin
    * @return identifiant de l'adresse de fin
    */
    public int getIdadrfin() {
        return idadrfin;
    }
/**
     * setter idadrfin
     * @param idadrfin de l'adresse de fin
     */
    public void setIdadrfin(int idadrfin) {
        this.idadrfin = idadrfin;
    }
/**
 * méthode toString
 * @return informations complètes
 */
    @Override
    public String toString() {
        return "Location_taxi{" + "idloc=" + idloc + ", dateloc=" + dateloc + ", kmtotal=" + kmtotal + ", acompte=" + acompte + ", total=" + total + ", idclient=" + idclient + ", idtaxi=" + idtaxi + ", idadrdebuit=" + idadrdebuit + ", idadrfin=" + idadrfin + '}';
    }
     
      
}




package taxi.metier;

import java.util.Date;

/**
 * classe taxi.métier de gestion de la view view_address
 * @author Frank Kamgo Tchoula
 * @version 1.0
 * 
 */
public class View_address {
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
      private int idadrdebut;
      
               /**
   * code postal de l'adresse 
   */
    protected int cp;
      
         /**
   * localité de l'adresse 
   */
    protected String localite;
    
           /**
   * rue de l'adresse 
   */
    protected String rue;
    
          /**
   * numero de ma rue de l'adresse 
   */
    protected String num;
    
        /**
   * identifiant unique de l'adresse_taxi de fin
   */
      private int idadrfin;
      
                  /**
   * code postal de l'adresse de retour
   */
    protected int cpretour;
    
       /**
   * localité de l'adresse retour
   */
    protected String locretour;
    
          /**
   * rue de l'adresse de retour
   */
    protected String rueretour;
      
     /**
   * numero de ma rue de l'adresse 
   */
    protected String numretour;

   /**
 * constructeur par défaut
 */
    
     public View_address() {
    }
     
      /**
 * constructeur paramétré
 * @param idloc identifiant de la location taxi
 * @param dateloc date de location du taxi
 * @param kmtotal km parcouru
 * @param accompte premier versement pour location
 * @param total montant a payer
 * @param idclient identifiant unique du client, affecté par la base de données
 * @param idtaxi identifiant unique du taxi
 * @param cp code postale de l'adress de location
 * @param rue rue de l'adresse
 * @param num numéro de la vue
 * @param cpretour code pos de l'adress de retour
 * @param locretour la localité de retour 
 * @param rueretour rue de retour 
 * @param numretour numero de la rue de retour

 */
       public View_address(int idloc, Date dateloc, int kmtotal, int acompte, int total, int idclient, int idtaxi, int idadrdebuit, int cp, String localite, String rue, String num, int idadrfin, int cpretour, String locretour, String rueretour, String numretour) {
        this.idloc = idloc;
        this.dateloc = dateloc;
        this.kmtotal = kmtotal;
        this.acompte = acompte;
        this.total = total;
        this.idclient = idclient;
        this.idtaxi = idtaxi;
        this.idadrdebut = idadrdebut;
        this.cp = cp;
        this.localite = localite;
        this.rue = rue;
        this.num = num;
        this.idadrfin = idadrfin;
        this.cpretour = cpretour;
        this.locretour = locretour;
        this.rueretour = rueretour;
        this.numretour = numretour;
    }

    public View_address(int idadr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  /**
    * getter idloc
    * @return identifiant de location_taxi
    */
    public int getIdloc() {
        return idloc;
    }
/**
     * setter idloc
     * @param idloc identifiant de l'ocation_taxi
     */
    public void setIdloc(int idloc) {
        this.idloc = idloc;
    }
  /**
    * getter dateloc
    * @return identifiant du location_taxi
    */
    public Date getDateloc() {
        return dateloc;
    }
/**
     * setter dateloc
     * @param dateloc date de location de location_taxi
     */
    public void setDateloc(Date dateloc) {
        this.dateloc = dateloc;
    }
  /**
    * getter kmtotal
    * @return identifiant de la location
    */
    public int getKmtotal() {
        return kmtotal;
    }
/**
     * setter kmtota
     * @param kmtotal km total a parcourir du taxi loue
     */
    public void setKmtotal(int kmtotal) {
        this.kmtotal = kmtotal;
    }
  /**
    * getter acompte
    * @return identifiant a payer pour location
    */
    public int getAcompte() {
        return acompte;
    }
/**
     * setter acompte
     * @param acompte acompte a verser par le client 
     */
    public void setAcompte(int acompte) {
        this.acompte = acompte;
    }
  /**
    * getter total
    * @return total a vrser pour location
    */
    public int getTotal() {
        return total;
    }
/**
     * setter total
     * @param total a payer  location_taxi
     */
    public void setTotal(int total) {
        this.total = total;
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
    * getter idtaxi
    * @return identifiant du vehicule_taxi
    */
    public int getIdtaxi() {
        return idtaxi;
    }
/**
     * setter idtaxi
     * @param idtaxi identifiant du vehicule_taxi
     */
    public void setIdtaxi(int idtaxi) {
        this.idtaxi = idtaxi;
    }
  /**
    * getter idadrdebut
    * @return identifiant de l'adress de depart
    */
    public int getIdadrdebut() {
        return idadrdebut;
    }
/**
     * setter idadrdfebut
     * @param idadrdebut identifiant de l'adress de depart
     */
    public void setIdadrdebut(int idadrdebuit) {
        this.idadrdebut = idadrdebuit;
    }
  /**
    * getter cp
    * @return code pos de l'adress taxi
    */
    public int getCp() {
        return cp;
    }
/**
     * setter cp
     * @param cp code pos de l'adress de depart
     */
    public void setCp(int cp) {
        this.cp = cp;
    }
  /**
    * getter localite
    * @return localité adresstaxi
    */
    public String getLocalite() {
        return localite;
    }
/**
     * setter location
     * @param localite localité  de l'adress taxi
     */
    public void setLocalite(String localite) {
        this.localite = localite;
    }
  /**
    * getter rue
    * @return rue de l'adress
    */
    public String getRue() {
        return rue;
    }
/**
     * setter rue
     * @param rue rue de l'adress de l'adress
     */
    public void setRue(String rue) {
        this.rue = rue;
    }
  /**
    * getter num
    * @return numero de la rue de l'adress
    */
    public String getNum() {
        return num;
    }
/**
     * setter num
     * @param num numéro de la rue adress
     */
    public void setNum(String num) {
        this.num = num;
    }
  /**
    * getter idadrfin
    * @return identifiant de l'adress_taxi d'arrivé
    */
    public int getIdadrfin() {
        return idadrfin;
    }
/**
     * setter idadrfin
     * @param idadrfin identifiant de l'adress de fin
     */
    public void setIdadrfin(int idadrfin) {
        this.idadrfin = idadrfin;
    }
  /**
    * getter cpretour
    * @return code pos de l'adress de retour de l'adress_taxi
    */
    public int getCpretour() {
        return cpretour;
    }
/**
     * setter cpretour
     * @param cpretour code pos de l'adress de retour
     */
    public void setCpretour(int cpretour) {
        this.cpretour = cpretour;
    }
  /**
    * getter locretour
    * @return localité de l'adress de retour  
    */
    public String getLocretour() {
        return locretour;
    }
/**
     * setter locretour
     * @param locretour de l'adress de retour adress_taxi
     */
    public void setLocretour(String locretour) {
        this.locretour = locretour;
    }
  /**
    * getter rueretour
    * @return rue de l'adress de retour
    */
    public String getRueretour() {
        return rueretour;
    }
/**
     * setter rueretour
     * @param rueretour rue de l'adress de retour 
     */
    public void setRueretour(String rueretour) {
        this.rueretour = rueretour;
    }
  /**
    * getter num
    * @return numéru de l'adress de retour de l'adress taxi
    */
    public String getNumretour() {
        return numretour;
    }
/**
     * setter num
     * @param num de la rue de l'adress de retour 
     */
    public void setNumretour(String numretour) {
        this.numretour = numretour;
    }

      /**
 * méthode toString
 * @return informations complètes
 */
    @Override
    public String toString() {
        return "View_address{" + "idloc=" + idloc + ", dateloc=" + dateloc + ", kmtotal=" + kmtotal + ", acompte=" + acompte + ", total=" + total + ", idclient=" + idclient + ", idtaxi=" + idtaxi + ", idadrdebut=" + idadrdebut + ", cp=" + cp + ", localite=" + localite + ", rue=" + rue + ", num=" + num + ", idadrfin=" + idadrfin + ", cpretour=" + cpretour + ", locretour=" + locretour + ", rueretour=" + rueretour + ", numretour=" + numretour + '}';
    }
    
       
}

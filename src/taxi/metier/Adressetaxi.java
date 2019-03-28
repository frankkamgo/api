
package taxi.metier;
/**
 * classe taxi.métier de gestion de l'adressetaxi
 * @author Frank Kamgo Tchoula
 * @version 1.0
 * 
 */

public class Adressetaxi {
      /**
   * identifiant unique de la adresse
   */
      protected int idadr;
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
 * constructeur par défaut
 */
    public Adressetaxi() {
    }
   /**
 * constructeur paramétré
 * @param idadr identifiant unique de l'adresse, affecté par la base de données
 * @param cp code postal
 * @param localite localite 
 * @param rue rue de l'adresse
 * @param  num numero de la rue 
 */
    public Adressetaxi(int idadr, int cp, String localite, String rue, String num) {
        this.idadr = idadr;
        this.cp = cp;
        this.localite = localite;
        this.rue = rue;
        this.num = num;
    }
 /**
    * getter idadr
    * @return identifiant de l'adresse
    */
    public int getIdadr() {
        return idadr;
    }
/**
     * getter cp
     * @return cp de l'adresse
     */
    public int getCp() {
        return cp;
    }
/**
     * getter localité
     * @return localite de l'adresse
     */
    public String getLocalite() {
        return localite;
    }
/**
     * getter rue
     * @return rue de l'adresse
     */
    public String getRue() {
        return rue;
    }
/**
     * getter num
     * @return numero de lé rue
     */
    public String getNum() {
        return num;
    }
/**
     * setter idadr
     * @param idadr identifiant de l'adresse
     */
    public void setIdadr(int idadr) {
        this.idadr = idadr;
    }
/**
     * setter cp
     * @param cp de l'adresse
     */
    public void setCp(int cp) {
        this.cp = cp;
    }
/**
     * setter localité
     * @param localite de l'adresse
     */
    public void setLocalite(String localite) {
        this.localite = localite;
    }
/**
     * setter rue
     * @param rue rue adresse
     */
    public void setRue(String rue) {
        this.rue = rue;
    }
/**
     * setter num
     * @param num numero de l'adresse
     */
    public void setNum(String num) {
        this.num = num;
    }
/**
 * méthode toString
 * @return informations complètes
 */
    @Override
    public String toString() {
        return "Adressetaxi{" + "idadr=" + idadr + ", cp=" + cp + ", localite=" + localite + ", rue=" + rue + ", num=" + num + '}';
    }
    
    
    
}


package taxi.metier;
/**
 * classe taxi.métier de gestion de Vehicule_taxi
 * @author Frank Kamgo Tchoula
 * @version 1.0
 * 
 */

public class Vehicule_taxi {
       /**
   * identifiant unique du taxi
   */
    private int idtaxi;
       /**
   * immatriculation du taxi
   */
    private String immatriculation;
       /**
   * quantité du carburant
   */
    private int carburant;
       /**
   * prix du kilometre parcouru
   */
    private int prixkm;
       /**
   * description du taxi
   */
    private String description;
/**
 * constructeur par défaut
 */
    public Vehicule_taxi() {
    }
/**
 * constructeur paramétré
 * @param idtaxi identifiant unique de l'adresse, affecté par la base de données
 * @param immatriculation du ntaxi
 * @param carburant consommé
 * @param prix du kilometre parcouru
 * @param  description du taxi
 */
    public Vehicule_taxi(int idtaxi, String immatriculation, int carburant, int prixkm, String description) {
        this.idtaxi = idtaxi;
        this.immatriculation = immatriculation;
        this.carburant = carburant;
        this.prixkm = prixkm;
        this.description = description;
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
     * @param idtaxi identifiant du taxi
     */
    public void setIdtaxi(int idtaxi) {
        this.idtaxi = idtaxi;
    }
/**
    * getter immatriculation
    * @return le matricul du taxi
    */
    public String getImmatriculation() {
        return immatriculation;
    }
/**
     * setter matricul
     * @param matriculation du taxi
     */
    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }
/**
    * getter carburant
    * @return carburant dépensé du taxi
    */
    public int getCarburant() {
        return carburant;
    }
/**
     * setter carburant
     * @param carburant dépensé
     */
    public void setCarburant(int carburant) {
        this.carburant = carburant;
    }
/**
    * getter prixkm
    * @return prixkm prix par km
    */
    public int getPrixkm() {
        return prixkm;
    }
/**
     * setter prixkm
     * @param prixkm par km
     */
    public void setPrixkm(int prixkm) {
        this.prixkm = prixkm;
    }
/**
    * getter description
    * @return description du taxi
    */
    public String getDescription() {
        return description;
    }
/**
     * setter description
     * @param description du taxi
     */
    public void setDescription(String description) {
        this.description = description;
    }
/**
 * méthode toString
 * @return informations complètes
 */
    @Override
    public String toString() {
        return "Vehicule_taxi{" + "idtaxi=" + idtaxi + ", immatriculation=" + immatriculation + ", carburant=" + carburant + ", prixkm=" + prixkm + ", description=" + description + '}';
    }
    

}


package taxi_DAO;

import dbconnect.dbconnexion;
import java.time.LocalDate;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import taxi.metier.Vehicule_taxi;

/**
 *
 * @author kamgo frank
 */
public class Vehicule_taxi_DAOTest {
     static Connection dbConnect;
    public Vehicule_taxi_DAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
         
        dbConnect = dbconnexion.getConnection();
        if (dbConnect == null) {
            System.out.println("connection invalide");
            System.exit(1);
        }
         System.out.println("connection établi");
    }
    
    
    @AfterClass
    public static void tearDownClass() {
        dbconnexion.closeConnection();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class Vehicule_taxi_DAO.
     */
    @Test
    public void testCreate() throws Exception { 
        System.out.println("create");
        Vehicule_taxi obj = new Vehicule_taxi(0,"TesImmatriculation",50,100,"TesDescription");
        Vehicule_taxi_DAO instance = new Vehicule_taxi_DAO();
        instance.setConnection(dbConnect);
        Vehicule_taxi expResult = new Vehicule_taxi(0,"TesImmatriculation",50,100,"TesDescription");;
        Vehicule_taxi result = instance.create(obj);
        assertEquals("différents immatriculation",expResult.getImmatriculation(), result.getImmatriculation());
        assertEquals("litre de carburant pas identique",expResult.getCarburant(), result.getCarburant());
        assertEquals("différents prix",expResult.getPrixkm(), result.getPrixkm());
        assertEquals("Description différentes",expResult.getDescription(), result.getDescription());
        assertNotEquals("id non généré",expResult.getIdtaxi(),result.getIdtaxi());
        int idtaxi=result.getIdtaxi();
        obj=new Vehicule_taxi(0,"TesImmatriculation",22,90,"TesDescription");
        try{
            Vehicule_taxi result2 = instance.create(obj);
            fail("exception de doublon non déclenchée");
            instance.delete(result2);
        }
         catch(SQLException e){}
        instance.delete(result);
         obj=new Vehicule_taxi(0,"TesImmatriculation",32,95,"TesDescription");
          try{
            Vehicule_taxi result3 = instance.create(obj);
            fail("exception de code postal non déclenchée");
            instance.delete(result3);
        }
        catch(SQLException e){}
         instance.delete(result);
        
    }

    /**
     * Test of read method, of class Vehicule_taxi_DAO.
     */
    @Test
    public void testRead() throws Exception {
        System.out.println("read");
        int idtaxi = 0;
        Vehicule_taxi_DAO instance = new Vehicule_taxi_DAO();
         instance.setConnection(dbConnect);
        Vehicule_taxi obj = new Vehicule_taxi(0,"TesImmatriculation",50,100,"TesDescription");
        Vehicule_taxi expResult = instance.create(obj);
          idtaxi=expResult.getIdtaxi();
        Vehicule_taxi result = instance.read(idtaxi);
       
        assertEquals("Immatriculation différents",expResult.getImmatriculation(), result.getImmatriculation());
         assertEquals("litre de carburant pas identique",expResult.getCarburant(), result.getCarburant());
        assertEquals("différents prix",expResult.getPrixkm(), result.getPrixkm());
        assertEquals("Description différentes",expResult.getDescription(), result.getDescription());
        assertNotEquals("id non généré",expResult.getIdtaxi(),result.getIdtaxi());
         try{
            result=instance.read(0);
            fail("exception d'id inconnu non générée");
        }
        catch(SQLException e){}
       instance.delete(result);
       // fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Vehicule_taxi_DAO.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Vehicule_taxi obj = null;
        Vehicule_taxi_DAO instance = new Vehicule_taxi_DAO();
        Vehicule_taxi expResult = null;
        Vehicule_taxi result = instance.update(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Vehicule_taxi_DAO.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        Vehicule_taxi obj = new Vehicule_taxi(0,"TesImmatriculation",50,100,"TesDescription");
        Vehicule_taxi_DAO instance = new Vehicule_taxi_DAO();
       instance.setConnection(dbConnect);
        obj = instance.create(obj);
        instance.delete(obj);
        try {
            instance.read(obj.getIdtaxi());
            fail("exception de record introuvable non générée");
        }
        catch(SQLException e){}
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of rechimm method, of class Vehicule_taxi_DAO.
     */
    @Test
    public void testRechimm() throws Exception {
        System.out.println("rechimm");
        Vehicule_taxi obj1 = new Vehicule_taxi(0,"TesImmatriculation",50,100,"TesDescription");
        Vehicule_taxi obj2 = new Vehicule_taxi(0,"TesImmatriculation",30,80,"TesDescription");
        String matrech = "TesImmatriculation";
        Vehicule_taxi_DAO instance = new Vehicule_taxi_DAO();
         obj1=instance.create(obj1);
        obj2=instance.create(obj2);
        List<Vehicule_taxi> expResult = instance.rechimm(matrech);
        if(expResult.indexOf(obj1)<0) fail("record introuvable "+obj1);
        if(expResult.indexOf(obj2)<0) fail("record introuvable"+obj2);
        instance.delete(obj1);
        instance.delete(obj2);
        //assertEquals(expResult, result);
        
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of rechdescption method, of class Vehicule_taxi_DAO.
     */
    @Test
    public void testRechdescption() throws Exception {
        System.out.println("rechdescption");
        String descrech = "";
        Vehicule_taxi_DAO instance = new Vehicule_taxi_DAO();
        List<Vehicule_taxi> expResult = null;
        List<Vehicule_taxi> result = instance.rechdescption(descrech);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

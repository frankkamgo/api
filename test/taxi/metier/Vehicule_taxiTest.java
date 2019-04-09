/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxi.metier;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class Vehicule_taxiTest {
    
    public Vehicule_taxiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdtaxi method, of class Vehicule_taxi.
     */
    @Test
    public void testGetIdtaxi() {
        System.out.println("getIdtaxi");
        Vehicule_taxi instance = new Vehicule_taxi();
        int expResult = 0;
        int result = instance.getIdtaxi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdtaxi method, of class Vehicule_taxi.
     */
    @Test
    public void testSetIdtaxi() {
        System.out.println("setIdtaxi");
        int idtaxi = 0;
        Vehicule_taxi instance = new Vehicule_taxi();
        instance.setIdtaxi(idtaxi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImmatriculation method, of class Vehicule_taxi.
     */
    @Test
    public void testGetImmatriculation() {
        System.out.println("getImmatriculation");
        Vehicule_taxi instance = new Vehicule_taxi();
        String expResult = "";
        String result = instance.getImmatriculation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImmatriculation method, of class Vehicule_taxi.
     */
    @Test
    public void testSetImmatriculation() {
        System.out.println("setImmatriculation");
        String immatriculation = "";
        Vehicule_taxi instance = new Vehicule_taxi();
        instance.setImmatriculation(immatriculation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarburant method, of class Vehicule_taxi.
     */
    @Test
    public void testGetCarburant() {
        System.out.println("getCarburant");
        Vehicule_taxi instance = new Vehicule_taxi();
        int expResult = 0;
        int result = instance.getCarburant();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarburant method, of class Vehicule_taxi.
     */
    @Test
    public void testSetCarburant() {
        System.out.println("setCarburant");
        int carburant = 0;
        Vehicule_taxi instance = new Vehicule_taxi();
        instance.setCarburant(carburant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrixkm method, of class Vehicule_taxi.
     */
    @Test
    public void testGetPrixkm() {
        System.out.println("getPrixkm");
        Vehicule_taxi instance = new Vehicule_taxi();
        int expResult = 0;
        int result = instance.getPrixkm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrixkm method, of class Vehicule_taxi.
     */
    @Test
    public void testSetPrixkm() {
        System.out.println("setPrixkm");
        int prixkm = 0;
        Vehicule_taxi instance = new Vehicule_taxi();
        instance.setPrixkm(prixkm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Vehicule_taxi.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Vehicule_taxi instance = new Vehicule_taxi();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Vehicule_taxi.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Vehicule_taxi instance = new Vehicule_taxi();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Vehicule_taxi.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vehicule_taxi instance = new Vehicule_taxi();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

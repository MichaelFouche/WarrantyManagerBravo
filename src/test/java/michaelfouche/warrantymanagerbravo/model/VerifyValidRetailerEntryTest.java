/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model;

import michaelfouche.warrantymanagerbravo.model.Retailer.VerifyValidRetailerEntry;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author foosh
 */
public class VerifyValidRetailerEntryTest {
    
    public VerifyValidRetailerEntryTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

     @Test
    public void testVerifyValidEntryTrue() throws Exception {
          
       VerifyValidRetailerEntry vvwe = new VerifyValidRetailerEntry();
       Assert.assertTrue(vvwe.verifyValidEntry("Vodacom",  "Western Cape","Somerset West"));
       
        
    }
    @Test
    public void testVerifyValidEntryFalse() throws Exception {
       
       VerifyValidRetailerEntry vvwe = new VerifyValidRetailerEntry();
       Assert.assertFalse(vvwe.verifyValidEntry("Vodacom", "Western Cape",""));
        
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
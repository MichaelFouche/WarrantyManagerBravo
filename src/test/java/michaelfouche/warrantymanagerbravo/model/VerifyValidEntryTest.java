/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model;

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
public class VerifyValidEntryTest {
    
    public VerifyValidEntryTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void testVerifyValidEntryTrue() throws Exception {
       VerifyValidEntry vve = new VerifyValidEntry();
       Assert.assertTrue(vve.verifyValidEntry("Jack", "Daniels", "9107"));
       
        
    }
    @Test
    public void testVerifyValidEntryFalse() throws Exception {
       VerifyValidEntry vve = new VerifyValidEntry();       
       Assert.assertFalse(vve.verifyValidEntry("", "Daniels", "9107"));
        
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
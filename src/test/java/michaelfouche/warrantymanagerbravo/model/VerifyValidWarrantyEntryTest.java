/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model;

import michaelfouche.warrantymanagerbravo.model.Warranty.VerifyValidWarrantyEntry;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class VerifyValidWarrantyEntryTest {
    
    public VerifyValidWarrantyEntryTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void testVerifyValidEntryTrue() throws Exception {
          
       VerifyValidWarrantyEntry vvwe = new VerifyValidWarrantyEntry();
       Assert.assertTrue(vvwe.verifyValidEntry("123AB321", "Hardware", 356));
       
        
    }
    @Test
    public void testVerifyValidEntryFalse() throws Exception {
       
       VerifyValidWarrantyEntry vvwe = new VerifyValidWarrantyEntry();
       Assert.assertFalse(vvwe.verifyValidEntry("123AB321", "", 0));
        
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
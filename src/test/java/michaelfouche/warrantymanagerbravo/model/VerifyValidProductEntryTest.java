/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model;

import michaelfouche.warrantymanagerbravo.model.Product.VerifyValidProductEntry;
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
public class VerifyValidProductEntryTest {
    
    public VerifyValidProductEntryTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

     @Test
    public void testVerifyValidEntryTrue() throws Exception {
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");        
        Date d = sdf.parse("04/11/2013");      
       VerifyValidProductEntry vvpe = new VerifyValidProductEntry();
       Assert.assertTrue(vvpe.verifyValidEntry("S4", "123AB321", "Samsung", d, "Vodacom-Somerset-01"));
       
        
    }
    @Test
    public void testVerifyValidEntryFalse() throws Exception {
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");        
        Date d = sdf.parse("04/11/2013");      
       VerifyValidProductEntry vvpe = new VerifyValidProductEntry();
       Assert.assertTrue(vvpe.verifyValidEntry("", "123AB321", "Samsung", d, "Vodacom-Somerset-01"));
        
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
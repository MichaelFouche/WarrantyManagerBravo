/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model;

import michaelfouche.warrantymanagerbravo.model.Retailer.AddRetailer;
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
public class AddRetailerTest {
    
    public AddRetailerTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void testCreationAddRetailer() throws Exception {
       AddRetailer addRetailer = new AddRetailer.Builder() 
            .name("Vodacom-Somerset-01")
            .city("Somerset West")
            .province("Western Cape")
            .build();
       Assert.assertEquals(addRetailer.getName(),"Vodacom-Somerset-01");
       Assert.assertEquals(addRetailer.getCity(),"Somerset West");       
       Assert.assertEquals(addRetailer.getProvince(),"Western Cape");   
        
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
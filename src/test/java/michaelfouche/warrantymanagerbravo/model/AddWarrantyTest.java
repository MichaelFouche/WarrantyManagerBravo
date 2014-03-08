/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model;

import michaelfouche.warrantymanagerbravo.model.Warranty.AddWarranty;
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
public class AddWarrantyTest {
    
    public AddWarrantyTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void testCreationAddWarranty() throws Exception {
       AddWarranty addwarranty = new AddWarranty.Builder() 
            .productSn("123BA321")
            .type("Hardware") //for example: hardware, water damage, software 
            .duration(356)  //days
            .build();
       
       Assert.assertEquals(addwarranty.getProductSn(),"123BA321");
       Assert.assertEquals(addwarranty.getType(),"Hardware");       
       Assert.assertEquals(addwarranty.getDuration(),356); 
        
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
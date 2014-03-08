/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model;

import michaelfouche.warrantymanagerbravo.model.Warranty.EditWarranty;
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
public class EditWarrantyTest {
    
    public EditWarrantyTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testEditWarranty() throws Exception {
    AddWarranty addwarranty = new AddWarranty.Builder() 
            .productSn("123BA321")
            .type("Hardware") //for example: hardware, water damage, software 
            .duration(356)  //days
            .build();
       EditWarranty ew = new EditWarranty();
       addwarranty = ew.editWarranty("", "",712,addwarranty);
       Assert.assertEquals(addwarranty.getProductSn(),"123BA321");
       Assert.assertEquals(addwarranty.getType(),"Hardware");       
       Assert.assertEquals(addwarranty.getDuration(),712); 
       ew = new EditWarranty();
       addwarranty = ew.editWarranty("", "Software",0,addwarranty);
       Assert.assertEquals(addwarranty.getProductSn(),"123BA321");
       Assert.assertEquals(addwarranty.getType(),"Software");       
       Assert.assertEquals(addwarranty.getDuration(),712); 
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
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
public class EditProductTest {
    
    public EditProductTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void testCreationAddProduct() throws Exception {
       AddProduct addproduct = new AddProduct.Builder() 
            .model("S4")
            .sn("123BA321")
            .manufacturer("Samsung")
            .purchaseDate("04112013")
            .retailer("Vodacom-Somerset-01")
            .build();
       EditProduct ed = new EditProduct();
       addproduct = ed.editProduct("S4-Mini", "", "", "", "",addproduct);
       Assert.assertEquals(addproduct.getModel(),"S4-Mini");
       Assert.assertEquals(addproduct.getSn(),"123BA321");       
       Assert.assertEquals(addproduct.getManufacturer(),"Samsung");   
       Assert.assertEquals(addproduct.getPurchaseDate(),"04112013"); 
       Assert.assertEquals(addproduct.getRetailer(),"Vodacom-Somerset-01");
        
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
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model;

import michaelfouche.warrantymanagerbravo.model.Product.AddProduct;
import michaelfouche.warrantymanagerbravo.model.Product.EditProduct;
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
public class EditProductTest {
    
    public EditProductTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void testEditProduct() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = sdf.parse("04/11/2013");
       AddProduct addproduct = new AddProduct.Builder() 
            .model("S4")
            .sn("123BA321")
            .manufacturer("Samsung")
            .purchaseDate(d)
            .retailer("Vodacom-Somerset-01")
            .build();
       EditProduct ed = new EditProduct();
       addproduct = ed.editProduct("S4-Mini", "", "", d, "",addproduct);
       Assert.assertEquals(addproduct.getModel(),"S4-Mini");
       Assert.assertEquals(addproduct.getSn(),"123BA321");       
       Assert.assertEquals(addproduct.getManufacturer(),"Samsung");   
       Assert.assertEquals(addproduct.getPurchaseDate(),d); 
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
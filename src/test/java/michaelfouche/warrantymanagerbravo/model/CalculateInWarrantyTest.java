/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
public class CalculateInWarrantyTest {
    
    public CalculateInWarrantyTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void testCalculateInWarrantyTrue() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");        
        Date d = new Date();  
       
        Date date = d;
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, -10); // add 10 days
        date = cal.getTime();
        
       CalculateInWarranty ciw = new CalculateInWarranty();
       
       Assert.assertTrue(ciw.calculateInWarranty(date, 11));
      // Assert.assertEquals(addwarranty.getType(),"Hardware");       
      // Assert.assertEquals(addwarranty.getDuration(),356); 
        
    }
    @Test (enabled = true)
    public void testCalculateInWarrantyFalse() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");        
        Date d = new Date();  
       
        Date date = d;
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, -10); // add 10 days
        date = cal.getTime();
        
       CalculateInWarranty ciw = new CalculateInWarranty();
       
       Assert.assertFalse(ciw.calculateInWarranty(date, 9));
      // Assert.assertEquals(addwarranty.getType(),"Hardware");       
      // Assert.assertEquals(addwarranty.getDuration(),356); 
        
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
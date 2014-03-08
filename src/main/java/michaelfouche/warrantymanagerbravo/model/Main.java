/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author foosh
 */
public class Main {
    public static void main(String [] args)throws Exception{
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");        
        Date d = sdf.parse("04/11/2013");            
       
        String fname = "Jack";
        String lname = "Daniels";
        String id = "";
        AddUser adduser = new AddUser.Builder() 
            .firstname("Jack")
            .lastname("Daniels")
            .id("7542544")
            .contact("0225558452")
            .build();
        AddProduct addproduct = new AddProduct.Builder()
                .model("")
                .sn("")
                .manufacturer("")
                .purchaseDate(d)
                .retailer("")
                .build();
        
        CalculateInWarranty ciw = new CalculateInWarranty();
        boolean validWarranty = ciw.calculateInWarranty(d, 356);
        System.out.println("A warranty with 356 days is, bought on 04/11/2013 returns: " + validWarranty);
        validWarranty = ciw.calculateInWarranty(d, 60);
        System.out.println("A warranty with 60 days is, bought on 04/11/2013 returns: " + validWarranty);
        VerifyValidUserEntry vve = new VerifyValidUserEntry();
        boolean valid = vve.verifyValidEntry(fname, lname,id);
        
        
       
    }
            
}

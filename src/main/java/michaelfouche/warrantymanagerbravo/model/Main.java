/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model;

import java.util.List;

/**
 *
 * @author foosh
 */
public class Main {
    public static void main(String [] args){
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
                .purchaseDate("")
                .retailer("")
                .build();
        
        
        VerifyValidEntry vve = new VerifyValidEntry();
        boolean valid = vve.verifyValidEntry(fname, lname,id);
        
        
    }
            
}

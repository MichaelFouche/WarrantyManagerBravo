/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model.Product;

import java.util.Date;

/**
 *
 * @author foosh
 */
public class VerifyValidProductEntry {
    private String model;
    private String sn;
    private String manufacturer;
    private Date purchaseDate;
    private String retailer;
    
    public VerifyValidProductEntry(){
        
    }
    
    public boolean verifyValidEntry(String mod, String s, String man, Date pd, String ret){
        model = mod;
        sn = s;
        manufacturer = man;
        purchaseDate = pd;
        retailer = ret;
        
        if(!model.equals("")||!sn.equals("")||!manufacturer.equals("")||!retailer.equals("")){
            return true;
        }        
        else{
            return false;
        }
        
    }
}

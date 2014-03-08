/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model.Warranty;

/**
 *
 * @author foosh
 */
public class VerifyValidWarrantyEntry {
    private String productSn;
    private String type;
    private int duration;
    
    public boolean verifyValidEntry(String ds, String t, int d){
        productSn = ds;
        type = t;
        duration = d;
        
        if(productSn.equals("")||type.equals("")||duration==0){
            return false;
        }        
        else{
            return true;
        }
        
    }
}

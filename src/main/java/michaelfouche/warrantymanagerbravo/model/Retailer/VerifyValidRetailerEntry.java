/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model.Retailer;

/**
 *
 * @author foosh
 */
public class VerifyValidRetailerEntry {
    private String name;
    private String province;
    private String city;
    
    public boolean verifyValidEntry(String n, String p, String c){
        name = n;
        province = p;
        city = c;
        
        if(name.equals("")||province.equals("")||city.equals("")){
            return false;
        }        
        else{
            return true;
        }
        
    }
}

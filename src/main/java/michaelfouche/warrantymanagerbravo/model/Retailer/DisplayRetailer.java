/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model.Retailer;

/**
 *
 * @author foosh
 */
public class DisplayRetailer{
    private DisplayRetailer(){
        
    }
    
    public String GetRetailSummary(AddRetailer retail){
        String message;
        
        message = retail.getName() + retail.getProvince() + retail.getCity()  ;
        
        return message;
    }
}

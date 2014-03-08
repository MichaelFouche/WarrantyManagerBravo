/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model.Product;


/**
 *
 * @author foosh
 */
public class DisplayProduct {
    
    private DisplayProduct(){
        
    }
    
    public String GetProductSummary(AddProduct product){
        String message;
        
        message = product.getManufacturer() + product.getModel() + product.getSn() + product.getPurchaseDate() + product.getRetailer() ;
        
        return message;
    }
    
}

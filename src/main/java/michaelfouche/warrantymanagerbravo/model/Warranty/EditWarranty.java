/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model.Warranty;

/**
 *
 * @author foosh
 */
public class EditWarranty {
    private String productSn;
    private String type;
    private int duration;
    //AddProduct addproduct = new AddProduct;
    
    public EditWarranty(){
        
        
    }
    
    public AddWarranty editWarranty(String ps, String t, int d, AddWarranty addWarranty ){
        productSn = ps;
        type = t;
        duration = d;
       
        if(productSn.equals("")) {
            productSn = addWarranty.getProductSn();
        }
        if(type.equals("")){
            type = addWarranty.getType();
        }
        if(duration==0){
            duration = addWarranty.getDuration();
        }
        
        AddWarranty addwarrantyTemp = new AddWarranty.Builder()                
            .productSn(productSn)
            .type(type)
            .duration(duration)
            .build();
        
        return addwarrantyTemp;
    }
}

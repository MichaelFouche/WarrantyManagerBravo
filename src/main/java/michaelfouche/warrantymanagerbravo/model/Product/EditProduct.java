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
public class EditProduct {
    private String model;
    private String sn;
    private String manufacturer;
    private Date purchaseDate;
    private String retailer;
    //AddProduct addproduct = new AddProduct;
    
    public EditProduct(){
        
        
    }
    
    public AddProduct editProduct(String mod, String s, String man, Date pd, String re, AddProduct addproduct ){
        model = mod;
        sn = s;
        manufacturer = man;
        purchaseDate = pd;
        retailer = re;
       
        if(model.equals("")) {
            model = addproduct.getModel();
        }
        if(sn.equals("")){
            sn = addproduct.getSn();
        }
        if(manufacturer.equals("")){
            manufacturer = addproduct.getManufacturer();
        }
        
            purchaseDate = pd;
        
        if(retailer.equals("")){
            retailer = addproduct.getRetailer();
        }
        AddProduct addproductTemp = new AddProduct.Builder()                
            .model(model)
            .sn(sn)
            .manufacturer(manufacturer)
            .purchaseDate(purchaseDate)
            .retailer(retailer)
            .build();
        
        return addproductTemp;
    }
    
    
}

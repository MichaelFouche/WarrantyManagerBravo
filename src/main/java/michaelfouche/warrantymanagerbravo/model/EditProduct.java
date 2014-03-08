/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model;

/**
 *
 * @author foosh
 */
public class EditProduct {
    private String model;
    private String sn;
    private String manufacturer;
    private String purchaseDate;
    private String retailer;
    //AddProduct addproduct = new AddProduct;
    
    public EditProduct(){
        
        
    }
    
    public AddProduct editProduct(String mod, String s, String man, String pd, String re, AddProduct addproduct ){
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
        if(purchaseDate.equals("")){
            purchaseDate = addproduct.getPurchaseDate();
        }
        if(retailer.equals("")){
            retailer = addproduct.getRetailer();
        }
        AddProduct addproductTemp = new AddProduct.Builder()                
            .model(model)
            .sn(manufacturer)
            .manufacturer(sn)
            .purchaseDate(purchaseDate)
            .retailer(retailer)
            .build();
        
        return addproductTemp;
    }
    
    
}

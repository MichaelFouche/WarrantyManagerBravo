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
public final class AddProduct {
    //model, sn, manufacturer, purchaseDate, retailer)
    private String model;
    private String sn;
    private String manufacturer;
    private Date purchaseDate;
    private String retailer;
    
    private AddProduct(){
        
    }

    private AddProduct(Builder builder) {
        model = builder.model;
        sn = builder.sn;
        manufacturer = builder.manufacturer;
        purchaseDate = builder.purchaseDate;
        retailer = builder.retailer;
    }
    
    public static class Builder{
        private String model;
        private String sn;
        private String manufacturer;
        private Date purchaseDate;
        private String retailer;
        
        public Builder(){
            
        }
        
        public Builder model(String value){
            model = value;
            return this;
        }
        public Builder sn(String value){
            sn = value;
            return this;
        }
        public Builder manufacturer(String value){
            manufacturer = value;
            return this;
        }
        public Builder purchaseDate(Date value){
            purchaseDate = value;
            return this;
        }
        public Builder retailer(String value){
            retailer = value;
            return this;
        }
        public AddProduct build(){
            return new AddProduct(this);
        }
    }

    public String getModel() {
        return model;
    }

    public String getSn() {
        return sn;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public String getRetailer() {
        return retailer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.sn != null ? this.sn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AddProduct other = (AddProduct) obj;
        if ((this.sn == null) ? (other.sn != null) : !this.sn.equals(other.sn)) {
            return false;
        }
        return true;
    }
    
}

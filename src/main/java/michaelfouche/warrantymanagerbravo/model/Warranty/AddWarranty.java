/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model.Warranty;

/**
 *
 * @author foosh
 */
public class AddWarranty {
    private String productSn;
    private String type;
    private int duration;
    
    private AddWarranty(Builder builder){
        productSn = builder.productSn;
        type = builder.type;
        duration = builder.duration;
    }
    
    public static class Builder{
        private String productSn;
        private String type;
        private int duration;
        
        public Builder(){
            
        }
        
        public Builder productSn(String value){
            productSn = value;
            return this;
        }
        public Builder type(String value){
            type = value;
            return this;
        }
        public Builder duration(int value){
            duration = value;
            return this;
        }
        
        public AddWarranty build(){
            return new AddWarranty(this);
        }
    }

    public String getProductSn() {
        return productSn;
    }

    public String getType() {
        return type;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (this.productSn != null ? this.productSn.hashCode() : 0);
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
        final AddWarranty other = (AddWarranty) obj;
        if ((this.productSn == null) ? (other.productSn != null) : !this.productSn.equals(other.productSn)) {
            return false;
        }
        return true;
    }
    
    
}

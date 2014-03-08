/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model;

/**
 *
 * @author foosh
 */
public class AddRetailer {
    private String name;
    private String province;
    private String city;
    
    private AddRetailer(){
        
    }
    
    private AddRetailer(Builder builder){
        name = builder.name;
        province = builder.province;
        city = builder.city;
    }
    
    public static class Builder{
        private String name;
        private String province;
        private String city;
        public Builder(){
            
        }
        
         public Builder name(String value){
            name = value;
            return this;
        }
         public Builder province(String value){
            province = value;
            return this;
        }
         public Builder city(String value){
            city = value;
            return this;
        }
         public AddRetailer build(){
             return new AddRetailer(this);
         }
    }

    public String getName() {
        return name;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }
    
}

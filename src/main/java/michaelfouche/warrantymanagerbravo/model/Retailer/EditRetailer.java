/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model.Retailer;

/**
 *
 * @author foosh
 */
public class EditRetailer {
    private String name;
    private String province;
    private String city;
    
    public EditRetailer(){
        
        
    }
    
    public AddRetailer editretailer(String n, String p, String c, AddRetailer addretailer ){
        name = n;
        province = p;
        city = c;
       
        if(name.equals("")) {
            name = addretailer.getName();
        }
        if(province.equals("")){
            province = addretailer.getProvince();
        }
        if(city.equals("")){
            city = addretailer.getCity();
        }
        
        AddRetailer addretailerTemp = new AddRetailer.Builder()                
            .name(name)
            .province(province)
            .city(city)
            .build();
        
        return addretailerTemp;
    }
}

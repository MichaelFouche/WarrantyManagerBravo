/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model.User;

import michaelfouche.warrantymanagerbravo.model.User.AddUser;
import java.util.List;

/**
 *
 * @author foosh
 */
public class EditUser {
    private String firstname;
    private String lastname;
    private String id;
    private String contact;
    
    public EditUser(){
        
        
    }
    
    public AddUser edituser(String fn, String ln, String i, String c, AddUser adduser ){
        firstname = fn;
        lastname = ln;
        id = i;
        contact = c;
       
        if(firstname.equals("")) {
            firstname = adduser.getFirstname();
        }
        if(lastname.equals("")){
            lastname = adduser.getLastname();
        }
        if(id.equals("")){
            id = adduser.getId();
        }
        if(contact.equals("")){
            contact = adduser.getContact();
        }
        
        
        AddUser adduserTemp = new AddUser.Builder()                
            .firstname(firstname)
            .lastname(lastname)
            .id(id)
            .contact(contact)    
            .build();
        
        return adduserTemp;
    }
}

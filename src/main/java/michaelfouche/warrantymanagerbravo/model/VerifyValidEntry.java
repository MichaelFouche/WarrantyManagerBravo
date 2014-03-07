/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model;

import java.util.List;

/**
 *
 * @author foosh
 */
public class VerifyValidEntry {
    //This receives the entry from the user, when this has been accepted it calls a class to update UserCredentials (delete and reCreate the object)
    private String firstname;
    private String lastname;
    private String id;
    private List<AddUser> address;
    private String contact;
    
    public boolean verifyValidEntry(String fn, String ln, String i){
        firstname = fn;
        lastname = ln;
        id = i;
        
        if(firstname.equals("")||lastname.equals("")||id.equals("")){
            return false;
        }        
        else{
            return true;
        }
        
    }
    
}

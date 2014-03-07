/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model;

/**
 *
 * @author foosh
 */
public class VerifyPassword {
    
    
    public boolean verifyPassword(String password1, String password2){        
        return password1.equals(password2);
    }
}

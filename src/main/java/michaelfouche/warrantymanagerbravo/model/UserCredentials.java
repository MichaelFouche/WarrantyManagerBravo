/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model;

/**
 *
 * @author foosh
 */
public class UserCredentials {
    private String userID;
    private String passCode;
    
    private UserCredentials(){
        
    }
    private UserCredentials(Builder builder){
        userID = builder.userID;
        passCode = builder.passCode;
    }
    public static class Builder{
        private String userID;
        private String passCode;
        
        public Builder(){
            
        }
        public Builder userID(String value){
            userID = value;
            return this;
        }
        public Builder passCode(String value){
            passCode = value;
            return this;
        }
        public UserCredentials build(){
            return new UserCredentials(this);
        }
    }

    public String getUserID() {
        return userID;
    }

    public String getPassCode() {
        return passCode;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.userID != null ? this.userID.hashCode() : 0);
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
        final UserCredentials other = (UserCredentials) obj;
        if ((this.userID == null) ? (other.userID != null) : !this.userID.equals(other.userID)) {
            return false;
        }
        return true;
    }
}

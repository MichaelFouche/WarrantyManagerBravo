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
public final class AddUser {
    private String firstname;
    private String lastname;
    private String id;
    private List<AddUser> address;
    private String contact;
    
    private AddUser(){
        
    }
    private AddUser(Builder builder){
        firstname = builder.firstname;
        lastname = builder.lastname;
        id = builder.id;
        address = builder.address;
        contact = builder.contact;
    }
    
    public static class Builder{
        private String firstname;
        private String lastname;
        private String id;
        private List<AddUser> address;
        private String contact;
                
        public Builder(){
        }
        
        public Builder firstname(String value){
            firstname = value;
            return this;
        }
        public Builder lastname(String value){
            lastname = value;
            return this;
        }
        public Builder id(String value){
            id = value;
            return this;
        }
        public Builder address(List<AddUser> value){
            address = value;
            return this;
        }
        public Builder contact(String value){
            contact = value;
            return this;
        }
        public AddUser build(){
            return new AddUser(this);
        }
        
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getId() {
        return id;
    }

    public List<AddUser> getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final AddUser other = (AddUser) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}

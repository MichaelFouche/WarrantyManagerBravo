/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.service.crud.Impl;

import java.util.List;
import michaelfouche.warrantymanagerbravo.model.Login.UserCredentials;
import michaelfouche.warrantymanagerbravo.service.crud.UserCredentialsCrudservice;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author foosh
 */
public class UserCredentialsCrudServiceImpl implements UserCredentialsCrudservice{
       @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public UserCredentials find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public UserCredentials persist(UserCredentials entity) {

        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public UserCredentials merge(UserCredentials entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public UserCredentials remove(UserCredentials entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<UserCredentials> findAll() {
        return null;
    }
}

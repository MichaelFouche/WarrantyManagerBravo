/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.service.crud.Impl;

import java.util.List;
import michaelfouche.warrantymanagerbravo.model.User.AddUser;
import michaelfouche.warrantymanagerbravo.service.crud.AddUserCrudservice;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author foosh
 */
public class AddUserCrudServiceImpl implements AddUserCrudservice{
     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public AddUser find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public AddUser persist(AddUser entity) {

        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public AddUser merge(AddUser entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public AddUser remove(AddUser entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<AddUser> findAll() {
        return null;
    }
}

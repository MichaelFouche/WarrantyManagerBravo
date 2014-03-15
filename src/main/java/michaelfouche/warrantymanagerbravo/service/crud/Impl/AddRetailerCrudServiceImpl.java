/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.service.crud.Impl;

import michaelfouche.warrantymanagerbravo.service.crud.AddRetailerCrudservice;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import michaelfouche.warrantymanagerbravo.model.Retailer.AddRetailer;
/**
 *
 * @author foosh
 */
public class AddRetailerCrudServiceImpl implements AddRetailerCrudservice{
      @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public AddRetailer find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public AddRetailer persist(AddRetailer entity) {

        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public AddRetailer merge(AddRetailer entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public AddRetailer remove(AddRetailer entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<AddRetailer> findAll() {
        return null;
    }
}

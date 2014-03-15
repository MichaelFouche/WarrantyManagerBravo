/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.service.crud.Impl;

import michaelfouche.warrantymanagerbravo.service.crud.AddWarrantyCrudservice;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import michaelfouche.warrantymanagerbravo.model.Warranty.AddWarranty;
/**
 *
 * @author foosh
 */
public class AddWarrantyCrudServiceImpl implements AddWarrantyCrudservice{
      @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public AddWarranty find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public AddWarranty persist(AddWarranty entity) {

        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public AddWarranty merge(AddWarranty entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public AddWarranty remove(AddWarranty entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<AddWarranty> findAll() {
        return null;
    }
}

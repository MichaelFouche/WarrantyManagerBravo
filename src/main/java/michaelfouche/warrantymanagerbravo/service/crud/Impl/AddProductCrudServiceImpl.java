/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.service.crud.Impl;


import michaelfouche.warrantymanagerbravo.model.Product.AddProduct;
import michaelfouche.warrantymanagerbravo.service.crud.AddProductCrudservice;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 *
 * @author foosh
 */
public class AddProductCrudServiceImpl implements AddProductCrudservice{
      @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public AddProduct find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public AddProduct persist(AddProduct entity) {

        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public AddProduct merge(AddProduct entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public AddProduct remove(AddProduct entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<AddProduct> findAll() {
        return null;
    }
}

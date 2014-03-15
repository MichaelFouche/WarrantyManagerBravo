/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.config;

import michaelfouche.warrantymanagerbravo.service.crud.AddProductCrudservice;
import michaelfouche.warrantymanagerbravo.service.crud.AddRetailerCrudservice;
import michaelfouche.warrantymanagerbravo.service.crud.AddUserCrudservice;
import michaelfouche.warrantymanagerbravo.service.crud.AddWarrantyCrudservice;
import michaelfouche.warrantymanagerbravo.service.crud.Impl.AddProductCrudServiceImpl;
import michaelfouche.warrantymanagerbravo.service.crud.Impl.AddRetailerCrudServiceImpl;
import michaelfouche.warrantymanagerbravo.service.crud.Impl.AddUserCrudServiceImpl;
import michaelfouche.warrantymanagerbravo.service.crud.Impl.AddWarrantyCrudServiceImpl;
import michaelfouche.warrantymanagerbravo.service.crud.Impl.UserCredentialsCrudServiceImpl;
import michaelfouche.warrantymanagerbravo.service.crud.UserCredentialsCrudservice;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author foosh
 */
@Configurable
public class AppConfig {
    @Bean(name = "questionCrudService")
    public  UserCredentialsCrudservice getUserCredentialsCrudService(){
        return new UserCredentialsCrudServiceImpl();
    }
    @Bean(name="addUserCrudService")
    public AddUserCrudservice getUserCrudService(){
        return new AddUserCrudServiceImpl();
    }
    @Bean(name="addProductCrudService")
    public AddProductCrudservice getProductCrudService(){
        return new AddProductCrudServiceImpl();
    }
    @Bean(name="addWarrantyCrudService")
    public AddWarrantyCrudservice getWarrantyCrudService(){
        return new AddWarrantyCrudServiceImpl();
    }
    @Bean(name="addRetailerCrudService")
    public AddRetailerCrudservice getRetailerCrudService(){
        return new AddRetailerCrudServiceImpl();
    }
}

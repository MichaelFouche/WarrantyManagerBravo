/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.config;

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
   /* @Bean(name="authorCrudService")
    public AuthorCrudservice getAuthorCrudService(){
        return new AuthorCrudServiceImpl();
    }*/
}

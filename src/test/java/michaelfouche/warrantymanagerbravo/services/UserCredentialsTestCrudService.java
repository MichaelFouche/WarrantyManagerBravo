/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.services;

import michaelfouche.warrantymanagerbravo.model.Login.UserCredentials;
import michaelfouche.warrantymanagerbravo.service.crud.UserCredentialsCrudservice;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author foosh
 */
public class UserCredentialsTestCrudService {
    
     @Mock
    UserCredentialsCrudservice crudService;
     
     @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(UserCredentialsCrudservice.class);
    }

    @Test
    public void testCreate() throws Exception {
        UserCredentials uc = new UserCredentials.Builder() 
            .userID("123321")
            .passCode("passw")
            
            .build();
        UserCredentials returnQuestion = crudService.persist(uc);
        when(crudService.persist(uc)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(uc);


    }

    @Test
    public void testRead() throws Exception {
         UserCredentials uc = new UserCredentials.Builder() 
            .userID("123321")
            .passCode("passw")
            
            .build();
        UserCredentials returnQuestion = crudService.find(uc.getUserID());
        when(crudService.find(uc.getUserID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(uc.getUserID());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

         UserCredentials uc = new UserCredentials.Builder() 
            .userID("123321")
            .passCode("passw")
            
            .build();

        UserCredentials returnQuestion = crudService.merge(uc);
        when(crudService.merge(uc)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(uc);

    }

    @Test
    public void testDelete() throws Exception {

        UserCredentials uc = new UserCredentials.Builder() 
            .userID("123321")
            .passCode("passw")
            
            .build();
        UserCredentials returnQuestion = crudService.remove(uc);
        when(crudService.remove(uc)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(uc);

    }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.services;

import michaelfouche.warrantymanagerbravo.model.User.AddUser;
import michaelfouche.warrantymanagerbravo.service.crud.AddUserCrudservice;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author foosh
 */
public class AddUserTestCrudService {
    
    @Mock
    AddUserCrudservice crudService;
     
     @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(AddUserCrudservice.class);
    }

    @Test
    public void testCreate() throws Exception {
        AddUser uc = new AddUser.Builder() 
            .userID("123321")
            .passCode("passw")
            
            .build();
        AddUser returnQuestion = crudService.persist(uc);
        when(crudService.persist(uc)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(uc);


    }

    @Test
    public void testRead() throws Exception {
         AddUser uc = new AddUser.Builder() 
            .userID("123321")
            .passCode("passw")
            
            .build();
        AddUser returnQuestion = crudService.find(uc.getUserID());
        when(crudService.find(uc.getUserID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(uc.getUserID());

    }

    @Test
    public void testUpdate() throws Exception {
       

         AddUser uc = new AddUser.Builder() 
            .userID("123321")
            .passCode("passw")
            
            .build();

        AddUser returnQuestion = crudService.merge(uc);
        when(crudService.merge(uc)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(uc);

    }

    @Test
    public void testDelete() throws Exception {

        AddUser uc = new AddUser.Builder() 
            .userID("123321")
            .passCode("passw")
            
            .build();
        AddUser returnQuestion = crudService.remove(uc);
        when(crudService.remove(uc)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(uc);

    }
}
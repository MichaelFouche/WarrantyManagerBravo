/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.services;

import michaelfouche.warrantymanagerbravo.model.Warranty.AddWarranty;
import michaelfouche.warrantymanagerbravo.service.crud.AddWarrantyCrudservice;
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
public class AddWarrantyTestCrudService {
    
    @Mock
    AddWarrantyCrudservice crudService;
     
     @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(AddWarrantyCrudservice.class);
    }

    @Test
    public void testCreate() throws Exception {
        AddWarranty uc = new AddWarranty.Builder() 
            .userID("123321")
            .passCode("passw")
            
            .build();
        AddWarranty returnQuestion = crudService.persist(uc);
        when(crudService.persist(uc)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(uc);


    }

    @Test
    public void testRead() throws Exception {
         AddWarranty uc = new AddWarranty.Builder() 
            .userID("123321")
            .passCode("passw")
            
            .build();
        AddWarranty returnQuestion = crudService.find(uc.getUserID());
        when(crudService.find(uc.getUserID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(uc.getUserID());

    }

    @Test
    public void testUpdate() throws Exception {
       

         AddWarranty uc = new AddWarranty.Builder() 
            .userID("123321")
            .passCode("passw")
            
            .build();

        AddWarranty returnQuestion = crudService.merge(uc);
        when(crudService.merge(uc)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(uc);

    }

    @Test
    public void testDelete() throws Exception {

        AddWarranty uc = new AddWarranty.Builder() 
            .userID("123321")
            .passCode("passw")
            
            .build();
        AddWarranty returnQuestion = crudService.remove(uc);
        when(crudService.remove(uc)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(uc);

    }
}
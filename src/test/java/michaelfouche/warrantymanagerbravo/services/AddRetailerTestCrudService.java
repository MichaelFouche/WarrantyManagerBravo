/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.services;

import michaelfouche.warrantymanagerbravo.model.Retailer.AddRetailer;
import michaelfouche.warrantymanagerbravo.service.crud.AddRetailerCrudservice;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;
import org.testng.Assert;
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
public class AddRetailerTestCrudService {
    
    @Mock
    AddRetailerCrudservice crudService;
     
     @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(AddRetailerCrudservice.class);
    }

    @Test
    public void testCreate() throws Exception {
        AddRetailer uc = new AddRetailer.Builder() 
            .name("Vodacom-Somerset-01")
            .city("Somerset West")
            .province("Western Cape")
            .build();
      
        AddRetailer returnQuestion = crudService.persist(uc);
        when(crudService.persist(uc)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(uc);


    }

    @Test
    public void testRead() throws Exception {
         AddRetailer uc = new AddRetailer.Builder() 
            .name("Vodacom-Somerset-01")
            .city("Somerset West")
            .province("Western Cape")
            .build();
        AddRetailer returnQuestion = crudService.find(uc.getName());
        when(crudService.find(uc.getName())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(uc.getName());

    }

    @Test
    public void testUpdate() throws Exception {
       AddRetailer uc = new AddRetailer.Builder() 
            .name("Vodacom-Somerset-01")
            .city("Somerset West")
            .province("Western Cape")
            .build();

        AddRetailer returnQuestion = crudService.merge(uc);
        when(crudService.merge(uc)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(uc);

    }

    @Test
    public void testDelete() throws Exception {
        AddRetailer uc = new AddRetailer.Builder() 
            .name("Vodacom-Somerset-01")
            .city("Somerset West")
            .province("Western Cape")
            .build();
        AddRetailer returnQuestion = crudService.remove(uc);
        when(crudService.remove(uc)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(uc);

    }
}
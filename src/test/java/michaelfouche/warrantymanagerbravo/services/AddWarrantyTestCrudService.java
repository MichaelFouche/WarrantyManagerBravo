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
import static org.mockito.Mockito.when;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
            .productSn("123BA321")
            .type("Hardware") //for example: hardware, water damage, software 
            .duration(356)  //days
            .build();
        AddWarranty returnQuestion = crudService.persist(uc);
        when(crudService.persist(uc)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(uc);


    }

    @Test
    public void testRead() throws Exception {
         AddWarranty uc = new AddWarranty.Builder() 
            .productSn("123BA321")
            .type("Hardware") //for example: hardware, water damage, software 
            .duration(356)  //days
            .build();
        AddWarranty returnQuestion = crudService.find(uc.getProductSn());
        when(crudService.find(uc.getProductSn())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(uc.getProductSn());

    }

    @Test
    public void testUpdate() throws Exception {
       AddWarranty uc = new AddWarranty.Builder() 
            .productSn("123BA321")
            .type("Hardware") //for example: hardware, water damage, software 
            .duration(356)  //days
            .build();
        AddWarranty returnQuestion = crudService.merge(uc);
        when(crudService.merge(uc)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(uc);

    }

    @Test
    public void testDelete() throws Exception {
        AddWarranty uc = new AddWarranty.Builder() 
            .productSn("123BA321")
            .type("Hardware") //for example: hardware, water damage, software 
            .duration(356)  //days
            .build();
        AddWarranty returnQuestion = crudService.remove(uc);
        when(crudService.remove(uc)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(uc);

    }
}
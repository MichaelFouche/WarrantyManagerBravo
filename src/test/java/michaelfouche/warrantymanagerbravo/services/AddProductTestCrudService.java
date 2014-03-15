/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import michaelfouche.warrantymanagerbravo.model.Product.AddProduct;
import michaelfouche.warrantymanagerbravo.service.crud.AddProductCrudservice;
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
public class AddProductTestCrudService {
    
    @Mock
    AddProductCrudservice crudService;
     
     @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(AddProductCrudservice.class);
    }

    @Test
    public void testCreate() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = sdf.parse("04/11/2013");
        AddProduct addproduct = new AddProduct.Builder() 
            .model("S4")
            .sn("123BA321")
            .manufacturer("Samsung")
            .purchaseDate(d)
            .retailer("Vodacom-Somerset-01")
            .build();
        AddProduct returnQuestion = crudService.persist(addproduct);
        when(crudService.persist(addproduct)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(addproduct);


    }

    @Test
    public void testRead() throws Exception {
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = sdf.parse("04/11/2013");
        AddProduct uc = new AddProduct.Builder() 
            .model("S4")
            .sn("123BA321")
            .manufacturer("Samsung")
            .purchaseDate(d)
            .retailer("Vodacom-Somerset-01")
            .build();
        AddProduct returnQuestion = crudService.find(uc.getSN());
        when(crudService.find(uc.getSN())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(uc.getSN());

    }

    @Test
    public void testUpdate() throws Exception {
       

         AddProduct uc = new AddProduct.Builder() 
            .userID("123321")
            .passCode("passw")
            
            .build();

        AddProduct returnQuestion = crudService.merge(uc);
        when(crudService.merge(uc)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(uc);

    }

    @Test
    public void testDelete() throws Exception {

        AddProduct uc = new AddProduct.Builder() 
            .userID("123321")
            .passCode("passw")
            
            .build();
        AddProduct returnQuestion = crudService.remove(uc);
        when(crudService.remove(uc)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(uc);

    }
}
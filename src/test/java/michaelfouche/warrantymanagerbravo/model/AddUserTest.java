/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model;

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
public class AddUserTest {
    
    public AddUserTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception {
       AddUser adduser = new AddUser.Builder() 
            .firstname("Mike")
            .lastname("Foosh")
            .id("9107085078081")
            .contact("0724857747")
            .build();
       Assert.assertEquals(adduser.getFirstname(),"Mike");
       
        /*Question q = new Question.Builder("Why is java so hard?").id("10").build();
        Assert.assertEquals(q.getQuestion(),"Why is java so hard?");
        Assert.assertEquals(q.getId(),"10");*/
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
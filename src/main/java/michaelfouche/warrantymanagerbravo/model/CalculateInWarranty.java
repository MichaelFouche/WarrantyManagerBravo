/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author foosh
 */
public class CalculateInWarranty extends DaysDifference{
    
    public CalculateInWarranty(){
        
    }
    
    public boolean calculateInWarranty(Date purchaseDate, int warrantyLength){
        int daysDifference = (int)calculateDaysDifference(purchaseDate);
        //System.out.print(".."+daysDifference+"..");
        if(daysDifference<warrantyLength){
            //Still in warranty
            return true;
        }
        else{
            //out of warranty
            return false;
        }
       
    }
            
}

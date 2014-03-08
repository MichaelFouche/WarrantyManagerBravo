/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanagerbravo.model.Warranty;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author foosh
 */
public class DaysDifference {
    public long calculateDaysDifference(Date purchaseDate){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date now = (new Date());
        return (now.getTime() - purchaseDate.getTime())/(1000 * 60 * 60 * 24) ;    
    }
}

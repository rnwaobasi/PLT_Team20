/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plt.pkgfinal.project;

/**
 *
 * @author Assata
 */
public class DateTime {
    
    //merges DayBlock and TimeBlock into one data type of dates and times
    DayBlock db;
    TimeBlock tb;
    
    public DateTime(DayBlock givenDB, TimeBlock givenTB)
    {
       db = givenDB;
       tb = givenTB;
    }
     
    public DayBlock getDayBlock()
    {
        return db;
    }
    
    public TimeBlock getTimeBlock()
    {
        return tb;
    }
    
    public String toString()
    {
        String dtString = "Block is on ";
        dtString += db.toString();
        dtString += tb.toString();
              
        return dtString;
    }
    
    //no toString method is given specific to just days or just times
    //because these are available by calling this.getTimeBlock.toString 
    //and this.getDayBlock.
    
    
}

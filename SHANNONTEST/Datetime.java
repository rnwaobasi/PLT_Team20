
/**
 *
 * @author Assata
 */
public class Datetime {
    
    //merges Dayblock and Timeblock into one data type of dates and times
    Dayblock db;
    Timeblock tb;
    
    public Datetime(Dayblock givenDB, Timeblock givenTB)
    {
       db = givenDB;
       tb = givenTB;
    }
     
    public Dayblock getDayblock()
    {
        return db;
    }
    
    public Timeblock getTimeblock()
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
    //because these are available by calling this.getTimeblock.toString 
    //and this.getDayblock.
    
    
}

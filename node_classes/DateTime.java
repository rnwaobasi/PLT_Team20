
public class Datetime {
    
    //merges Dayblock and Timeblock into one data type of dates and times
    Dayblock db;
    Timeblock tb;
    
    public Datetime(Dayblock givenDB, Timeblock givenTB)
    {
       db = givenDB;
       tb = givenTB;
    }
      
    public String toString()
    {
        String dtString = "Block is on ";
        dtString += db.toString();
        dtString += tb.toString();
              
        return dtString;
    }
    
    
}

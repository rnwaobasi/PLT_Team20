
public class Datetime implements Comparable<Datetime>{
    
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
        String dtString = "";
        dtString += db.toString() + " ";
        dtString += tb.toString();
              
        return dtString;
    }
    
    public boolean conflicts(Datetime that)
    {
        for (char thisDay: this.db.days)
        {
            if(that.db.has(thisDay))
            {
                if(that.tb.conflicts(this.tb))
                    //System.out.println()
                    return true;
            }
                
        }
            
        return false;
    }
    
    public boolean equals(Object o){
		if (this == o) {
			return true;
		}
		if (o == null || this.getClass() != o.getClass()) {
			return false;
		}
		Datetime that = (Datetime) o;
		return ( this.db.equals(that.db) && this.tb.equals(that.tb) );
	}
	
	public int compareTo(Datetime that){
		if (this.equals(that)){
			return 0;
		}
		else {
			return -1;
		}
	}
    
    
}

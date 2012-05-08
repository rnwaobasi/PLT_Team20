
public class Time implements Comparable<Time>{
    
    int time;
    
    public Time(String timeStr){
        boolean containsColon = false;
        int colonPosition = 1000;
        

        //remove colon
        for (int i = 0; i< timeStr.length(); i++)
        {
            if (timeStr.charAt(i) == ':')
            {
                containsColon = true;
                colonPosition = i;
            }      
        }
        if (containsColon)
            timeStr = timeStr.substring(0,colonPosition) + timeStr.substring(colonPosition + 1, timeStr.length());
        
 

       //add zeros

      /*  if(timeStr.length() != 4 && timeStr.length() !=3)
            throw new Exception ("This is not a valid time.");
        */ 
        time = Integer.parseInt(timeStr);
    }
    
    public boolean lessThan(Time that)
    {
        if(this.time < that.time)
            return true;
        else
            return false;
    }
    
    public boolean greaterThan(Time that)
    {
        if(this.time > that.time)
            return true;
        else
            return false;
    }
    
    public String toString()
    {
        String timeStr;
        String temp = Integer.toString(time);
        
        //put colon in proper location
        if (temp.length() ==3)
            timeStr = temp.substring(0,1) + ':' + temp.substring(1);
        else if(temp.length() ==4)
            timeStr = temp.substring(0,2) + ':' + temp.substring(2);
        else
            timeStr = null;
        
        return timeStr;
    }
    
    public boolean equals(Object o){
		if (this == o) {
			return true;
		}
		if (o == null || this.getClass() != o.getClass()) {
			return false;
		}
		Time that = (Time) o;
		return (this.time == that.time);
	}
	
	public int compareTo(Time that){
		if (this.equals(that)){
			return 0;
		}
		else if (this.greaterThan(that)){
			return 1;
		}
		else {
			return -1;
		}
	}
        
}


import java.util.ArrayList;

/**
 *
 * @author Assata
 */


public class Dayblock {
    
    ArrayList<String> days;
    
        public Dayblock(ArrayList<String> givenDays) {
                     
            days = givenDays;
        }
       

	public boolean has(String d)
	{
		Boolean exists = false;
		for (String x : days)
		{
			if(x.equals(d))
			{
				exists = true;
				break;
			}
		}
		return exists;
	}

	public String toString() {
		String dayString = "";
		for (String x: days)
		{
			dayString += x + ", ";
		}
                
                dayString += ".";
                return dayString;
	}
}

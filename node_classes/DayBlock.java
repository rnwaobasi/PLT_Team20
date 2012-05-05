/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plt.pkgfinal.project;

import java.util.ArrayList;

/**
 *
 * @author Assata
 */


public class DayBlock {
    
    ArrayList<Day> days;
    
        public DayBlock(ArrayList<Day> givenDays) {
                     
            days = givenDays;
        }
       

	public boolean has(Day d)
	{
		Boolean exists = false;
		for (Day x : days)
		{
			if(x == d)
			{
				exists = true;
				break;
			}
		}
		return exists;
	}

	public String toString() {
		String dayString = "";
		for (Day x: days)
		{
			dayString += x.toString() + ", ";
		}
                
                dayString += ".";
                return dayString;
	}
}

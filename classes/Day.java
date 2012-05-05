/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package plt.pkgfinal.project;

import java.lang.Throwable;

/**
 *
 * @author Assata
 */
public class Day {
    
    char day;
    
    public Day(char givenDay) throws Exception
    {
        //we should decide how we will do error handling, and make this a more specific exception
        if (givenDay != 'M' && givenDay != 'T' && givenDay != 'W' && givenDay != 'R' && givenDay != 'F')
            throw new Exception("This is not a day!");
        
        else
            day = givenDay;
    }
    
    public String toString ()
    {
        String dayName = "";
        if (day == 'M')
            dayName = "Monday";
        else if (day == 'T')
            dayName = "Tuesday";
        else if (day == 'W')
            dayName = "Wednesday";
        else if (day == 'R')
            dayName = "Thursday";
        else if (day == 'F')
            dayName = "Friday";
       
        return dayName;
    }
    
}

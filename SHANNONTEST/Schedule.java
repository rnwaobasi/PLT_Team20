
import java.util.ArrayList;

public class Schedule {
    
    String name;
	String conflicts;
    ArrayList<Course> courses;
	double credits;    

    public Schedule(String sName)
    {
        name = sName;
	conflicts = "";
        courses = new ArrayList<Course>();
	credits = 0;
    }
    
    public double numCredits()
    {
        /*int credits = 0;
        
        for (Course c: courses)
        {
            credits += c.credits;
        }*/
        return credits;
    }
        
    public int numCourses()
    {
        return courses.size();
    }
    
    public int numCourses(Dayblock db)
    {
        //parse thru each course
        //check if courses' dayblock contains each day in db
        int numCourses = 0;
        boolean isContained = false;
                
        for (Course c: courses)
        {
            for (char ch: db.days)
                if(c.getDayblock().has(ch))
                    isContained = true;
            
            if(isContained)
                numCourses++;
        }
        
        return numCourses;
    }
    
    public Course getCourse(String cName) throws Exception
    {
        boolean found = false;
        
        for (Course c: courses)
        {
            if (c.name.equals(cName))
            {
                found = true;
                return c;
            }
        }
        
        if (!found)
            throw new Exception("Class not found!");
        else
            return null;
    }
    
    public boolean add(Course c)
    {
        for (Course x: courses)
        {
            if(c.getDatetime().conflicts(x.getDatetime())) {
                conflicts += c.name + " conflicts with " +
		x.name + "\n";
		return false;
		}
        }
        
        courses.add(c);
	credits += c.credits;
        return true;
    }

    public void printConflicts()
    {
        System.out.println(conflicts);
    }

    public String toString()
    {
        String clString = "\nYour generated schedule contains: ";
        for (Course c: courses)
        {
            clString += "\n" + c.name + ": " + c.getDatetime() + " " + c.numCredits() + " points";
        }
        clString += "\n";
        clString += "\nTotal semester credits: " + numCredits();
        clString += "\nTotal semester courses: " + numCourses();
        clString += "\nAren't you glad you found Chronos?\n";
        return clString;
    }
    
    
    
}

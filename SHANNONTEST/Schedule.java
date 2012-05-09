
import java.util.ArrayList;

public class Schedule {
    
    String name;
    ArrayList<Course> courses;
	double credits;    

    public Schedule(String sName)
    {
        name = sName;
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
            if(c.getDatetime().conflicts(x.getDatetime()))
                return false;
        }
        
        courses.add(c);
	credits += c.credits;
        return true;
    }

    public void print()
    {
        System.out.println(toString());
    }

    public String toString()
    {
        String clString = name + "[ ";
        for (Course c: courses)
        {
            clString += c.name + " ";
        }
        clString += "]";
        return clString;
    }
    
    
    
}

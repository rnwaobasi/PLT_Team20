
import java.util.ArrayList;
public class Courselist {
    String name;
    ArrayList<Course> courses;
    
    public Courselist(String n)
    {
        name = n;
        courses = new ArrayList<Course>();
    }
    
    public void add(Course c)
    {
        courses.add(c);
    }
    
    
    public int numCredits()
    {
        int credits = 0;
        
        for (Course c: courses)
        {
            credits += c.credits;
        }
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
        Course courseFound;
        
        for (Course c: courses)
        {
            if (c.name.equals(cName))
            {
                found = true;
                courseFound = c;
                break;
            }
        }
        
        if (!found)
            throw new Exception("Class not found!");
        
        return courseFound;
    }
    
    public String toString()
    {
        String clString = name + " contains ";
        for (Course c: courses)
        {
            clString += c.name + " ";
        }
        clString += ".\n";
        return clString;
    }
}

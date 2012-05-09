
import java.util.ArrayList;
public class Courselist implements Comparable<Courselist>{
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
        /*boolean found = false;
        
        for (Course c: courses)
        {
            if (c.name.equals(cName))
            {
                found = true;
                return c;
            }
        }
        
        //if (!found)
        //    throw new Exception("Class not found!");
        //else
            return null;*/

	Course result = null;
	for (int i = 0; i < courses.size(); i++) {
		Course current = courses.get(i);
		if (current.name.equals(cName)) {
			result = current;
		}
	}
	return result;
    }
    
    public String toString()
    {
        String clString = name + " contains ";
        for (Course c: courses)
        {
            clString += c.name + " ";
        }
        clString += ".";
        return clString;
    }
    
    public boolean equals(Object o){
		if (this == o) {
			return true;
		}
		if (o == null || this.getClass() != o.getClass()) {
			return false;
		}
		Courselist that = (Courselist) o;
		if (this.numCourses() == that.numCourses()) {
			for (int i = 0; i < that.numCourses(); i++) {
				if ( !(this.courses.contains(that.courses.get(i))) ) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
	public int compareTo(Courselist that){
		if (this.equals(that)){
			return 0;
		}
		else {
			return -1;
		}
	}
    
        
}

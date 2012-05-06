import java.util.ArrayList;
public class Course implements Comparable<Course>{
    String name;
    double credits;
    ArrayList<Datetime> sections;
    int selectedSection; //array index of sections
    
    public Course(String tempName, double tempCredits, ArrayList<Datetime> tempSections)
    {
        name = tempName;
        credits = tempCredits;
        sections = tempSections;
        selectedSection = 0;
    }
    
    public Datetime getDatetime()
    {
        return sections.get(selectedSection);
    }
    
    public Dayblock getDayblock()
    {
        return sections.get(selectedSection).db;
    }
    
    public Timeblock getTimeblock()
    {
        return sections.get(selectedSection).tb;
    }
    
    public Time getStartTime()
    {
        return this.getTimeblock().start;
    }
    
    public Time getEndTime()
    {
        return this.getTimeblock().end;
    }
    
    //this method seems unneccessary--should we delete
    public int numSections()
    {
        return sections.size();
    }
    
    public String toString()
    {
        String cString = name + "has sections: ";
        for (Datetime dt1: sections)
            cString += dt1.toString() + ", ";
        
        return cString;
    }
    
     public boolean equals(Object o){
		if (this == o) {
			return true;
		}
		if (o == null || this.getClass() != o.getClass()) {
			return false;
		}
		Course that = (Course) o;
		if (this.name.equals(that.name) && 
		this.credits == that.credits && 
		this.sections.equals(that.sections)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int compareTo(Course that){
		if (this.equals(that)){
			return 0;
		}
		else {
			return -1;
		}
	}
    
}
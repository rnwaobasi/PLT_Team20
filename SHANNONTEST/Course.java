
import java.util.ArrayList;
public class Course {
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
    
    
    
}

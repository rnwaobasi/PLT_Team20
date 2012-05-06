
public class Timeblock {
    
    Time start;
    Time end;
    
    public Timeblock(Time startTime, Time endTime){
        start = startTime;
        end = endTime;
    }
    
    public boolean conflicts(Timeblock that)
    {
        if (that.start.greaterThan(this.start) && that.start.lessThan(this.start)
                || that.end.greaterThan(this.start) && that.end.lessThan(this.end))
            return true;
        else
            return false;
    }
    
    public String toString(){
        return "From " + start.toString() + " to " + end.toString() + ".\n";
    }
    
}

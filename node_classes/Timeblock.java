public class Timeblock {
    
    Time start;
    Time end;
    
    public Timeblock(Time startTime, Time endTime){
        start = startTime;
        end = endTime;
    }
    
    public String toString(){
        return "From " + start.toString() + " to " + end.toString() + ".\n";
    }
    
}
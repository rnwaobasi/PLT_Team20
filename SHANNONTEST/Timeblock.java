public class Timeblock implements Comparable<Timeblock>{
    
    Time start;
    Time end;
    
    public Timeblock(Time startTime, Time endTime){
        start = startTime;
        end = endTime;
    }
    
    public boolean conflicts(Timeblock that)
    {
        if (that.start.greaterThan(this.start) && that.start.lessThan(this.end))
                return true;
        else if (that.end.greaterThan(this.start) && that.end.lessThan(this.end))
            return true;
        else if (that.start.equals(this.start))
            return true;
        else if (that.end.equals(this.end))
            return true;
        else
            return false;
    }
    
    public String toString(){
        return "From " + start.toString() + " to " + end.toString() + ".\n";
    }
    
    public boolean equals(Object o){
		if (this == o) {
			return true;
		}
		if (o == null || this.getClass() != o.getClass()) {
			return false;
		}
		Timeblock that = (Timeblock) o;
		return (this.start.equals(that.start) && this.end.equals(that.end));
	}
	
	public int compareTo(Timeblock that){
		if (this.equals(that)){
			return 0;
		}
		else {
			return -1;
		}
	}
}
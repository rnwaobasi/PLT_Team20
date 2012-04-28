

public class classes {
	
	String name;
	//holds multiple days for multiple sessions of a class
	String[][] days = new String[100][100];
	//stores multiple dates and times for different sessions
	String[] start = new String[100];
	String[] end = new String[100];
	//String[] session;
	int credits;

	   String[][] timesStart = new String[100][2];
	   String[][] timesEnd = new String[100][2];
	   //delimiter for split
	   String delimiter = ":";
	   
	   
	//creates object for a class
	public classes(String name){
		this.name = name;
	}
	
	public void setDays(String[] days, int session){
		this.days[session] = days;
	}
	
	public void setStart(String start, int session){
		this.start[session] = start;
		timesStart[session] = start.split(delimiter);
	}
	
	public void setEnd(String end, int session){
		this.end[session] = end;
		timesEnd[session] = end.split(delimiter);
	}
	
	public void setCredits(String credits){
		this.credits = Integer.parseInt(credits);
	}
	
	public String getName(){
		return name;
	}
	
	public String[] getDays(int session){
		return days[session];
	}
	
	public int getCredits(){
		return credits;
	}
	
	public String getStartH(int session){
		//return start[session];
		return timesStart[session][0];
	}
	
	public String getStartM(int session){
		//return start[session];
		return timesStart[session][1];
	}
	
	public String getEndH(int session){
		//return end[session];
		return timesEnd[session][0];
	}
	
	public String getEndM(int session){
		//return end[session];
		return timesEnd[session][1];
	}
}

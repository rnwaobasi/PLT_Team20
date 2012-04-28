

public class classes {
	
	String name;
	//holds multiple days for multiple sessions of a class
	String[][] days = new String[100][100];
	//stores multiple dates and times for different sessions
	String[] start = new String[100];
	String[] end = new String[100];
	//String[] session;
	int credits;

	//creates object for a class
	public classes(String name){
		this.name = name;
	}
	
	public void setDays(String[] days, int session){
		this.days[session] = days;
	}
	
	public void setStart(String start, int session){
		this.start[session] = start;
	}
	
	public void setEnd(String end, int session){
		this.end[session] = end;
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
		return start[session];
	}
	
	public String getStartM(int session){
		return start[session];
	}
	
	public String getEndH(int session){
		return end[session];
	}
	
	public String getEndM(int session){
		return end[session];
	}
}

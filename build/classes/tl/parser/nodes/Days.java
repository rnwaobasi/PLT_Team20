package chronos;

import java.util.ArrayList;

public class Days {
	private ArrayList<Day> days;
	
	public Days(String[] s){
		for( int i = 0; i < s.length; i++){
			days.add(new Day(s[i]));
		}
	}
	
	
	public boolean contains(Day d){
		return days.contains(d);
	}
	
	public ArrayList<Day> getDays(){
		return this.days;
	}
	
	public String toString(){
		String returnVal = "";
		for( int i = 0; i < days.size(); i++){
			returnVal += days.get(i).toString();
		}
		return returnVal;
	}
	
	public boolean equals(Object o){
		if (this == o) {
			return true;
		}
		if (o == null || this.getClass() != o.getClass()) {
			return false;
		}
		Days that = (Days)o;
		if (days.size() != that.getDays().size()){
			return false;
		}
		for (int i = 0; i < days.size(); i++ ){
			if (days.get(i) != that.getDays().get(i)){
				return false;
			}
		}
		return true;
	}
	
}

package chronos.nodes;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Scheduler{
	int sectionChecker = 0;
	String input = null;
	int objTracker = 0;
	double Credits = 0.0;
	//char[] tempChar = null;
	String className;
	ArrayList<Datetime> date = new ArrayList<Datetime>();
	//ArrayList<Datetime> date;
	Dayblock dayb;
	Timeblock timeb;
	Courselist courselist;
	Course course = new Course(className, Credits, date) ;
	
	public Scheduler(String input){
		this.input = input;
		courselist = new Courselist(this.input);
		generateCourses(input);
	}
	
	public void generateCourses(String input){

		   try{
			   String strLine;
			   int counter = 0;
			   
			   // open input.txt
			   FileInputStream fstream = new FileInputStream(input);
			   
			   // get object of the stream
			   DataInputStream in = new DataInputStream(fstream);
			   BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  
			   //Read File Line By Line
			   while ((strLine = br.readLine()) != null)   {
			   	if(Pattern.matches("\\d+", strLine)){
				   Double temp = new Double(strLine);
				   Credits = temp;
				   course = new Course(className, Credits, date);
				   courselist.add(course);
				   
				   System.out.println(course.toString());
				   objTracker++;
				   counter = 0;
			   	}
			   	else if(strLine.isEmpty()){
				   //do nothing
				   
			   	}
			   	else if(counter == 0 ){
				   className = strLine;
				   counter = 1;
				   date = new ArrayList<Datetime>();
				   
			   	}//end of if counter == 0 
			   	else{
				   StringTokenizer st = new StringTokenizer(strLine);
				   int count = 0;
				   while (st.hasMoreTokens()) {
					   if(count == 0){
					   		String temp = new String(st.nextToken());
							char[] dayArray = temp.toCharArray();
							dayb = new Dayblock(dayArray);
						   	count++;
					   }
					   else if(count == 1){
						   //handle time
						   String[] times;
						   //delimiter for split
						   String delimiter = "-";
						   String temp = new String(st.nextToken());
						   times = temp.split(delimiter);
						   Time timeStart = new Time(times[0]);
						   Time timeEnd = new Time(times[1]);
						   timeb = new Timeblock(timeStart,timeEnd);	
						   date.add(new Datetime(dayb, timeb));
					   }
				     
				   }//end of while
				   counter++;
			   }
			   }//end of try
			   
			   in.close();
			     }catch (Exception e){//Catch exception if any
			   System.err.println("Error: " + e.getMessage());
			   }
			   
	   	}//generate courses method
	   	
	   	public static void main(String args[]) {
	   		Scheduler sched = new Scheduler("input.txt");
	   	}
}
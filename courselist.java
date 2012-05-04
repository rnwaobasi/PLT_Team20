import java.io.*;
import java.util.*;
import java.util.regex.*;


public class courselist {
	String input;
	List<classes> views = new ArrayList<classes>();
	int objTracker = 0;
	
	public courselist(String input){
		this.input = input;
		generateCourses(input);
	}
	
	public courselist(){
		
	}
	
	public List<classes> getCourses(){
		return views;
	}
	
	public int numCourses(){
		return objTracker;
	}
	
	public void addCourse(classes course){
		views.add(course);
	}
	
	public classes getCoursebySection(String name, String section){
		//search for a course to add by name and section
		for (int i=0 ;i <= objTracker; i++){
			
		}
		classes temp = new classes(name);
		return temp;
	}
	
	   public void generateCourses(String input){

		   try{
			   String strLine;
			   int counter = 0;
			   // open input.txt
			   FileInputStream fstream = new FileInputStream("input.txt");
			   
			   // get object of the stream
			   DataInputStream in = new DataInputStream(fstream);
			   BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  
			   //Read File Line By Line
			   while ((strLine = br.readLine()) != null)   {
				   
			   if(Pattern.matches("\\d+", strLine)){
				   //System.out.println("Credits: " + strLine);
				   views.get(objTracker).setCredits(strLine);
				   //System.out.println(views.get(objTracker).getCredits());
				   objTracker++;
				   counter = 0;
			   }
			   else if(strLine.isEmpty()){
				   //System.out.println (strLine);
			   }
			   else if(counter == 0 ){
				   //System.out.println("Class Name: " + strLine);
				   views.add(new classes(strLine));
				   counter = 1;
				   
			   }//end of if counter == 0 
			   else{
				   //System.out.println("\nSession " + counter);
				   StringTokenizer st = new StringTokenizer(strLine);
				   int count = 0;
				   while (st.hasMoreTokens()) {
					   if(count == 0){
						   //System.out.println("Days: ");
						   String temp = new String(st.nextToken());
						   int len = temp.length();
						   String[] days = new String[len];
						   for(int j=0; j<len; j++){
							   if(temp.charAt(j) == 'M'){
								   days[j] = "Monday";
								   //System.out.println("Monday");
							   }
							   else if(temp.charAt(j) == 'T'){
								   days[j] = "Tuesday";
								   //System.out.println("Tuesday");
							   }
							   else if(temp.charAt(j) == 'W'){
								   days[j] = "Wednesday";
								   //System.out.println("Wednesday");
							   }
							   else if(temp.charAt(j) == 'R'){
								   days[j] = "Thurday";
								   //System.out.println("Thursday");
							   }
							   else if(temp.charAt(j) == 'F'){
								   days[j] = "Friday";
								   //System.out.println("Friday");
							   }
							   else{
								   //System.out.println("\"" + temp.charAt(j) + "\" is not a valid school day! Please enter one of M, T, W, R, or F");
							   }
						   }
						   views.get(objTracker).setDays(days, counter);
						   count++;
					   }
					   else{
						   //handle time
						   String[] times;
						   //delimiter for split
						   String delimiter = "-";
						   String temp = new String(st.nextToken());
						   times = temp.split(delimiter);
						   views.get(objTracker).setStart(times[0], counter);
						   views.get(objTracker).setEnd(times[1], counter);
					   }
				     
				   }
				   counter++;
			   }
			   }//end of try
			   
			   in.close();
			     }catch (Exception e){//Catch exception if any
			   System.err.println("Error: " + e.getMessage());
			   }
	   }//generate courses method
}

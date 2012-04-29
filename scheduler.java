import java.io.*;
import java.util.*;
import java.util.regex.*;

public class scheduler {
	   public static void main(String args[]) {
		   List<classes> views = new ArrayList<classes>();
		   int objTracker = 0;

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
						   //System.out.println("Start: " + times[0]);
						   //System.out.println("End: " + times[1]);
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
		   
		   scheduler schedule = new scheduler();
		   //create a 2D array with 5 minute interval for the whole week
		   //5 (num of days in a week) x 28 (num of 5 minute intervals in a day)
		   String calendar[][] = new String[5][288];
		   
		   for(int i = 0; i<objTracker; i++){
			   int session = 1;
			   int row = 0;
			   int startPos = 0;
			   int endPos = 0;
			   while(views.get(i).getStartH(session) != null){
				   System.out.println(views.get(i).getName());
				   //array with day-number representations
				   int[] dayNum = new int[5];
				   int dayCount = 0;
				   int j = 0;
				   boolean noConflict = true;
				   while(j < views.get(i).getDays(session).length && views.get(i).getDays(session)[j] != null){

					   String holder = views.get(i).getDays(session)[j];
					   System.out.println(holder);
					   
					   j++;
					   //System.out.println("Length: " + views.get(i).getDays(session).length);
					   
					 int startH = Integer.parseInt(views.get(i).getStartH(session));
					 int startM = Integer.parseInt(views.get(i).getStartM(session));
					 int endH = Integer.parseInt(views.get(i).getEndH(session));
					 int endM = Integer.parseInt(views.get(i).getEndM(session));
					 
					 //convert object data into array coordinates
					 startPos = (startH*12) + (startM/5);
					 endPos = (endH*12) + (endM/5);
					 //System.out.println(startPos);
					 //System.out.println(endPos);
					 
					 if(holder == "Monday"){
						 row = 0;
					 }
					 else if(holder == "Tuesday"){
						 row = 1;
					 }
					 else if(holder == "Wednesday"){
						 row = 2;
					 }
					 else if(holder == "Thurday"){
						 row = 3;
					 }
					 else if(holder == "Friday"){
						 row = 4;
					 }
					 else{
						 System.out.println("Not a valid day input");
					 }
					 
					 for(int k = startPos; k < endPos; k++){
						 if(calendar[row][k] != null){
							 noConflict = false;
						 }//end of if
					 }//end of for loop
					 
					 dayNum[dayCount] = row;
					 
					 dayCount++;
					 
				   }//end of while
				   if(noConflict == true){
						 for(int k = startPos; k < endPos; k++){
							 //System.out.println(row);
							 //System.out.println("Day Count: " + dayCount);
							 for(int l=0; l<dayCount; l++){
								 int hold = dayNum[l];
								 //System.out.println("Day: " + dayNum[l]);
								 calendar[hold][k] = views.get(i).getName();
							 }
						 }//end of for loop
					   System.out.println("No conflict for: " + views.get(i).getName() + " session " + session);
					   System.out.println("");
					   break;
				   }//end of if noConflict
				   else{
					   System.out.println("Conflict for: " + views.get(i).getName() + " session " + session + " with " + calendar[row][startPos+1]);
					   System.out.println("");
				   }//end of else
				   session++;
				   
			   }//end of outer while
		   }//end of for
		   }//end of main function
}//end of class

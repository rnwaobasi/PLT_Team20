import java.io.*;
import java.util.*;
import java.util.regex.*;

public class scheduler {
	   public static void main(String args[]) {
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
				   System.out.println("Credits: " + strLine);
				   counter = 0;
			   }
			   else if(strLine.isEmpty()){
				   System.out.println (strLine);
			   }
			   else if(counter == 0 ){
				   System.out.println("Class Name: " + strLine);
				   counter = 1;
			   }//end of if counter == 0 
			   else{
				   System.out.println("\nSession " + counter);
				   StringTokenizer st = new StringTokenizer(strLine);
				   int count = 0;
				   while (st.hasMoreTokens()) {
					   if(count == 0){
						   System.out.println("Days: ");
						   String temp = new String(st.nextToken());
						   for(int j=0; j<temp.length(); j++){
							   if(temp.charAt(j) == 'M'){
								   System.out.println("Monday");
							   }
							   else if(temp.charAt(j) == 'T'){
								   System.out.println("Tuesday");
							   }
							   else if(temp.charAt(j) == 'W'){
								   System.out.println("Wednesday");
							   }
							   else if(temp.charAt(j) == 'R'){
								   System.out.println("Thursday");
							   }
							   else if(temp.charAt(j) == 'F'){
								   System.out.println("Friday");
							   }
							   else{
								   System.out.println("\"" + temp.charAt(j) + "\" is not a valid school day! Please enter one of M, T, W, R, or F");
							   }
						   }
						   count++;
					   }
					   else{
						   //handle time
						   String[] times;
						   //delimiter for split
						   String delimiter = "-";
						   String temp = new String(st.nextToken());
						   times = temp.split(delimiter);
						   System.out.println("Start: " + times[0]);
						   System.out.println("End: " + times[1]);
					   }
				     
				   }
				   counter++;
			   }
			   }//end of try
			   
			   in.close();
			     }catch (Exception e){//Catch exception if any
			   System.err.println("Error: " + e.getMessage());
			   }
		   }
}

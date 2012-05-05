import java.util.*;

public class scheduler {
	   public static void main(String args[]) {
		   //scheduler schedule = new scheduler();
		   boolean broken = false;
		   
		   //max length of schedule
		   int maxCourses  = 4;
		   int maxCredits  = 10;
		   int courseCount = 0;
		   int creditCount  = 0;
		   
		   
		   courselist courses = new courselist("input.txt");
		   
		   List<classes> views = new ArrayList<classes>();
		   List<String> result = new ArrayList<String>();
		   views = courses.getCourses();
		   int objTracker = courses.numCourses();
		   
		   /*
		   create a 2D array with 5 minute interval for the whole week
		   5 (num of days in a week) x 28 (num of 5 minute intervals in a day) 
		   */
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
						   courseCount++;
						   creditCount += views.get(i).getCredits();
						   
						   if(creditCount > maxCredits){
							   System.out.println("\nAdding " + views.get(i).getName() + " will cause you to exceed your credit maximum of " + maxCredits);
							   System.out.println("You cannot add " + views.get(i).getName());
							   broken = true;
							   break;
						   }
						   
						   if(courseCount > maxCourses){
							   System.out.println("\nYou have exceded your max course limit of " + maxCourses);
							   System.out.println("You cannot add " + views.get(i).getName());
							   broken = true;
							   break;
						   }
						   
							 for(int k = startPos; k < endPos; k++){
								 for(int l=0; l<dayCount; l++){
									 int hold = dayNum[l];
									 calendar[hold][k] = views.get(i).getName();
									 //calendar[hold][k] = "Hold";
								 }
							 }//end of for loop
						   System.out.println("No conflict for: " + views.get(i).getName() + " session " + session);
						   String holdS = views.get(i).getName() + " Session " + session + ": " + views.get(i).getBegin(session) + "-" + views.get(i).getEnd(session);
						   result.add(holdS);
						   System.out.println(" ");
						   break;
					   }//end of if noConflict
					   else{
						   System.out.println(dayCount);
						   for(int l=0; l<dayCount; l++){
							   int hold = dayNum[l];
							   if(calendar[hold][startPos+1] == null){
								   
							   }
							   else{
								   System.out.println("Conflict for: " + views.get(i).getName() + " session " + session + " with " + calendar[hold][startPos+1]);
								   System.out.println("");
								   break;
							   } 
						   }
						   
					   }//end of else
					   
					   if(broken){
						   break;
					   }
					   
					   session++;
			   }//end of outer while
			   if(broken){
				   break;
			   }
		   }//end of for
		   
		   System.out.println("\n Your Schedule is Below:");
		   for(int i = 0; i< result.size(); i++)
			   System.out.println("\t" + result.get(i));
		   }//end of main function
}//end of class

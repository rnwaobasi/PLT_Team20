import java.util.*;

public class Function {
    
   	public String name;
	public ArrayList<CVal> params;
    
        public Function(String s, ArrayList<CVal> p) {
        	name = s;
		params = p;
            
        }
        
	public String toString() {
		if (params == null) {
			return "the function " + name + " with no params";
		} 
		else {
			String functionString = "the function " + name + " with " + params.size() + " params: ";
			for (int i = 0; i < params.size(); i++)
			{
				functionString += params.get(i) + ", ";
			}
               	 
               		functionString += ".\n";
                	return functionString;
		}
	}
        
}

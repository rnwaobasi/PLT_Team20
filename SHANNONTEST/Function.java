import java.util.*;

public class Function {
    
   public String name;
	public ArrayList<CVal> params;
    
        public Function(String s, ArrayList<CVal> p) {
            name = s;
			params = p;
            
        }
        
	public String toString() {
		String functionString = "the function " + name + " ";
		for (CVal o: params)
		{
			functionString += o.toString();
		}
                
                functionString += ".\n";
                return functionString;
	}
        
}

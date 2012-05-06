
import java.util.ArrayList;
public class DataTypeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        try{
                      
            char[] dl1 = {'M', 'W'};
            char[] dl2 = {'T', 'R'};
            char[] dl3 = {'M', 'T', 'W', 'R', 'F'};
                     
            Dayblock db1 = new Dayblock(dl1);
            Dayblock db2 = new Dayblock(dl2);
            Dayblock db3 = new Dayblock(dl3);
            
            if (db1.has('T'))
                System.out.println("Uh oh!");
            
            db1.add('T');
            if (db1.has('T'))
                System.out.println("Now it should have Tuesday.");
            
            System.out.println("dl2 has Friday: " + db2.has('F'));
            
            System.out.println(dl3.toString());
            
            Time st = new Time("1:10");
            Time en = new Time("2:25");
            
            Timeblock tb = new Timeblock(st, en);
            
            System.out.println(tb.toString());
            
            Datetime dt1 = new Datetime(db1, tb);
            Datetime dt2 = new Datetime(db2, tb);
            Datetime dt3 = new Datetime(db3, tb);
            
            
            
            if (dt1.db.has('M'))
                System.out.println("Working well");

            System.out.println(dt3.toString());
            
            ArrayList<Datetime> dt = new ArrayList<Datetime>();
            dt.add(dt1);
            dt.add(dt2);
            dt.add(dt3);
            
            Course PLT = new Course("PLT", 3, dt);
            System.out.println(PLT.getDayblock().toString());
            System.out.println("Num sections = " + PLT.numSections());
            
            Course AI = new Course("AI", 4, dt);
            
            Courselist cl = new Courselist("CS");
            cl.add(AI);
            cl.add(PLT);
            
            System.out.println(cl.toString());
        }
        catch(Exception e){System.out.println(e.getMessage());}
        
        
        
        
    
    }
}

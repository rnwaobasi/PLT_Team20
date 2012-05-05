/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plt.pkgfinal.project;
import java.lang.Throwable;
import java.util.ArrayList;
/**
 *
 * @author Assata
 */
public class DataTypeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        try{
            Day M, T, W, R, F;
            M = new Day('M');
            T = new Day('T');
            W = new Day('W');
            R = new Day('R');
            F = new Day('F');
            
            
            ArrayList<Day> dl1 = new ArrayList();
            dl1.add(M);
            dl1.add(W);
            
            ArrayList<Day> dl2 = new ArrayList();
            dl2.add(T);
            dl2.add(R);
            
            ArrayList<Day> dl3 = new ArrayList();
            dl3.add(M);
            dl3.add(T);
            dl3.add(W);
            dl3.add(R);
            dl3.add(F);
            
            DayBlock db1 = new DayBlock(dl1);
            DayBlock db2 = new DayBlock(dl2);
            DayBlock db3 = new DayBlock(dl3);
            
            if (db1.has(T))
                System.out.println("Uh oh!");
            
            System.out.println("dl2 has Friday: " + db2.has(F));
            
            System.out.println(dl3.toString());
            
            TimeBlock tb = new TimeBlock("1:10", "2:25");
            
            DateTime dt1 = new DateTime(db1, tb);
            DateTime dt2 = new DateTime(db2, tb);
            DateTime dt3 = new DateTime(db3, tb);
            
            if (dt1.getDayBlock().has(M))
                System.out.println("Working well");
            if (dt1.getDayBlock().has(T))
                System.out.println("PROBLEM");
            System.out.println(dt3.toString());
        }
        catch(Exception e){System.out.println("Stick to the weekadys, buster!");}
        
        
        
        
    
    }
}

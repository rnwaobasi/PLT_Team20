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
            
            Timeblock tb = new Timeblock("1:10", "2:25");
            
            DateTime dt1 = new DateTime(db1, tb);
            DateTime dt2 = new DateTime(db2, tb);
            DateTime dt3 = new DateTime(db3, tb);
            
            if (dt1.db.has('M'))
                System.out.println("Working well");
            if (dt1.db.has('T'))
                System.out.println("PROBLEM");
            System.out.println(dt3.toString());
        }
        catch(Exception e){System.out.println("Stick to the weekadys, buster!");}
        
        
        
        
    
    }
}
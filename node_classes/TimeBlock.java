/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plt.pkgfinal.project;

/**
 *
 * @author Assata
 */
public class TimeBlock {
    
    String startTime;
    String endTime;
    public TimeBlock(String startTime, String endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    
    public String toString(){
        return "From " + startTime + " to " + endTime;
    }
    
}

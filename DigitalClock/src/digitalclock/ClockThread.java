
package digitalclock;

import java.awt.Font;
import java.util.Date;


public class ClockThread extends Thread{
    DigitalClock daClock;
    String time;
    
    
    //This is a Constructor
    public ClockThread(DigitalClock daClock){
        this.daClock = daClock;
        start();
        
    }
    
    //This is the method to run the clock. This will be called in main
    public void run(){
        
        while(true){
            
            time = "" + new Date();
            daClock.Clock.setText(time);
            
        }
                         
               
        
        
        
    }
}


package digitalclock;

import java.awt.Font;
import java.util.Date;


public class ClockThread extends Thread{
    DigitalClock daClock;
    String time;
    
    
    public ClockThread(DigitalClock daClock){
        this.daClock = daClock;
        start();
        
    }
    
    public void run(){
        
        while(true){
            
            time = "" + new Date();
            daClock.Clock.setText(time);
            
        }
                         
               
        
        
        
    }
}

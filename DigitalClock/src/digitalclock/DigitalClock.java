package digitalclock;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.util.HashSet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import javax.swing.JButton;


public class DigitalClock extends JFrame{
    
    JLabel Clock; //JLabel is a class. It's a container to place text in. It displays a single line of read-only o
   ClockThread ct;
    
    
   public DigitalClock(){
    Clock = new JLabel("FaithDigClock");
    setVisible(true);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(Clock); //This is from the JFrame package
    setSize(1200,500);
    Clock.setFont(new Font("Arial", Font.CENTER_BASELINE,80));   //to set the font size of our clock
    Clock.setOpaque(true);
    Clock.setBackground(Color.red);
    Clock.setForeground(Color.white);
    setLocationRelativeTo(null);
    ct = new ClockThread(this);
    
    
    }

//public class DigitalClock{

    public static void main(String[] args) {
     
/*        
//i) Create a frame
        
        JFrame frame = new JFrame("MyDigitalClock");
        
        //ii) Display the frame to make it visible
        frame.setVisible(true);
        
        //iii) Set the size of the frame
        frame.setBounds(200,200,200,200);
        
        //iv) Add a close button
        JButton closeButton = new JButton("Close");

*/

    new DigitalClock(); //In main, this creates the digital clock which has the properties in above section
    }
    
}

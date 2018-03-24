package digitalclock;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
//import javax.swing.JFrame;
import javax.swing.JLabel;


public class DigitalClock extends JFrame{
    
    JLabel Clock; //JLabel is a class. It's a container to place text in. It displays a single line of read-only o
    ClockThread ct;
    
    
    public DigitalClock(){
    Clock = new JLabel("");
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


    public static void main(String[] args) {
        
        new DigitalClock(); //In main, this creates the digital clock which has the properties in above section
    }
    
}

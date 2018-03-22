import javax.swing.*;
import java.awt.*;

public class DigitalClock extends JFrame {

    JLabel jlabClock;

    public DigitalClock(){
        jlabClock = new JLabel("");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jlabClock);
        setSize(1200,120);
        setLocationRelativeTo(null);
        setVisible(true);
    }



    public static void main(String[]args){

        new DigitalClock(); //method

    }
}

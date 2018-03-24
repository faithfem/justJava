
package constructorsreview;

//import java.util.Scanner;

public class apples {
    
        public static void main(String[] args) {
        
        //Scanner input = new Scanner(System.in);
        //tuna thamaki = new tuna();
        
        //ADDENDUM USING CONSTRUCTOR
        //i) COMMENT OUT LINE tuna thamaki = new tuna();
        //ii) INSTEAD, have an entry inside the brackets
        //iii) COMMENT OUT all other lines. With a contructor, u need less code in main
        
        tuna thamaki = new tuna("Shiku"); // -> This is an object. "tuna" is coming from constructor
        thamaki.simpleMessage(); // -> The objectis picking up the method
        
        
        
        tuna thamaki2 = new tuna("Wairimu"); // -> This is a second object
        thamaki2.simpleMessage(); // -> The second object is picking up the same method
        
        /*System.out.println("Enter name here: ");
        String hisHerName = input.nextLine();
        thamaki.setName(hisHerName);*/

        
        
        
    }
    
}

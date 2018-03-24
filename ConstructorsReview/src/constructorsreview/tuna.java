
package constructorsreview;

public class tuna {
    
    //create a variable
    private String daughterName; //daughter name is a variable
    
    
    //ADDENDUM: USING A CONTRUCTOR
    public tuna(String jina){
        daughterName = jina;
    }
    
    
    
    //END OF ADDENDUM: USING A CONSTRUCTOR
    
    
//Create a method to be used in the main class
    public void setName(String ritwa){
        daughterName = ritwa;
    }

      
//Create a getter   
    public String getName(){
        return daughterName;
    }
    
//Create the method to be called by the main class    
    public void simpleMessage(){
        System.out.printf("My daughter's name is %s\n", getName());
    }
    
    
}

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

public class Car {

    public static void main(String[]args){


        //declare variables (INSTANCE VARIABLES)

        private int odometer = 0;
        private String owner = "Faith";
        private int dist;



        //Constructor (r used to create new objects in a class)
        public Car(){

        }

        //Create a second constructor
        public Car(String Name){
            owner = name;
        }

        //Create a METHOD

        public void moveCar(){
            odometer = odometer + dist;
            System.out.println(owner + "'s car has moved " + dist + " units");

        }

        //METHOD 2: TURNING THE CAR
        public void turnCar(){
            System.out.println(owner + "'s car has turned " + angle + " degrees");
        }

        public void getOdometer(){
            return odometer;
        }

    }
}

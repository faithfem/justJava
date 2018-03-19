public class Car {

        //declare variables (INSTANCE VARIABLES)

        private int odometer;
        private String owner;
        private int distance;


        //Constructor (r used to create new objects in a class)
        public Car(String owner, int odometer) {

            this.odometer = odometer;
            this.owner = owner;
            this.distance = distance;
        }

        //Create a METHOD

        public void moveCar ( int distance, int odometer){
            odometer = Math.abs(odometer) + Math.abs(distance); //this is a local variable
            System.out.println(owner + "'s car has moved " + distance + " miles and has " + odometer + " miles on it.");

        }

//        //METHOD 2: TURNING THE CAR
//        public void turnCar ( double angle){
//            System.out.println(owner + "'s car has turned " + angle + " degrees");
//        }
//
//        public void getOdometer () {
//            return odometer;
//        }

    }


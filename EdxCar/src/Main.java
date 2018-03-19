public class Main {

    public static void main (String[]args){

        //"new" indicates the creation of an object

        Car myCar = new Car("Faith", 100); //creates myCar object
        Car hisCar = new Car("John", 10000); //creates hisCar object

        //the objects above use the blueprint in Car.java file

        myCar.moveCar(100, -60);
        hisCar.moveCar(5000,60000);



    }
}

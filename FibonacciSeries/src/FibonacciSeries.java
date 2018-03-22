public class FibonacciSeries {

    public static void main(String[] args) {

        //SIMPLE FIBONACCI SERIES
//        int n1 = 0, n2=1,n3,i, count = 20; //Give initial 2 numbers
//        System.out.print(n1+","+n2); //Print initial 2 numbers
//
//        for (i = 2; i < count; i++) { //Pass through a for loop
//            n3 = n1 + n2;
//            System.out.print("" + ","+n3);
//            n1 = n2;
//            n2 = n3;
//
//        }

        //FIBONACCI SERIES WHERE U DON'T START FROM ZERO
        int n1=12,n2=13,n3,i,count = 10;
        System.out.print(n1 + "," + n2);

        for(i=1;i<count;i++){
            n3=n1+n2;
            System.out.print("" + ","+n3);
            n1=n2; //tells the code to add the first number to the second. Missing this means loop will add only 1
            n2=n3;//tells code to add 2nd and 3rd numbers. If not, code stops adding after second element

        //THIS CODE PRINTS:
            //12,13,25,38,63,101,164,265,429,694,1123
        }


    }
}

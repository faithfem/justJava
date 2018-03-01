package com.faithefm;
//import java.util.Scanner;

public class Main {
public static void main (String args[]) {

        int[] numbers = {88, 33, 55, 23, 64, 123};
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i<numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number in array is: " + smallest);


    //public static int smallest(int args[])


//                int min = args[0];
//
//                for (int i = 0; i < args.length; i++){
//                    if(args[i] <=min){
//                        min = args[i];
//                    }
//                }
//                return min;
            }
}


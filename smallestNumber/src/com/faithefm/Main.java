package com.faithefm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int smallest = 0;
        int large = 0;
        int num;

        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        num = input.nextInt();
        smallest = num;

        for (int i = 2; i < n; i++) {
            num = input.nextInt();
            if (num > large) {
                large = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            System.out.println("the largest is: " + large);
            System.out.println("the smallest is: " + smallest);

//        //Scanner sc=new Scanner(System.in);
//        //int rollno=sc.nextInt();

        }
    }
}

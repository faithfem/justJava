import java.util.Scanner;

package com.faithefm;

public class Main {

    public static void main(String[] args) {
	// Declare variables as usual

        int examWeight = 70;
        int labWeight = 20;
        int hwWeight = 10;
        double examScore;
        double labScore;
        double hwScore;
        double finalGrade;

        //Ask for input on exam, lab and homework scores

        //Scanner user_input = new Scanner(System.in);
        //examScore = user_input();
        IO.output("Enter your exam grade");
        examScore = IO.inputDouble();
        IO.output("Enter your lab grade");
        labScore = IO.inputDouble();
        IO.output("Enter your homework grade");
        hwScore = IO.inputDouble();
        
        examScore = examScore*(examWeight/100);
        labScore = labScore*(labWeight/100);
        hwScore = hwScore*(hwWeight/100);
        finalGrade = examScore+labScore+hwScore;

        //System.out.println("Exam score was " + user_input);
        IO.outputln("Final grade is " + finalGrade);
        
    }
}

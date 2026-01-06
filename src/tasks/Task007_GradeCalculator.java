package tasks;

import java.util.Scanner;

/*
Write a program that calculates and displays the letter grade for a given numerical score based on the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59
*/

public class Task007_GradeCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the marks of the student: ");
        int marks= input.nextInt();
        String Grade= "";

        if(marks<= 100 && marks>= 90) {
            Grade = "A";
            System.out.println("Pass");
        }
        else if(marks<= 89 && marks>= 80) {
            Grade = "B";
            System.out.println("Pass");
        }
        else if(marks<= 79 && marks>= 70) {
            Grade = "C";
            System.out.println("Pass");
        }
        else if(marks<= 69 && marks>= 60) {
            Grade = "D";
            System.out.println("Pass");
        }
        else if(marks<= 59 && marks>= 50) {
            Grade = "E";
            System.out.println("Pass");
        }
        else if(marks<= 59 && marks>= 0) {
            Grade = "F";
            System.out.println("Fail");
        }
        else{
            Grade = "Invalid Grade";
            System.out.println("Enter Valid Marks");
        }

        System.out.printf("Your Grade is: %s",Grade);
    }

}
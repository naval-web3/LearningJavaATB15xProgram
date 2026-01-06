package tasks;

import java.util.Scanner;

/* QWrite a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal),
isosceles (exactly two sides are equal), or scalene (no sides are equal).
Use an if-else statement to classify the triangle.*/


public class Task005_Ifelse{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int s1,s2,s3;

        System.out.println("Enter Side of the Triangle");
        s1= input.nextInt();

        System.out.println("Enter Side of the Triangle");
        s2= input.nextInt();

        System.out.println("Enter Side of the Triangle");
        s3= input.nextInt();

        if(s1==s2 && s2==s3){
            System.out.println("It is an Equlatoral Traingle");
        }
        else if(s1==s2 || s2==s3 || s3==s1){
            System.out.println("It is an Isosceles Traingle");
        }
        else{
            System.out.println("It is an Scalene Triangle");
        }
    }
}
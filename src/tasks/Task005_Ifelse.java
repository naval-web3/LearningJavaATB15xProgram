package tasks;

import java.util.Scanner;

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
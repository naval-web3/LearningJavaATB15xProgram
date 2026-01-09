package ex_01_Java_Basics;

import java.util.Scanner;

class Lab004_ForLoop{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to Factorial program");
        System.out.print("Enter a Number:");

        if(input.hasNextInt()) {
            int n = input.nextInt();
            long fact = 1;

            for (int i = n; i > 0; i--) {
                fact = fact * i;
            }

            System.out.printf("%d!= %d", n, fact);
        }
        else{
            System.out.println("Invalid Input");
        }
        input.close();
    }
}

package org.tw.factorial;

import java.util.Scanner;

public class Factorial {

    static long number, factorial;



    public static void main(String[] args) {

        System.out.println("Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextLong();
        factorial = factorialFinder(number);

        System.out.println("The factorial is : " +factorial);


    }

    public static long factorialFinder(long number){

        long factorial = 1;

        if (number < 0){
            System.out.println("Factorial of negative number is not defined");
            return -1;

        }

        for(long i = number; i>=1; i--){

            factorial *= number;
            number--;
        }

        return factorial;

    }
}

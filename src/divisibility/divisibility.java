package divisibility;

//This program reads in two numbers from the user, dividend and divisor, and prints out whether dividend is evenly divisible by divisor.
//
// For example, one run of the program may look like this:
//
//Enter the dividend: 10
//Enter the divisor: 5
//10 is divisible by 5!
//
//Because 5 goes into 10 twice. 10 is evenly divisible by 5.

//Your program should be able to produce the following output:
//
//Enter the dividend: 10
//Enter the divisor: 0
//10 is not divisible by 0

import java.util.Scanner;
public class divisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a divindend:"); //Enter first number
        int dividend = scanner.nextInt();

        System.out.print("Enter its divisor:"); //Enter second number
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println(dividend + "is not divisble by 0!");
        }else if (dividend % divisor == 0) {
            System.out.println(dividend + " is divisible by " + divisor);
        }else {
            System.out.println(dividend + " is not divisible by " + divisor);
        }
    }
}
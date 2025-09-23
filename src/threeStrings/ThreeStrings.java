package threeStrings;
//Write a program that asks the user for three strings.
//
//Then, print out whether the first string
//concatenated to the second string is equal to the
//third string. Here are a few sample program runs:
//
//Sample Program 1:
//
//First string? pepper
//Second string? mint
//Third string? peppermint
//pepper + mint is equal to peppermint!
//Sample Program 2:
//
//First string? go
//Second string? fish
//Third string? donuts
//go + fish is not equal to donuts!

import java.util.Scanner;
public class ThreeStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("First string? ");
        String first = scanner.nextLine();

        System.out.print("Second string? ");
        String second = scanner.nextLine();

        System.out.print("Third string? ");
        String third = scanner.nextLine();

        String combined = first + second;

        if (combined.equals(third)) {
            System.out.println(first + " + " + second + " is equal to " + third + "!");
        }else {
            System.out.println(first + " + " + second + " is not equal to " + third + "!");
        }
    }
}
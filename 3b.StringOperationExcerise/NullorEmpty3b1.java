/*Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty().*/
package github1;

import java.util.Scanner;

public class NullorEmpty3b1 {

    // User-defined function
    public static boolean isNullOrEmpty(String input) {
        return input == null || input.trim().isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        if (isNullOrEmpty(userInput)) {
            System.out.println("The string is null or contains only whitespace.");
        } else {
            System.out.println("The string is not null and contains non-whitespace characters.");
        }

        scanner.close();
    }
}

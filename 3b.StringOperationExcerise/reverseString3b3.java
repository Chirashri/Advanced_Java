/*Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/
package github1;

import java.util.Scanner;

public class reverseString3b3 {

    // User-defined function to reverse a string
    public static String reverseString(String input) {
        if (input == null) {
            return null;
        }

        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String userInput = scanner.nextLine();

        String reversed = reverseString(userInput);

        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}


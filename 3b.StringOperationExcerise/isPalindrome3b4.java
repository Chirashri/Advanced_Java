/*Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome():*/
package github1;

import java.util.Scanner;

public class isPalindrome3b4 {

    // User-defined function to check if a string is a palindrome
    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }

        // Remove all non-letter characters and convert to lowercase
        String cleaned = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Reverse the cleaned string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Compare
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: ");
        String userInput = scanner.nextLine();

        if (isPalindrome(userInput)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}


/*Write a Java Program for  Shortening a string to a specified length and adds an ellipsis using user 
defined function truncate()*/
package github1;

import java.util.Scanner;

public class Truncate3c7 {

    // User-defined function to truncate string and add ellipsis if needed
    public static String truncate(String input, int maxLength) {
        if (input == null || maxLength <= 0) {
            return "";
        }

        if (input.length() <= maxLength) {
            return input;
        } else if (maxLength <= 3) {
            // If maxLength is very small, just return ellipsis or trimmed ellipsis
            return "...".substring(0, maxLength);
        } else {
            // Return truncated string + "..."
            return input.substring(0, maxLength - 3) + "...";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        System.out.print("Enter maximum length: ");
        int maxLength = scanner.nextInt();

        String truncated = truncate(userInput, maxLength);

        System.out.println("Truncated String: " + truncated);

        scanner.close();
    }
}

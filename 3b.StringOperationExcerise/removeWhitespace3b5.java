/*Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()*/
package github1;

import java.util.Scanner;

public class removeWhitespace3b5 {

    // User-defined function to remove all whitespace characters
    public static String removeWhitespace(String input) {
        if (input == null) {
            return null;
        }

        // Replace all types of whitespace using regex \s+
        return input.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with whitespace: ");
        String userInput = scanner.nextLine();

        String result = removeWhitespace(userInput);

        System.out.println("String after removing all whitespace: " + result);

        scanner.close();
    }
}

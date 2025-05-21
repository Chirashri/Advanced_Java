package github1;

import java.util.Scanner;

public class pgrm3b5 {

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

package github1;

import java.util.Scanner;

public class pgrm3c1 {

    // User-defined function to capitalize the first letter of each word
    public static String capitalizeWords(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] words = input.split("\\s+");  // split by whitespace
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize first character + rest lowercase
                capitalized.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    capitalized.append(word.substring(1).toLowerCase());
                }
                capitalized.append(" ");
            }
        }

        // Remove trailing space
        return capitalized.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        String result = capitalizeWords(userInput);

        System.out.println("Capitalized String: " + result);

        scanner.close();
    }
}

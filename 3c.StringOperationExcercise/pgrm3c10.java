package github1;

import java.util.Scanner;

public class pgrm3c10 {

    // User-defined function to count words in a string
    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }

        // Split string by one or more whitespace characters
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to count words: ");
        String userInput = scanner.nextLine();

        int wordCount = countWords(userInput);

        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}


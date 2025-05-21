package github1;

import java.util.Scanner;

public class pgrm3c8{

    // User-defined function to check if string contains only digits
    public static boolean isNumeric(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        // Check every character
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it's numeric: ");
        String userInput = scanner.nextLine();

        if (isNumeric(userInput)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string contains non-numeric characters.");
        }

        scanner.close();
    }
}

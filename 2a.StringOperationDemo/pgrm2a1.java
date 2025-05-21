package github1;

import java.util.Scanner;

public class pgrm2a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // String Comparison
        String str3 = "hello";
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));

        // String Searching
        String str4 = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Index of 'fox': " + str4.indexOf("fox"));
        System.out.println("Contains 'lazy': " + str4.contains("lazy"));

        // Substring Operations
        System.out.println("Substring from index 4 to 9: " + str4.substring(4, 9));

        // String Modification
        String replaced = str4.replace("lazy", "active");
        System.out.println("Modified string: " + replaced);

        // Whitespace Handling
        String str5 = "   Trim me!   ";
        System.out.println("Original: '" + str5 + "'");
        System.out.println("Trimmed: '" + str5.trim() + "'");

        // String Concatenation
        String concat = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + concat);

        // String Splitting
        String csv = "apple,banana,orange,grape";
        String[] fruits = csv.split(",");
        System.out.println("Split fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // StringBuilder Demo
        StringBuilder sb = new StringBuilder("Welcome");
        sb.append(" to ").append("Java Programming!");
        System.out.println("StringBuilder result: " + sb.toString());

        // String Formatting
        String name = "Alice";
        int age = 25;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted string: " + formatted);

        // Email Validation using contains(), startsWith(), endsWith()
        System.out.print("Enter an email address to validate: ");
        String email = scanner.nextLine();
        if (email.contains("@") && email.contains(".") &&
            email.startsWith(email.split("@")[0]) &&
            email.endsWith(".com")) {
            System.out.println("Valid Email Format (basic check)");
        } else {
            System.out.println("Invalid Email Format");
        }

        scanner.close();
    }
}

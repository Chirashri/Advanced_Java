package github1;

import java.util.Scanner;

public class pgrm3b2{

    // User-defined function to count occurrences of a substring
    public static int countOccurrences(String mainString, String subString) {
        if (mainString == null || subString == null || subString.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length(); // move index forward to avoid overlapping matches
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainStr = scanner.nextLine();

        System.out.print("Enter the substring to count: ");
        String subStr = scanner.nextLine();

        int result = countOccurrences(mainStr, subStr);

        System.out.println("The substring \"" + subStr + "\" appears " + result + " times in the main string.");

        scanner.close();
    }
}

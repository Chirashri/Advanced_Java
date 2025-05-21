/* Write a Java Program for  Creating  a random string of a specified length using user defined 
function generateRandomString()*/
package github1;

import java.util.Random;
import java.util.Scanner;

public class RandomString3c9 {

    // User-defined function to generate random string
    public static String generateRandomString(int length) {
        if (length <= 0) {
            return "";
        }

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();

        StringBuilder result = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the desired length of the random string: ");
        int length = scanner.nextInt();

        String randomString = generateRandomString(length);

        System.out.println("Random String: " + randomString);

        scanner.close();
    }
}


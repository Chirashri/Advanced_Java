/*3a. Develop a java program for performing various string operations with different string
handling functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
startsWith() and endsWith()*/
package github1;

public class String_operation3a {

    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of String 1: " + str1.length());
        System.out.println("Character at index 1 in String 1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("String 1 equals String 3 (case-sensitive): " + str1.equals(str3));
        System.out.println("String 1 equals String 3 (ignore case): " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        String sentence = "Java is powerful and Java is easy.";
        System.out.println("First index of 'Java': " + sentence.indexOf("Java"));
        System.out.println("Last index of 'Java': " + sentence.lastIndexOf("Java"));

        // 5. Substring Operations
        String sub = sentence.substring(0, 10);
        System.out.println("Substring (0-10): " + sub);

        // 6. String Modification
        String replaced = sentence.replace("Java", "Python");
        System.out.println("Replaced String: " + replaced);

        // 7. Whitespace Handling
        String withSpaces = "   Trim me!   ";
        System.out.println("Original: [" + withSpaces + "]");
        System.out.println("Trimmed: [" + withSpaces.trim() + "]");

        // 8. String Concatenation
        String concat = str1.concat(" ").concat(str2);
        System.out.println("Concatenated String: " + concat);

        // 9. String Splitting
        String csv = "apple,banana,grape,orange";
        String[] fruits = csv.split(",");
        System.out.println("Split fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder();
        sb.append("StringBuilder ");
        sb.append("is ");
        sb.append("efficient.");
        System.out.println("StringBuilder content: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int age = 25;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted String: " + formatted);

        // 12. Email Validation with contains(), startsWith(), endsWith()
        String email = "user@example.com";
        System.out.println("Validating email: " + email);
        if (email.contains("@") && email.startsWith("user") && email.endsWith(".com")) {
            System.out.println("Email is valid based on basic checks.");
        } else {
            System.out.println("Email is invalid.");
        }
    }
}

package github1;
import java.util.ArrayList;
import java.util.Scanner;
public class pgrm1b6 {


	
		 public static void main(String[] args) {
		        // Create an ArrayList to store color names
		        ArrayList<String> colors = new ArrayList<>();

		        // Adding different colors to the ArrayList
		        colors.add("Red");
		        colors.add("Blue");
		        colors.add("Green");
		        colors.add("Yellow");
		        colors.add("Purple");
		        colors.add("Orange");

		        // Display the original list
		        System.out.println("Original List of Colors:");
		        System.out.println(colors);

		        // Input from user to remove nth element
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the position (n) of the element to remove (1-based index): ");
		        int n = scanner.nextInt();

		        // Convert to 0-based index
		        int index = n - 1;

		        // Check if index is valid
		        if (index >= 0 && index < colors.size()) {
		            // Remove the element at the specified index
		            String removedColor = colors.remove(index);
		            System.out.println("Removed color: " + removedColor);
		        } else {
		            System.out.println("Invalid index. No element removed.");
		        }

		        // Display the updated list
		        System.out.println("Updated List of Colors:");
		        System.out.println(colors);

		        scanner.close();
		    }
	
}

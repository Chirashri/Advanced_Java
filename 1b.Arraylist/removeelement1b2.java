/* Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList*/
package github1;

import java.util.ArrayList;

public class remove_element1b2 {
	 public static void main(String[] args) {
	        // Create an ArrayList to store color names
	        ArrayList<String> colors = new ArrayList<>();

	        // Add some colors to the list
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Purple");

	        // Display the original list
	        System.out.println("Original list of colors: " + colors);

	        // Remove the 2nd element (index 1)
	        if (colors.size() > 1) {
	            String removedColor = colors.remove(1);
	            System.out.println("Removed the 2nd element: " + removedColor);
	        }

	        // Remove the color "Blue" by value
	        boolean removed = colors.remove("Blue");
	        if (removed) {
	            System.out.println("Removed the color 'Blue' from the list.");
	        } else {
	            System.out.println("The color 'Blue' was not found in the list.");
	        }

	        // Display the final list
	        System.out.println("Final list of colors: " + colors);
	    }
}

package github1;

import java.util.ArrayList;

public class colorsearch1b1 {
	 public static void main(String[] args) {
	        // Create an ArrayList to store color names
	        ArrayList<String> colors = new ArrayList<>();

	        // Add some colors to the list
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Red");
	        colors.add("Purple");

	        // Display the colors
	        System.out.println("Available colors: " + colors);

	        // Search for the color "Red"
	        if (colors.contains("Red")) {
	            System.out.println("The color 'Red' is available in the list.");
	        } else {
	            System.out.println("The color 'Red' is NOT available in the list.");
	        }
	    }

}

package github1;
import java.util.ArrayList;
import java.util.List;
public class pgrm1b5 {
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

	        // Extract the 1st and 2nd elements (index 0 and 1) using subList
	        // subList(fromIndex, toIndex) includes fromIndex and excludes toIndex
	        List<String> subColors = colors.subList(0, 2);

	        // Display the extracted sublist
	        System.out.println("Extracted sublist (1st and 2nd elements): " + subColors);
	    }
}

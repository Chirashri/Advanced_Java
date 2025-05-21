package github1;

import java.util.LinkedList;
import java.util.ListIterator;

public class pgrm1c1 {
    public static void main(String[] args) {
        // Create a LinkedList and add some elements
        LinkedList<String> items = new LinkedList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Date");
        items.add("Elderberry");

        // Display the entire list
        System.out.println("Full LinkedList:");
        System.out.println(items);

        // Start iteration from the 2nd position (index 1)
        System.out.println("\nIterating from the 2nd element:");
        ListIterator<String> iterator = items.listIterator(1);  // Start at index 1

        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
    }
}


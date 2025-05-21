package github1;

import java.util.LinkedList;
import java.util.Iterator;

public class pgrm1c2 {
    public static void main(String[] args) {
        // Create a LinkedList and add some elements
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Display the original list
        System.out.println("Original LinkedList:");
        System.out.println(fruits);

        // Reverse iteration using descendingIterator()
        System.out.println("\nIterating in reverse order:");
        Iterator<String> reverseIterator = fruits.descendingIterator();

        while (reverseIterator.hasNext()) {
            String fruit = reverseIterator.next();
            System.out.println(fruit);
        }
    }
}

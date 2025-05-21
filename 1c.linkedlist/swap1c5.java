/*Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))*/
package github1;

import java.util.LinkedList;
import java.util.Collections;

public class swap1c5 {
    public static void main(String[] args) {
        // Create and populate the LinkedList
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Display the original list
        System.out.println("Original LinkedList:");
        System.out.println(colors);

        // Swap the first and third elements (index 0 and 2)
        Collections.swap(colors, 0, 2);

        // Display the list after swap
        System.out.println("\nLinkedList after swapping first and third elements:");
        System.out.println(colors);
    }
}

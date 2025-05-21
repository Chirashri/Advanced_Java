/*Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))*/
package github1;

import java.util.LinkedList;

public class insert_at_end_1c3{
    public static void main(String[] args) {
        // Create a LinkedList and add some initial elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Display original list
        System.out.println("Original LinkedList:");
        System.out.println(colors);

        // Insert the specified element at the end using offerLast()
        colors.offerLast("Pink");

        // Display updated list
        System.out.println("\nLinkedList after inserting 'Pink' at the end:");
        System.out.println(colors);
    }
}

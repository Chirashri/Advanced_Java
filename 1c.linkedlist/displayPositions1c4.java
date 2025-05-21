/*Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/
package github1;

import java.util.LinkedList;

public class displayPositions1c4 {
    public static void main(String[] args) {
        // Create and populate the LinkedList
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Tiger");
        animals.add("Lion");

        // Display elements with their positions
        System.out.println("Elements and their positions in the LinkedList:");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println("Position " + i + ": " + animals.get(i));
        }
    }
}

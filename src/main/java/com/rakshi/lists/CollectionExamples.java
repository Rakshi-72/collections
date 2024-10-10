package com.rakshi.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

/* Key Features of List:
    Ordered: The elements in a list are ordered by index, starting from 0. You can access elements by their index position.
    Duplicates Allowed: A list can contain duplicate elements. This means the same object can appear more than once in a list.
    Null Values: Lists can store null values as elements.
    Resizable: Many implementations (like ArrayList) allow dynamic resizing, meaning elements can be added or removed as needed. 
*/
public class CollectionExamples {

    // LinkedList: Use when you need fast insertions and deletions, especially in
    // the middle of the list.
    // Disadvantage: Slow random access (O(n) for accessing elements by index).
    public static void linkedListMethod() {
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to LinkedList
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");
        linkedList.add("Element 4");

        // Accessing elements
        System.out.println("LinkedList: " + linkedList);
        System.out.println("First Element: " + linkedList.get(0)); // Slower compared to ArrayList for accessing

        // Removing elements
        linkedList.remove(2); // Faster deletion in the middle
        System.out.println("After Removal: " + linkedList);
    }

    // ArrayList: Use when you need fast random access (get/set operations).
    // Disadvantage: Slow insertions and deletions in the middle, as it needs to
    // shift elements.
    public static void arrayListMethod() {
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements to ArrayList
        arrayList.add("Item A");
        arrayList.add("Item B");
        arrayList.add("Item C");
        arrayList.add("Item D");

        // Accessing elements
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Second Element: " + arrayList.get(1)); // Faster access compared to LinkedList

        // Removing elements
        arrayList.remove(1); // Slower when deleting from middle
        System.out.println("After Removal: " + arrayList);
    }

    // Stack: Use for Last-In-First-Out (LIFO) behavior, useful in recursion,
    // expression evaluation, etc.
    // Disadvantage: Based on Vector, so can have synchronization overhead, making
    // it slower in multi-threaded environments.
    public static void stackMethod() {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the Stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Accessing elements (LIFO)
        System.out.println("Stack: " + stack);
        System.out.println("Top Element: " + stack.peek()); // Retrieves the top without removing

        // Popping elements (removing)
        stack.pop(); // Removes the top element
        System.out.println("After Pop: " + stack);
    }

    // Vector: Use when you need thread-safe list operations in a multi-threaded
    // environment.
    // Disadvantage: Synchronized methods result in slower performance compared to
    // ArrayList in single-threaded scenarios.
    public static void vectorMethod() {
        Vector<String> vector = new Vector<>();

        // Adding elements to Vector
        vector.add("Item X");
        vector.add("Item Y");
        vector.add("Item Z");
        vector.add("Item W");

        // Accessing elements
        System.out.println("Vector: " + vector);
        System.out.println("First Element: " + vector.get(0)); // Similar to ArrayList but slower due to synchronization

        // Removing elements
        vector.remove(1); // Slower due to synchronization overhead
        System.out.println("After Removal: " + vector);
    }

    public static void main(String[] args) {
        System.out.println("LinkedList Example:");
        linkedListMethod();

        System.out.println("\nArrayList Example:");
        arrayListMethod();

        System.out.println("\nStack Example:");
        stackMethod();

        System.out.println("\nVector Example:");
        vectorMethod();
    }
}

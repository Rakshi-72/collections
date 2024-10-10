package com.rakshi.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExamples {

    // Key Features of Sets:
    // 1. Sets do not allow duplicate elements.
    // 2. They are useful when you want to store a collection of unique elements.
    // 3. `HashSet` provides fast access (O(1) on average) but does not maintain
    // order.
    // 4. `LinkedHashSet` maintains insertion order but is slower than `HashSet`.
    // 5. `TreeSet` keeps elements in sorted order but has slower access and
    // manipulation times (O(log n)).

    // HashSet: Use when you need fast operations and do not care about the order of
    // elements.
    // Disadvantage: Does not maintain any specific order (insertion or sorting).
    public static void hashSetMethod() {
        HashSet<String> hashSet = new HashSet<>();

        // Adding elements to HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");
        hashSet.add("Banana"); // Duplicate, won't be added

        // Accessing elements
        System.out.println("HashSet: " + hashSet); // Elements are unordered

        // Checking if an element exists
        System.out.println("Contains Apple? " + hashSet.contains("Apple"));

        // Removing an element
        hashSet.remove("Grapes");
        System.out.println("After Removal: " + hashSet);
    }

    // LinkedHashSet: Use when you need to maintain the insertion order of elements.
    // Disadvantage: Slower than `HashSet` due to maintaining insertion order.
    public static void linkedHashSetMethod() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements to LinkedHashSet
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");
        linkedHashSet.add("Four");
        linkedHashSet.add("Two"); // Duplicate, won't be added

        // Accessing elements (insertion order is maintained)
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Checking if an element exists
        System.out.println("Contains Two? " + linkedHashSet.contains("Two"));

        // Removing an element
        linkedHashSet.remove("Three");
        System.out.println("After Removal: " + linkedHashSet);
    }

    // TreeSet: Use when you need elements to be sorted.
    // Disadvantage: Slower than `HashSet` due to sorting (O(log n)).
    public static void treeSetMethod() {
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to TreeSet
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(50);
        treeSet.add(40);

        // Accessing elements (TreeSet stores elements in natural sorted order)
        System.out.println("TreeSet (Sorted): " + treeSet);

        // Accessing first and last element
        System.out.println("First Element: " + treeSet.first());
        System.out.println("Last Element: " + treeSet.last());

        // Removing an element
        treeSet.remove(20);
        System.out.println("After Removal: " + treeSet);
    }

    public static void main(String[] args) {
        System.out.println("HashSet Example:");
        hashSetMethod();

        System.out.println("\nLinkedHashSet Example:");
        linkedHashSetMethod();

        System.out.println("\nTreeSet Example:");
        treeSetMethod();
    }
}

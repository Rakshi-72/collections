package com.rakshi.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExamples {

    // Key Features of Maps:
    // 1. Maps store key-value pairs where each key is unique.
    // 2. `HashMap` provides fast operations (O(1) on average) but doesn't maintain
    // any order.
    // 3. `LinkedHashMap` maintains insertion order of keys.
    // 4. `TreeMap` sorts keys in natural order or based on a custom comparator
    // (O(log n)).

    // HashMap: Use when you need fast operations for storing and retrieving
    // key-value pairs.
    // Disadvantage: Does not maintain any specific order (insertion or sorting).
    public static void hashMapMethod() {
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Adding key-value pairs to HashMap
        hashMap.put(3, "Three");
        hashMap.put(1, "One");
        hashMap.put(4, "Four");
        hashMap.put(2, "Two");

        // Accessing elements
        System.out.println("HashMap: " + hashMap); // Unordered

        // Accessing a value by key
        System.out.println("Value for key 2: " + hashMap.get(2));

        // Removing a key-value pair
        hashMap.remove(4);
        System.out.println("After Removal: " + hashMap);
    }

    // LinkedHashMap: Use when you need to maintain the insertion order of key-value
    // pairs.
    // Disadvantage: Slower than `HashMap` due to maintaining insertion order.
    public static void linkedHashMapMethod() {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Adding key-value pairs to LinkedHashMap
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(1, "One");
        linkedHashMap.put(4, "Four");
        linkedHashMap.put(2, "Two");

        // Accessing elements (insertion order is maintained)
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Accessing a value by key
        System.out.println("Value for key 3: " + linkedHashMap.get(3));

        // Removing a key-value pair
        linkedHashMap.remove(1);
        System.out.println("After Removal: " + linkedHashMap);
    }

    // TreeMap: Use when you need keys to be sorted.
    // Disadvantage: Slower than `HashMap` due to sorting (O(log n)).
    public static void treeMapMethod() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding key-value pairs to TreeMap
        treeMap.put(30, "Thirty");
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(50, "Fifty");
        treeMap.put(40, "Forty");

        // Accessing elements (TreeMap stores keys in natural sorted order)
        System.out.println("TreeMap (Sorted): " + treeMap);

        // Accessing a value by key
        System.out.println("Value for key 20: " + treeMap.get(20));

        // Removing a key-value pair
        treeMap.remove(30);
        System.out.println("After Removal: " + treeMap);
    }

    public static void main(String[] args) {
        System.out.println("HashMap Example:");
        hashMapMethod();

        System.out.println("\nLinkedHashMap Example:");
        linkedHashMapMethod();

        System.out.println("\nTreeMap Example:");
        treeMapMethod();
    }
}

package com.rakshi.dequeues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeExamples {

    // Key Features of Deques:
    // 1. Deque (Double Ended Queue) allows insertion and removal of elements from
    // both ends.
    // 2. `ArrayDeque` is a resizable array implementation of Deque, fast for
    // adding/removing elements from both ends (better than `LinkedList`).
    // 3. `LinkedList` provides a Deque implementation where elements are linked,
    // allowing efficient insertion/removal at both ends but with slightly slower
    // random access.
    // 4. Deques can be used as both stacks (LIFO) and queues (FIFO).

    // ArrayDeque: Use when you need a Deque implementation that provides fast and
    // efficient resizable-array-backed access.
    // Disadvantage: Not thread-safe and doesn't allow `null` elements.
    public static void arrayDequeMethod() {
        Deque<String> arrayDeque = new ArrayDeque<>();

        // Adding elements to ArrayDeque
        arrayDeque.addFirst("First");
        arrayDeque.addLast("Last");
        arrayDeque.addFirst("New First");

        // Accessing elements
        System.out.println("ArrayDeque: " + arrayDeque);

        // Removing elements from both ends
        System.out.println("Removed from First: " + arrayDeque.removeFirst());
        System.out.println("Removed from Last: " + arrayDeque.removeLast());

        // Final state of ArrayDeque
        System.out.println("After Removal: " + arrayDeque);
    }

    // LinkedList Deque: Use when you need a Deque implementation backed by a
    // doubly-linked list.
    // Disadvantage: Slower than `ArrayDeque` for adding/removing elements.
    public static void linkedListDequeMethod() {
        Deque<String> linkedDeque = new LinkedList<>();

        // Adding elements to LinkedList Deque
        linkedDeque.addFirst("First");
        linkedDeque.addLast("Last");
        linkedDeque.addFirst("New First");

        // Accessing elements
        System.out.println("LinkedList Deque: " + linkedDeque);

        // Removing elements from both ends
        System.out.println("Removed from First: " + linkedDeque.removeFirst());
        System.out.println("Removed from Last: " + linkedDeque.removeLast());

        // Final state of LinkedList Deque
        System.out.println("After Removal: " + linkedDeque);
    }

    public static void main(String[] args) {
        System.out.println("ArrayDeque Example:");
        arrayDequeMethod();

        System.out.println("\nLinkedList Deque Example:");
        linkedListDequeMethod();
    }
}

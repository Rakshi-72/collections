package com.rakshi.queues;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {

    // Key Features of Queues:
    // 1. Follows FIFO (First In First Out) principle.
    // 2. Suitable for task scheduling, buffering, or any scenario where order
    // matters.
    // 3. `PriorityQueue` orders elements based on natural ordering or a custom
    // comparator.
    // 4. `ArrayDeque` can be used as a double-ended queue (Deque) allowing fast
    // insertions and deletions from both ends.
    // 5. `LinkedList` implements `Queue` and allows fast insertions, but slower
    // random access.

    // PriorityQueue: Use when you need elements sorted based on their priority.
    // Disadvantage: Doesn't allow null elements and has slower operations for
    // adding/removing elements (O(log n)).
    public static void priorityQueueMethod() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to PriorityQueue (natural ordering by default)
        priorityQueue.add(50);
        priorityQueue.add(20);
        priorityQueue.add(40);
        priorityQueue.add(10);

        // Accessing elements (the head is the smallest element by default)
        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("Head Element (Lowest Priority): " + priorityQueue.peek()); // Retrieves but doesn't remove

        // Removing elements
        priorityQueue.poll(); // Removes the head element (smallest by default)
        System.out.println("After Poll: " + priorityQueue);
    }

    // ArrayDeque: Use when you need a double-ended queue, with fast
    // insertion/removal from both ends.
    // Disadvantage: Does not allow null elements, not thread-safe.
    public static void arrayDequeMethod() {
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Adding elements to both ends
        deque.addFirst("First Element");
        deque.addLast("Second Element");
        deque.addLast("Third Element");

        // Accessing elements
        System.out.println("ArrayDeque: " + deque);
        System.out.println("First Element: " + deque.getFirst()); // Retrieves first element
        System.out.println("Last Element: " + deque.getLast()); // Retrieves last element

        // Removing elements from both ends
        deque.removeFirst(); // Removes from the front
        deque.removeLast(); // Removes from the back
        System.out.println("After Removals: " + deque);
    }

    // LinkedList as Queue: Use when you need fast insertions/deletions and can
    // tolerate slower random access.
    // Disadvantage: Slower for random access (traversal required), overhead for
    // each element (node structure).
    public static void linkedListQueueMethod() {
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("Task 1");
        queue.add("Task 2");
        queue.add("Task 3");
        queue.add("Task 4");

        // Accessing elements
        System.out.println("LinkedList as Queue: " + queue);
        System.out.println("Head Element: " + queue.peek()); // Retrieves the head element without removing

        // Removing elements
        queue.poll(); // Removes the head element (FIFO)
        System.out.println("After Poll: " + queue);
    }

    public static void main(String[] args) {
        System.out.println("PriorityQueue Example:");
        priorityQueueMethod();

        System.out.println("\nArrayDeque Example:");
        arrayDequeMethod();

        System.out.println("\nLinkedList as Queue Example:");
        linkedListQueueMethod();
    }
}

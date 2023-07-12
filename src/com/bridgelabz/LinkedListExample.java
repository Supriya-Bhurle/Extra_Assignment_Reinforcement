package com.bridgelabz;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Graphs");
        list.add("Watermelon");
        list.add("pineapple");
        list.add("Strawberry");
        list.add("Kiwi");
        // Find the middle element of the linked list
        int middle = list.size() / 2;
        String middleElement = list.get(middle);
        // Print the middle element
        System.out.println("The middle element of the linked list is: " + middleElement);
    }
}

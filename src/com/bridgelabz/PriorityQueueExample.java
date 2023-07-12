package com.bridgelabz;

import java.util.PriorityQueue;
public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue object
        PriorityQueue<book> bookQueue = new PriorityQueue<>();
        // Add books to the queue
        bookQueue.add(new book("The Great Gatsby", "F. Scott Fitzgerald"));
        bookQueue.add(new book("To Kill a Mockingbird", "Harper Lee"));
        bookQueue.add(new book("1984", "George Orwell"));
        // Print all the books in the queue
        for (com.bridgelabz.book book : bookQueue) {
            System.out.println(book);
        }
    }
}
class book implements Comparable<book> {
    private String title;
    private String author;
    public book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    @Override
    public int compareTo(book otherBook) {
        // Compare the titles of the books
        int titleComparison = this.title.compareTo(otherBook.title);
        // If the titles are the same, compare the authors
        if (titleComparison == 0) {
            return this.author.compareTo(otherBook.author);
        }
        return titleComparison;
    }
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author;
    }
}
package com.bridgelabz.Book;

import java.util.ArrayList;


public class BookStore {
    private ArrayList<Book> books;

    public BookStore() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void editBook(int index, Book book) {
        books.set(index, book);
    }

    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void deleteBook(int index) {
        books.remove(index);
    }
}

class Book {
    private String title;
    private String author;
    private int year;
    private String publisher;

    public Book(String title, String author, int year, String publisher) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String toString() {
        return title + " by " + author + " in (" + year + ") published by " + publisher;
    }
    public static void main(String[] args) {
        BookStore bookstore = new BookStore();
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", 1937, "George Allen & Unwin");
        Book book2 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951, "Little, Brown and Company");
        bookstore.addBook(book1);
        bookstore.addBook(book2);
        bookstore.printBooks();
        Book searchResult = bookstore.searchBook("The Hobbit");
        System.out.println("Search result: " + searchResult);
    }
}
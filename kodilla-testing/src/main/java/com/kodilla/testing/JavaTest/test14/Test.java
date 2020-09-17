package com.kodilla.testing.JavaTest.test14;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Bruce Eckel", "Thinking in Java"));
        books.add(new Book("Scott Oaks", "Java Performance"));
        books.add(new Book("Maurice Naftalin", "Java generics and collections"));

        for (Book book : books) {
            System.out.println(book);
        }
    }
}

class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.author;
    }
}

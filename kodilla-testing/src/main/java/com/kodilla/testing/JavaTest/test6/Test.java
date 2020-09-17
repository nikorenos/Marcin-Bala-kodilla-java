package com.kodilla.testing.JavaTest.test6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        Set<Book> books = new HashSet<>();
        books.add(new Book("Bruce Eckel", "Thinking in Java", 2006));
        books.add(new Book("Bruce Eckel", "Atomic Scala", 2013));
        books.add(new Book("Bruce Eckel", "On Java 8", 2017));
        books.add(new Book("Scott Oaks", "Java Performance", 2004));
        books.add(new Book("Scott Oaks", "Java Security (2nd Edition)", 2001));
        books.add(new Book("Maurice Naftalin", "Java generics and collections", 2006));
        books.add(new Book("Maurice Naftalin", "Mastering Lambdas: Java Programming in a Multicore World", 2014));
        books.add(new Book("Richard Warburton", "Java 8 Lambdas: Pragmatic Functional Programming", 2014));

        Map<String, Integer> authors = new HashMap<>();
        for (Book book : books) {
            int occurrences = 1;
            if (authors.containsKey(book.getAuthor())) {
                occurrences = authors.get(book.getAuthor());
                occurrences++;
            }
            authors.put(book.getAuthor(), occurrences);
        }
        for(Map.Entry<String, Integer> item : authors.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }


    }
}

class Book {
    private String author;
    private String title;
    private int publicationYear;

    public Book(String author, String title, int publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.author + ", " + publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}

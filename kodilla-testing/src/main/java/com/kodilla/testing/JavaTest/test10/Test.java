package com.kodilla.testing.JavaTest.test10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Bruce Eckel", "Thinking in Java", 2004));
        books.add(new Book("Scott Oaks", "Java Performance", 2009));
        books.add(new Book("Maurice Naftalin", "Java generics and collections", 2002));

        List<String> titles = books.stream()
                .filter(b -> b.getPublicationYear() < 2005)
                .map(b -> b.getTitle())
                .collect(Collectors.toList());
        System.out.println(titles);
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

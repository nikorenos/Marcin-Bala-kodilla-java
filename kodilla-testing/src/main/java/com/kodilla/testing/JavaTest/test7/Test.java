package com.kodilla.testing.JavaTest.test7;

import com.kodilla.testing.library.Book;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Bruce Eckel", "Thinking in Java", 2004));
        books.add(new Book("Scott Oaks", "Java Performance", 2009));
        books.add(new Book("Maurice Naftalin", "Java generics and collections", 2002));

        Map<String, Book> booksMap = new HashMap<>();
        for (Book book : books) {
            booksMap.put(book.getTitle(), book);
        }

        Set<String> titles = booksMap.keySet();
        System.out.println("All titles: " + titles);
    }
}

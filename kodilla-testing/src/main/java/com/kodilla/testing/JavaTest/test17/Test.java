package com.kodilla.testing.JavaTest.test17;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Book> books = new HashMap<>();
        books.put("ISBN12345", new Book("Joshua Bloch", "Java. Efektywne programowanie."));

        if (books.size() == 0) {
        System.out.println("Mapa jest pusta");
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
}

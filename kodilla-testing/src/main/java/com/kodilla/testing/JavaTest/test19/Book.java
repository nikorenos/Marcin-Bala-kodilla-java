package com.kodilla.testing.JavaTest.test19;

import java.time.LocalDate;

public class Book {
    private String title;
    private LocalDate publicationYear;

    public Book(String title, int year, int month, int day) {
        this.title = title;
        this.publicationYear = LocalDate.of(year, month, day);
    }
}

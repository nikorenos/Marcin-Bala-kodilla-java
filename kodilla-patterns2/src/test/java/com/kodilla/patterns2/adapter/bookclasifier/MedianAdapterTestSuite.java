package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Author 1", "Title 1", 1987, "Signature 1");
        Book book2 = new Book("Author 2", "Title 2", 2010, "Signature 2");
        Book book3 = new Book("Author 3", "Title 3", 2020, "Signature 3");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int medianPublicationYear = medianAdapter.publicationYearMedian(bookSet);
        //Then
        System.out.println(medianPublicationYear);
        assertEquals(2010, medianPublicationYear);
    }
}
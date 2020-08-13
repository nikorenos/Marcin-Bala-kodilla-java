package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //given
        //creating books
        LocalDate publicationDate1 = LocalDate.ofEpochDay(2001-10-12);
        LocalDate publicationDate2 = LocalDate.ofEpochDay(2005-05-02);
        LocalDate publicationDate3 = LocalDate.ofEpochDay(2015-07-25);
        LocalDate publicationDate4 = LocalDate.ofEpochDay(1999-02-06);
        Book book1 = new Book("1984", "George Orwell", publicationDate1);
        Book book2 = new Book("Rebecca", "Daphne du Maurier", publicationDate2);
        Book book3 = new Book("Great Expectations", "Charles Dickens", publicationDate3);
        Book book4 = new Book("Frankenstein", "Mary Shelley", publicationDate4);
        //adding books to library
        Library library = new Library("Base Library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //making a shallow copy of library
            Library clonedLibrary = null;
            try {
                    clonedLibrary = library.shallowCopy();
                    clonedLibrary.setName("Shallow copy of library");
            } catch (CloneNotSupportedException e) {
                    System.out.println(e);
            }

        //making a deep copy of library
            Library deepClonedLibrary = null;
            try {
                     deepClonedLibrary = library.deepCopy();
                     deepClonedLibrary.setName("Deep copy of library");
            } catch (CloneNotSupportedException e) {
                    System.out.println(e);
            }

        //When
        library.getBooks().remove(book1);
        deepClonedLibrary.getBooks().add(book4);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
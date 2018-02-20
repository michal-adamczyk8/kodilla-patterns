package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("Lalka", "Boleslaw Prus", LocalDate.of(1890, 10, 1));
        Book book2 = new Book("Wladca Pierscieni", "J.R.R. Tolkien", LocalDate.of(1954, 10,10));
        Book book3 = new Book("Wzgorze Psow", "Jakub Zulczyk", LocalDate.of(2017, 01, 21));
        Book book4 = new Book("Innpowatorzy", "Walter Issacson", LocalDate.of(2014,12,8));
        Book book5 = new Book("Niksy", "Nathan Calrk", LocalDate.of(2001, 2,2));

        Library library = new Library("Library number 1");

        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);
        library.books.add(book4);
        library.books.add(book5);

        //making a shallow clone of object library
        Library clonedLibrary = null;
        try {

            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.books.remove(book1);
        int result1 = library.getBooks().size();
        int result2 = clonedLibrary.getBooks().size();
        int result3 = deepClonedLibrary.getBooks().size();
        //Then
        Assert.assertEquals(4,result1);
        Assert.assertEquals(4,result2);
        Assert.assertEquals(5, result3);
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}

package ru.pa4ok.app;

import java.util.Arrays;

public class Library
{
    private String title;
    private Book[] books;

    public Library(String title, Book[] books) {
        this.title = title;
        this.books = books;
    }

    public Library copy()
    {
        Library library = new Library(this.title, new Book[this.books.length]);

        for(int i=0; i<this.books.length; i++) {
            library.getBooks()[i] = this.books[i].copy();
        }

        return library;
    }

    @Override
    public String toString() {
        return "Library{" +
                "title='" + title + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}

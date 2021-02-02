package ru.pa4ok;

import java.util.Arrays;

public class Library
{
    private String title;
    private Book[] books;

    public Library(String title, Book[] books) {
        this.title = title;
        this.books = books;
    }

    public Library(String title, int booksCount) {
        this(title, new Book[booksCount]);
    }

    public boolean addBook(Book newBook)
    {
        for(Book b : books) {
            if(b != null && b.getId() == newBook.getId()) {
                newBook.setId(Book.incrementAndGetId());
                break;
            }
        }

        for(int i=0; i<books.length; i++)
        {
            if(books[i] == null) {
                books[i] = newBook;
                return true;
            }
        }

        return false;
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

package org.edu.school.lib;

import java.util.Arrays;

public class Library
{
    private String title;
    private Book[] books;

    public Library(String title, Book[] books)
    {
        this.title = title;
        this.books = books;
    }

    public Library(String title, int booksCount) {
        this(title, new Book[booksCount]);
    }

    public void addBookCopy(int pos, Book book)
    {
        this.books[pos] = book.copy();
    }

    public Library copy()
    {
        Library newLibrary = new Library(this.title, books.length);

        for(int i=0; i<books.length; i++) {
            newLibrary.getBooks()[i] = this.books[i].copy();
        }

        return newLibrary;
    }

    public int getAllPages()
    {
        int c = 0;

        for(Book b : books) {
            if(b != null) {
                c += b.getPages();
            }
        }

        return c;
    }

    public boolean hasBook(String title)
    {
        for(Book b : books) {
            if(b != null && title.equals(b.getTitle())) {
                return true;
            }
        }

        return false;
    }

    public Book[] getAuthorBooks(String author)
    {
        int count = 0;

        for(Book b : books) {
            if(b != null && author.equals(b.getAuthor())) {
                count++;
            }
        }

        Book[] targets = new Book[count];
        int i = 0;

        if(count > 0) {
            for(Book b : books) {
                if(b != null && author.equals(b.getAuthor())) {
                    targets[i] = b.copy();
                    i++;
                }
            }
        }

        return targets;
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

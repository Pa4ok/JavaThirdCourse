package ru.pa4ok.app;

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

    public Library(String title, int booksCount)
    {
        this(title, new Book[booksCount]);
    }

    public int getAllBooksPages()
    {
        int counter = 0;

        for(Book b : books) {
            counter += b.getPages();
        }

        return counter;
    }

    public int countAuthorBooks(String author)
    {
        int counter = 0;

        for(Book b : books) {
            if(author.equals(b.getAuthor())) {
                counter++;
            }
        }

        return counter;
    }

    public boolean addBook(Book newBok)
    {
        if(newBok.getId() <= 0)
        {
            newBok.setId(Book.incrementAndGetId());
        }
        else
        {
            for(Book b : books)
            {
                if(b != null && b.getId() == newBok.getId())
                {
                    newBok.setId(Book.incrementAndGetId());
                    break;
                }
            }
        }

        for(int i=0; i<books.length; i++)
        {
            if(books[i] == null) {
                books[i] = newBok;
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

package ru.pa4ok;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library
{
    private String title;
    private String address;
    private List<Book> books = new ArrayList<>();
    private Map<String, Integer> booksCache = new HashMap<>();

    public Library(String title, String address) {
        this.title = title;
        this.address = address;
    }

    public boolean hasBook(String title)
    {
        return booksCache.containsKey(title);
    }

    public void addBook(Book book)
    {
        books.add(book);

        Integer value = booksCache.get(book.getTitle());
        if(value != null) {
            booksCache.put(book.getTitle(), ++value);
        } else {
            booksCache.put(book.getTitle(), 1);
        }
    }

    public Book takeBook(String title)
    {
        Integer value = booksCache.get(title);
        if(value != null)
        {
            for(int i=0; i<books.size(); i++)
            {
                Book b = books.get(i);
                if(b.getTitle().equals(title)) {
                    books.remove(i);
                    return b;
                }
            }
        }

        return null;
    }

    public int bookCount(String title)
    {
        Integer value = booksCache.get(title);
        return value != null ? value : 0;
    }

    @Override
    public String toString() {
        return "Library{" +
                "title='" + title + '\'' +
                ", address='" + address + '\'' +
                ", books=" + books +
                ", booksCache=" + booksCache +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Map<String, Integer> getBooksCache() {
        return booksCache;
    }

    public void setBooksCache(Map<String, Integer> booksCache) {
        this.booksCache = booksCache;
    }
}

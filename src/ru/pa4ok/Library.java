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

    public void addBook(Book book)
    {
        Integer count = booksCache.get(book.getTitle());

        /*if(count != null) {
            booksCache.put(book.getTitle(), count+1);
        } else {
            booksCache.put(book.getTitle(), 1);
        }*/

        booksCache.put(book.getTitle(), count != null ? count + 1 : 1);

        books.add(book);
    }

    public Book getBook(String title)
    {
        int count = bookCount(title);

        if(count == 0) {
            return null;
        }

        for(int i=0; i<books.size(); i++)
        {
            Book b = books.get(i);
            if(b.getTitle().equals(title))
            {
                books.remove(i);

                if(count == 1) {
                    booksCache.remove(title);
                } else {
                    booksCache.put(title, count-1);
                }

                return b;
            }
        }

        return null;
    }

    public boolean hasBook(String title)
    {
        return booksCache.containsKey(title);
    }

    public int bookCount(String title)
    {
        Integer count = booksCache.get(title);
        return count != null ? count : 0;
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

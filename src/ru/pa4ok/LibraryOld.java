package ru.pa4ok;

import java.util.ArrayList;
import java.util.List;

public class LibraryOld
{
    public List<Book> books = new ArrayList<>();

    public boolean hasBook(String title)
    {
        for(Book b : books) {
            if (b.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }
}

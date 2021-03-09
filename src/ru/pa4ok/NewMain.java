package ru.pa4ok;

import java.util.*;

public class NewMain
{
     /*
    Book
    - private static int idCounter = 0
    - final int id = ++idCounter
    - String title
    - String author
    - int pages

    Library
    - String title
    - String address
    - List<Book> books //список со всеми книгами
    - Map<String, Integer> booksCache //ключ - название кники, объект - количество книг

    - public boolean hasBook(String title)
    - public Book takeBook(String title)
    - public void addBook(Book book)
    - public int bookCount(String title)

    у вас есть список со всеми книгами и кеш к ним
    при вызове hasBook вы проверяете есть ключ в кеше
    при добавлении в кеше нет такого ключа вы его добавлете
    при взятии книги если их не осталось - удалить запись из кеша
     */

    public static void main(String[] args)
    {
        List<Book> list = new ArrayList<>();
        for(int i=0; i<4000000; i++) {
            list.add(new Book("title-" + i, "author-" + i, 100 + i));
        }

        Library newLib = new Library("4", "f");
        LibraryOld oldLib = new LibraryOld();

        for(Book b : list) {
            newLib.addBook(b);
            oldLib.books.add(b);
        }

        long mills = System.nanoTime();
        System.out.println(oldLib.hasBook("title-2000000"));
        System.out.println(System.nanoTime() - mills);
        System.out.println();
        mills = System.nanoTime();
        System.out.println(newLib.hasBook("title-2000000"));
        System.out.println(System.nanoTime() - mills);
        System.out.println();
    }
}

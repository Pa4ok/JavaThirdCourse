package org.edu.school.lib;


import org.edu.school.lib.Book;
import org.edu.school.lib.Library;

import java.util.Arrays;

public class Main
{
    /*
    все поля приватные + геттеры и сеттеры
    переопределить вывод

    Book
    - String title
    - String author
    - int pages

    Library
    - String title
    - Book[] books

    2 конструтора
        1 - принимат и title, и books
        2 - принимает title и размер для массива books

    public int getAllPages()
        метод вернет сумму всех страниц всех кних

    public boolean hasBook(String title)
        проверит есть ли в массиве books книга c названием title

    public Book[] getAuthorBooks(String author)
        метод вернет новый массив книг
        которые написаны автором author
        возврать метод должен массив с копиями книг

    создать объект класса и протестировать функции
     */

    public static void main(String[] args)
    {
        Book book1 = new Book("title1", "author1", 100);
        Book book2 = new Book("title3", "author3", 350);
        Book book3 = new Book("title3", "author2", 350);
        Book book4 = new Book("title3", "author1", 350);
        Book book5 = new Book("title3", "author3", 350);
        Book book7 = new Book("title3", "author3", 350);

        Library lib = new Library(
                "eofhofew",
                new Book[] {
                        book1,
                        book2,
                        book3,
                        book4,
                        book5,
                        book7
                }
        );
        System.out.println(lib);

        book1.setTitle("new super mega title");
        System.out.println(lib);

        System.out.println();
        Book[] arr = lib.getAuthorBooks("author3");
        System.out.println(Arrays.toString(arr));
        arr[0].setTitle("dffffffffffffffffffffffffffffffff");
        System.out.println(Arrays.toString(arr));
        System.out.println(lib);
    }
}

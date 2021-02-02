package org.edu.school;


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

    создать объект класса и протестировать функции
     */

    public static void main(String[] args)
    {
        Library lib = new Library("eofhofew", 3);
        System.out.println(lib);

        lib.getBooks()[0] = new Book("title1", "author1", 100);
        lib.getBooks()[2] = new Book("title3", "author3", 350);
        System.out.println(lib);

        System.out.println(lib.getAllPages());
        System.out.println(lib.hasBook("title1"));
        System.out.println(lib.hasBook("title4"));
        System.out.println(Arrays.toString(lib.getAuthorBooks("author1")));
    }
}

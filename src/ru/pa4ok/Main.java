package ru.pa4ok;

public class Main
{
    /*
    Book
    - static int idCounter = 1
    - int id
    - String title
    - String author
    - int pages
    - констуктор книги
        приминимает title, author, pages
        в id записывает idCounter и инкрементирует idCounter

    Library
    - String title
    - Book[] books
    - public boolean addBook(Book book)
        проверяет есть ли в books книга с таким же id
        если такая книга есть - присваевает ей новый id через Book.idCounter
        после чего пытается поставить книгу на место первого null элемента

        если получилось найти и поставить книгу вместо null элемента вернуть true
        иначе вернуть false

     */

    public static void main(String[] args)
    {
        System.out.println(new Book("one", "one", 22));
        System.out.println(new Book("two", "one", 22));
        System.out.println(new Book("three", "one", 22));
    }
}

package ru.pa4ok.app;

    /*
    ALT-INSERT - вызов меню генерации (можно через ПКМ)
    ALT-ENTER - вывов меню исправления ошибки (нужно перевести курсор на нее)
    CTRL-SPACE - вызов контекстного меню автопродолжения кода
    CTRL-ALT-L - форматирование кода (стиль)
     */

import java.util.Random;

public class Main
{
    /*

    все поля приватные + геттеры и сеттеры
    + метод toString()

    Library
    - String title
    - Book[] books
    public int getAllBooksPages()
        вернет количество страниц во всех книжках (в сумме)
    public int countAuthorBooks(String author)
        вернет количество книг данного автора
    public boolean addBook(Book book)
        проверяет id книги на корректно (>0)
        если он не корректен, то присвает новый id через Book.idCounter
        проверяет нет ли уже в бибилиотеке книги с таким id
        если есть, то присвает новый id через Book.idCounter

    Book
    - static int idCounter (тоже приватная, те нужны будут статичные геттеры и сеттеры)
    - int id
    - String title
    - String author
    - int pages

   - конструктор книги
        он принимает и инициализирует title, author, pages
        в id он присвает текущее значение idCounter
        и увеличивает(idCounter) его на 1

    написать класс Book и создать пару объектов
    проверить выдачу idшников
     */

    public static void main(String[] args)
    {
        //TestClass testClass = new TestClass();

        //хороший пример использования статики - это класс Math
        //System.out.println(Math.sin(Math.PI / 2));

        /*Random rand = new Random();

        System.out.println(rand.nextInt());
        System.out.println(rand.nextInt(100)); //0-99
        System.out.println(rand.nextFloat()); //0-1
        System.out.println(rand.nextDouble()); //0-1

        String s = "dwdw";
        s.length();

        int min = 50;
        int max = 100;
        int randWithBorder = 50 + rand.nextInt(max - min + 1);
        System.out.println(randWithBorder);*/

        //System.out.println(Utils.getRandIntWithBounds(50, 100));
        //System.out.println(Utils.revertSting("abcdefg"));'

        Book book1 = new Book("первая", "автор1", 300);
        Book book2 = new Book("вторая", "автор2", 100);
        Book book3 = new Book("третья", "автор3", 545);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}

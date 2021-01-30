package ru.pa4ok.app;

import ru.pa4ok.test.TestClass;

public class Main
{
    /*
    SHIFT + F10 - быстрый запуск выбранной конфигурации (справа сверху)
    ALT + ENTER - контектное меню исправления ошибки
    ALT + INSERT - вызов меню генерации
     */

    /*
    все поля приватные + геттеры и сеттеры
    переопределенный метод toString

    Car
    - String manufacturer
    - String mark
    - int weight
    - String color
    - String number

    1 конструктор
        включает все поля

    2 конструктор
        запрашивает только manufacturer, mark, weight
        вызывает 1 конструктор
        педает в него все свои аргументы
        и дополняет null номером и черным цветом

    создать 2 объекта класса
    используя разные конструторы
    и вывести их в консоль
     */

    public static void main(String[] args)
    {
        /*Book book1 = new Book("test title", "test author", 1800);
        Book book2 = new Book();

        System.out.println(book1);
        System.out.println(book2);*/

        Car car1 = new Car("киа", "рио", 3000, "голубой", "efrefrfe");
        Car car2 = new Car("мерседес", "s777", 4000);

        System.out.println(car1);
        System.out.println(car2);
    }
}

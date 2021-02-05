package ru.pa4ok.app;

import ru.pa4ok.test.TestClass;

public class Main
{
    /*
    ALT-ENTER - автоматический импорт либо вывод контекстного меню устранения ошибки
     */

    /*
    все поля приватные + геттеры и сеттеры
    +кастомный метод toString

    Animal
    - String title //название конкртеного вида
    - String type  //вид, аля млекопитающее и тд
    - int legCount
    - int age
    - boolean hunter

    2 конструктора
        1 - со всеми 5 полями

        2 - принимает только title и type
            вызывает первый конструктор
            передает принятые title и type
            а также legCount = 4, age = 1, hunter = false

    создать несколько объектов класса через разные конструкторы
    и вывести в консоль

     */

    public static void main(String[] args)
    {
        /*Book book = new Book("weghboewg", "puskin", 1725);
        Book book1 = new Book();

        System.out.println(book);
        System.out.println(book1);*/

        Animal animal = new Animal("пингвин", "птица", 2, 3, true);
        System.out.println(animal);

        Animal animal1 = new Animal("Жираф", "млекопитающее");
        System.out.println(animal1);
    }
}

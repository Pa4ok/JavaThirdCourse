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

    Book
    - static int idCounter 
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

        TestClass.intRandom();
        System.out.println(TestClass.i);
    }
}

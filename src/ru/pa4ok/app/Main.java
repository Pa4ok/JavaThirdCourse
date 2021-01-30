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

    Utils
    - private static Random rand = new Random();

    public static int getRandIntWithBounds(int min, int max)
        вернет рандомное число от min до max

    public static String revertSting(String s)
        возвращает строку s задом наперед


    написать класс Utils и протестить его методы

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

        System.out.println(Utils.getRandIntWithBounds(50, 100));
        System.out.println(Utils.revertSting("abcdefg"));
    }
}

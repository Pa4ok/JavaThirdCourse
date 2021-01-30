package ru.pa4ok.app;

    /*
    ALT-INSERT - вызов меню генерации (можно через ПКМ)
    ALT-ENTER - вывов меню исправления ошибки (нужно перевести курсор на нее)
    CTRL-SPACE - вызов контекстного меню автопродолжения кода
    CTRL-ALT-L - форматирование кода (стиль)
     */

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
        TestClass testClass = new TestClass();

        //хороший пример использования статики - это класс Math
        System.out.println(Math.sin(Math.PI / 2));
    }
}

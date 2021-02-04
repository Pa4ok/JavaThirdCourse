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
    все поля приватные + геттеры и сеттеры + toString()

    MathUtils
    public static SquareEquationRoot calculateQuadraticEquation(SquareEquation squareEquation)

    SquareEquation //класс описывающий квадратное уравнение (коэфиценты)
    - int a //коэфицент x^2
    - int b //коэфицент x
    - int c //коэфицент свободного члена

    SquareEquationRoot //класс описывающий решение квадратного уравнения
    - double x1 //1 корень
    - double x2 //2 корень
    - boolean noRoots //указатель на то что корней нет
    - 2 конструктора
        1 - принимает x1 и x2, выставляет noRoots на false
        2 - не принимает аргументов
            x1 и x2 выставляются нулями
            noRoots выставляется true

    реализовать все классы и протестировать
     */

    public static void main(String[] args)
    {
        //TestClass testClass = new TestClass();

        //хороший пример использования статики - это класс Math
        System.out.println(Math.sin(Math.PI / 2));

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

        /*Book book1 = new Book("первая", "автор1", 300);
        Book book2 = new Book("вторая", "автор2", 100);
        Book book3 = new Book("третья", "автор3", 545);

        Library library = new Library("ewgbiuhfwefew", 3);
        System.out.println(library);
        library.addBook(book1);
        book2.setId(-1);
        library.addBook(book2);
        book3.setId(4);
        library.addBook(book3);
        System.out.println(library);*/
    }
}

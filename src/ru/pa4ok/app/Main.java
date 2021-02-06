package ru.pa4ok.app;

public class Main
{
    /*
    ALT-ENTER - автоматический импорт либо вывод контекстного меню устранения ошибки
    ALT-INSERT - вызов меню генерации

    все поля приватные + геттеры и сеттеры + toString()

    MathUtils
    - public static QuadraticEquationRoot calculateQuadraticEquation(QuadraticEquation equation)
        принимает объект который описывает коэфиценты кв. уравнения
        возврщает объект описывающий его корни
        если корней нет, то оставляет x1 и x2 нулями, а rootCount = 0

    QuadraticEquation
    - double a //коэфицент x^2
    - double b //x^1
    - double c

    QuadraticEquationRoot // (2 корня x1 x2 2) (1 корень x1 0 1) (0 корней 0 0 0)
    - double x1
    - double x2
    - int rootCount //количество корней, если 1 корень, то используется только x1

     */

    public static void main(String[] args)
    {
        /*TestClass testClass = new TestClass();
        System.out.println(testClass.testNonStatic);

        System.out.println(TestClass.staticString);*/

        /*TestClass testClass = new TestClass();
        testClass.nonStaticMethod();

        TestClass.testStaticMethod();*/

        //System.out.println(Math.sin(Math.PI / 2));

        System.out.println(MathUtils.calculateQuadraticEquation(new QuadraticEquation(1, -70, 600)));
    }
}

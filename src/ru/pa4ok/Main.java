package ru.pa4ok;

public class Main
{
    /*
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

    QuadraticEquationRoot
    - double x1
    - double x2
    - int rootCount //количество корней, если 1 корень, то используется только x1

    создать все классы, протестировать статичный метод
     */

    public static void main(String[] args)
    {
        /*TestClass obj = new TestClass();
        System.out.println(obj.nonStaticField);
        obj.test();

        System.out.println(TestClass.staticField);
        TestClass.testStatic();

        TestClass.staticField = "new static value";
        System.out.println(TestClass.staticField);*/

        /*System.out.println(Math.sin(Math.PI / 2));

        TestClass obj = new TestClass();
        TestClass obj1 = new TestClass();
        TestClass obj2 = new TestClass();
        TestClass obj3 = new TestClass();
        TestClass obj4 = new TestClass();*/

        System.out.println(
                MathUtils.calculateQuadraticEquation(
                        new QuadraticEquation(1, 4, -5)
                )
        );
    }
}

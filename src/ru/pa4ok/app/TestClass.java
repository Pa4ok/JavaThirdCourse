package ru.pa4ok.app;

/*
    статика не привязан к объектам классов
    инициализируется во время 1 обращения к классу
 */
public class TestClass
{
    public static String staticString = "onfoefew";

    static
    {
        System.out.println("init static block");
    }

    public String testNonStatic = "iewfiefef";

    public TestClass() {
    }

    public void nonStaticMethod()
    {
        //из обычных методов спокойно можно обращаться к статическим
        staticString += "33";

        System.out.println("nonStaticMethod");
    }

    public static void testStaticMethod()
    {
        //нельзя из статики обратится к обычной переменной или методу
        //для них нужен объект, которого попросту нет
        //testNonStatic = "4334342";

        System.out.println("testStaticMethod");
    }
}

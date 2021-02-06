package ru.pa4ok;

public class TestClass
{
    public static String staticField = "staticField";

    public String nonStaticField = "nonStaticField";

    /*
    статичный блок
    инициализиирует, как и вся статика при 1 обращении к классу
     */
    static
    {
        System.out.println("init static block");
    }

    public TestClass()
    {

    }

    public void test()
    {
        System.out.println("non static test");

        staticField = "hello from non static test";
    }

    public static void testStatic()
    {
        //из статики нельзя обратиться к обычным полям и методам
        //так как они существуют только в объекте, а его нет
        //nonStaticField = "4324";

        staticField = "static test";

        System.out.println("static test");
    }
}

package ru.pa4ok;

public class Book
{
    /*
    статика инициализируется во время первого обращения к классу
     */

    public static int intStatic = 5;

    static
    {
        System.out.println("oefoehfgoefwhwe");
    }

    public int intBase = 10;

    public Book()
    {

    }

    public String testBase()
    {
        intStatic = 20;

        return "base";
    }

    public static String testStatic()
    {
        //так как метод не привязан к объету
        //нельзя обратится к нестатичным элементам
        //тк для них нужен объект
        //intBase = 0;

        return "static";
    }

    public static void testStatic2(Book book)
    {
        book.intBase = 10;
    }
}

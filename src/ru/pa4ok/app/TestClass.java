package ru.pa4ok.app;

import java.util.Random;

public class TestClass
{
    /*
    статичные поля и методы не привязаны к объектам класса
    они оницилиазируются вместе с самим классов как типом данных
    при его 1 использовании

    из статики нельзя обратится к обычнм функциям и полям класса
    потому что для них нужен объект этого класса

    обращаться к статике из других классов следует через имя класса
    к примеру TestClass.intRandom()
     */

    //статичная переменная
    public static int i = intRandom();

    //статичный блок, можно писать просто код в нем
    static
    {
        System.out.println("static method");
    }

    private String title;

    public TestClass(String title)
    {
        //из обычных же метов спокойно можно обратиться к статике
        i *= 10;

        this.title = title;
    }

    //статичная функция
    public static int intRandom()
    {
        return new Random().nextInt();
    }
}

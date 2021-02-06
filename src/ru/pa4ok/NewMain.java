package ru.pa4ok;

public class NewMain
{
    public static void main(String[] args)
    {

    }
}

/*
    final переменная объявляется 1 раз
    и больше ее перезаписать нельзя
 */

class Test
{
    public final String testString;

    //объявить ее можно либо в конструкторе
    public Test() {
        this.testString = "ouewfhef";
    }

    public void testMethod()
    {
        //изменить final переменную уже нельзя
        //testString = "433433";
    }
}

class Test2
{
    //либо сразу в поле класса
    public final String testString = "ouewfhef";;

    public Test2() {
    }
}

class Test3
{
    //для статики тоже самое
    //либо объявить сразу
    public static final String s = "oweofewjew";
}

class Test4
{
    public static final String s;

    //либо в статичном блоке
    static {
        s = "oweofewjew";
    }
}




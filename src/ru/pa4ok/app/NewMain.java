package ru.pa4ok.app;

import ru.pa4ok.app.pc.CPU;

import java.util.Scanner;

public class NewMain
{
    public static void main(String[] args)
    {
        //если это переменная в методе, то она должна быть инициализирована сразу
        final int i = 5;
        //i = 4; //перезаписать ее уже не получится


        //----------------------------------------------------------------------------------

        /*String s = "434";
        int value = Integer.parseInt(s);
        Boolean.parseBoolean(...);
        Double.parseDouble(...);
        Float.parseFloat(...);*/


        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        System.out.println(a * 5 + 100);

        float f = Float.parseFloat(scanner.nextLine());
        System.out.println(a * f * 50);

        System.out.printf("ВВедите что-то: ");
        int c = Integer.parseInt(scanner.nextLine());
        System.out.println("result = " + c * 1000);

    }
}

class TestClass
{
    //если это поле класс, можно инициализировать в конструкторе
    private final String test;

    public TestClass(String test) {
        this.test = test;
    }

    //обязательная инициализация во всех конструкторах
    /*public TestClass() {
    }*/
}

class TestClass2
{
    //также можно инициализировать сразу
    private final String test = "5435454";

    public TestClass2() {
    }

    public String getTest() {
        return test;
    }
}

class TestClass3
{
    //инициализируем статичную переменную разу
    public static final String test = "efhwofe";
}

class TestClass4
{
    //инициализируем в статичном блоке класса
    public static final String test;

    static {
        test = "53345435";
    }
}

class TestClass5
{
    public final CPU cpu = new CPU("343", 16, 3.6, 5.0);

    public TestClass5() {
    }

    public void test()
    {
        //нельзя перезаписать целиком
        //cpu = new CPU("tgrgtrgtrtrg3", 16, 3.6, 5.0);;

        //но можно изменять внутренние свойства
        cpu.setCores(8);
        cpu.setTitle("4repogjreog");
    }
}

package ru.pa4ok.app;

public class Singleton
{
    /*
    паттер/шаблон синглтон + инстанцирование
    целью которых является, чтобы в программе был только
    1 объект класса

    есть несколько вариантов

    1
    так как сделано сейчас, приватный конструктор с методом
    который проверяет инициалировано ли статичное поле

    2
    просто статичный геттер и статичное поле
    которое сразу инициализируется
    private static Singleton instance = new Singleton(...);
     */

    //статичное поле с типом данных класса
    private static Singleton instance;

    private String test;
    private int a;

    //приватный конструктор
    private Singleton(String test, int a) {
        this.test = test;
        this.a = a;
    }

    public static Singleton getInstance()
    {
        if(instance == null) {
            instance = new Singleton("test", 12);
        }

        return instance;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "test='" + test + '\'' +
                ", a=" + a +
                '}';
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

package ru.pa4ok;

import java.util.Random;

/*
    у абстрактно класса нельзя напрямую создать объекты
    у него могут быть абстрактные функции без тела
    при его наследовании обычным необходимо реализовать все абстр. функции
    в остальном это такие же классы, с полями, методами и тд
 */
public abstract class TestAbstract
{
    private final Random rand = new Random();

    private String a;

    public TestAbstract(String a) {
        this.a = a;
    }

    public abstract void test();

    public int getRandInt()
    {
        return rand.nextInt();
    }
}

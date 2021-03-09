package ru.pa4ok.app;

import ru.pa4ok.app.school.TestAbstract;

/*
    2 варианта при наследовании абстрактного класса
    либо реализовать (переопределить) все абстрактные функции
    либо сделать абстрактным класс наследник
 */
public class SecondClass extends TestAbstract
{
    public SecondClass(int i, String s) {
        super(i, s);
    }

    @Override
    public void test() {
        System.out.println("test");
    }
}

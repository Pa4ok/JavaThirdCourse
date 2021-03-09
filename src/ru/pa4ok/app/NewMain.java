package ru.pa4ok.app;

import ru.pa4ok.app.school.TestAbstract;

import java.sql.Connection;

public class NewMain
{
    public static void main(String[] args)
    {
        //нельзя напрямую создать объект абстрактного класса
        ///TestAbstract test = new TestAbstract(333, "feefwf");

        //мы можем унаследовать абстрактный класс
        //реализовать все его функции и создавать уже его объект
        SecondClass secondClass = new SecondClass(555, "fefefefe");
        TestAbstract testAbstract = new SecondClass(4554, "poko");

        //анонимный класс
        //данная реализация абстрактного класса
        //будет существовать только в рамках этого объекта
        TestAbstract testAbstract1 = new TestAbstract(555, "hthtth") {
            @Override
            public void test() {
                System.out.println("feefeeff");
            }
        };

        sendAction(new Action() {
            @Override
            public void action() {
                //
            }
        });
    }

    private static void sendAction(Action a)
    {
        //
    }
}

abstract class Action
{
    public abstract void action();
}
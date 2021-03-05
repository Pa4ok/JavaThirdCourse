package ru.pa4ok.app;

import java.util.Random;

//у интерфейса нет конструктора
//у интрефейса не может быть не инициалированных сразу полей
public interface IWorker
{
    public int i = 5;
    public static String s = "434434";

    //в интерфейсе все функции по умолчанию абстрактные
    public void work();

    //чтобы разместить не абстрактную функцию в интерфейсе
    //ее нужно пометить модификатором default
    public default int getRandInt()
    {
        return new Random().nextInt();
    }
}

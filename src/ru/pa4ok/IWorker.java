package ru.pa4ok;

import java.util.Random;

//у интерфейсов не может быть полей
//у интейсов нет настраиваемых конструторов
public interface IWorker
{
    //в интерфейсах все функции по умолчанию абстрактные
    public void work();

    //чтобы разместить уже реализованную функцию
    //ее необходимо пометить модифатором default
    public default int getRandInt() {
        return new Random().nextInt(100);
    }

    public void test();
}

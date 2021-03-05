package ru.pa4ok.app;

import java.sql.Connection;

//интрейфейс может унаследовать интерфейс или несколько
public interface ISuperWorker extends IWorker
{
    //при наследовании интрефейсов можно перевести абстрактную функцию в дефолтную
    @Override
    public default void work()
    {
        System.out.println("ffefeefef");
    }

    //и наоборот
    public int getRandInt();
}

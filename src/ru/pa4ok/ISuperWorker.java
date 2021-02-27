package ru.pa4ok;

//интерфейс может унаследовать интерфейс или несколько
//мы можем переопределять функции унаследованного интерфейса
//можем перевести абстрактную функцию в дефолтную
//или дефолтную в абстрактную
public interface ISuperWorker extends IWorker, ISleeper
{
    @Override
    public default void work() {
        System.out.println(";fewjfew");
    }

    public int getRandInt();
}

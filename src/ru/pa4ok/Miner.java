package ru.pa4ok;

//класс Miner реализует интерфес IWorker
public class Miner extends Human implements IWorker, IEatenEntity
{
    public Miner(String name) {
        super(name);
    }

    @Override
    public void work()
    {
        System.out.println("копает шахту");
    }

    public void aa()
    {
        //в интерфейсе можно разместить поля
        //но их никак нельзя будет изменить
        //i = 10;
        //s = "4444";
    }

    @Override
    public void eat()
    {
        System.out.println("есть тушенку");
    }
}

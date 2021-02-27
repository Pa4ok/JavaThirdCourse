package ru.pa4ok;

//1 класс может унаследовать только 1 класс, но сколько угодно интерфейсов
public class Builder extends Human implements IWorker, ISleeper
{
    public Builder(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("строит дом");
    }

    @Override
    public void sleep() {
        System.out.println("спит");
    }

    @Override
    public void test() {

    }
}

package ru.pa4ok;

public abstract class AbstractHuman
{
    protected int i;

    public AbstractHuman(int i) {
        this.i = i;
    }

    //астрактная функция без тела
    //по факту - заготовка
    public abstract void testAbstract();

    public void testNonAbstract()
    {
        System.out.println("testNonAbstract");
    }
}

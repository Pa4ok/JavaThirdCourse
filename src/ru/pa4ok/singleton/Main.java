package ru.pa4ok.singleton;

public class Main
{
    private static Main instance;

    //обычные поля...
    //...
    //...

    public Main()
    {
        instance = this;
    }

    public static void main(String[] args)
    {
        new Main();
    }

    public static Main getInstance() {
        return instance;
    }
}

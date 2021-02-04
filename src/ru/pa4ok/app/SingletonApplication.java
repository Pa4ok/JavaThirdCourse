package ru.pa4ok.app;

public class SingletonApplication
{
    private static SingletonApplication instance;

    private String title;
    private String config;
    
    /*
    чтобы обратится к нестатичным полям класса из других классов
    можно использовать статичный геттер

    SingletonApplication.getInstance().title
    SingletonApplication.getInstance().config

     */

    private SingletonApplication()
    {
        //...
    }

    public static void main(String[] args)
    {
        instance = new SingletonApplication();
    }

    public static SingletonApplication getInstance() {
        return instance;
    }
}

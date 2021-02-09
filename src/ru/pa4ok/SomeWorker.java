package ru.pa4ok;

public class SomeWorker
{
    public void work()
    {
        System.out.println(Application.getInstance().getSomeConfigValue());
    }
}

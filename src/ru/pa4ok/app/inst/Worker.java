package ru.pa4ok.app.inst;

public class Worker
{
    public static void work()
    {
        System.out.println("work" + Application.getInstance().getConfig());
    }
}

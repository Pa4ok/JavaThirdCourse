package ru.pa4ok;

import java.util.Random;

public abstract class Worker
{
    public abstract void work();

    public int getRandInt() {
        return new Random().nextInt(100);
    }
}

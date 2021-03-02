package ru.pa4ok.task;

public interface IPredator
{
    public default void hunt(EntityLiving entityLiving)
    {
        System.out.println(this + " съел " + entityLiving);
    }
}

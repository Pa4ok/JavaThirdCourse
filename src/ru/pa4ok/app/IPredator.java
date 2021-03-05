package ru.pa4ok.app;

public interface IPredator
{
    public default void hunt(EntityLiving entityLiving)
    {
        //System.out.println(this + " ест " + entityLiving);

        if(this instanceof EntityLiving) {
            System.out.println(((EntityLiving)this).getTitle() + " ест " + entityLiving.getTitle());
        } else {
            System.out.println(this + " ест " + entityLiving);
        }
    }
}
